package com.salocod.simons;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class SimonsGame {

    private int[] sequencia;
    private int[] seqJogador;
    private int contJogador, dificuldade, nivel;
    private JButton btGreen, btRed, btYellow, btBlue;
    private JLabel jlNivel;
    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public SimonsGame(int dificuldade, JButton btGreen, JButton btRed, JButton btYellow, JButton btBlue, JLabel jlNivel) {
        this.dificuldade = dificuldade;
        this.contJogador = 0;
        this.nivel = 1;
        this.sequencia = new int[determinarSequencia()];
        this.seqJogador = new int[sequencia.length];
        this.btGreen = btGreen;
        this.btRed = btRed;
        this.btYellow = btYellow;
        this.btBlue = btBlue;
        this.jlNivel = jlNivel;
        gerarSequencia();
    }

    public int determinarSequencia() {
        return switch (dificuldade) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            case 4 -> 40;
            case 5 -> 50;
            default -> 0;
        };
    }

    private void gerarSequencia() {
        Random random = new Random();
        IntStream.range(0, sequencia.length).forEach(i -> sequencia[i] = random.nextInt(1, 5));
    }

    private Color getColor(int num) {
        return switch(num) {
            case 1 -> new Color(0, 102, 0);
            case 2 -> Color.RED;
            case 3 -> Color.ORANGE;
            case 4 -> new Color(51, 51, 255);
            default -> null;
        };
    }

    public void adicionaSequencia(JButton button, int num) {
            seqJogador[contJogador] = num;
            contJogador++;
            piscarButton(button, num);
    }

    public void startGame() {
        while (nivel <= sequencia.length && areEqualUntilIndex()) {
            piscar();
            aguardarJogada();
            if (!areEqualUntilIndex()) {
                JOptionPane.showMessageDialog(null, "Voce errou!");
                executorService.shutdown();
                break;
            }
            nivel++;
            jlNivel.setText("Nivel: " + nivel + "/" + determinarSequencia());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (nivel > sequencia.length) {
            JOptionPane.showMessageDialog(null, "Voce venceu!");
            executorService.shutdown();
        }
    }
    
    private void aguardarJogada() {
        contJogador = 0;
        btGreen.setEnabled(true);
        btRed.setEnabled(true);
        btYellow.setEnabled(true);
        btBlue.setEnabled(true);
        while (contJogador < nivel) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        btGreen.setEnabled(false);
        btRed.setEnabled(false);
        btYellow.setEnabled(false);
        btBlue.setEnabled(false);
    }
    

    private void piscar() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            private int count = 0;
    
            @Override
            public void run() {
                btGreen.setEnabled(false);
                btRed.setEnabled(false);
                btYellow.setEnabled(false);
                btBlue.setEnabled(false);
                if (count < nivel) {
                    switch (sequencia[count]) {
                        case 1 -> piscarButton(btGreen ,1);
                        case 2 -> piscarButton(btRed, 2);
                        case 3 -> piscarButton(btYellow, 3);
                        case 4 -> piscarButton(btBlue, 4);
                    }
                    count++;
                } else {
                    timer.cancel();
                    btGreen.setEnabled(true);
                    btRed.setEnabled(true);
                    btYellow.setEnabled(true);
                    btBlue.setEnabled(true);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 500);
    }
    
    private void flashButton(JButton button, Color originalColor, Color darkColor) {
        button.setBackground(darkColor);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> {
            SwingUtilities.invokeLater(() -> button.setBackground(originalColor));
        }, 400, TimeUnit.MILLISECONDS);
        executor.shutdown();
    }
    
    private void piscarButton(JButton botao, int num) {
        double factorDark = 0.2;
        playSound(num);
        executorService.schedule(() -> {
            SwingUtilities.invokeLater(() -> {
                flashButton(botao, getColor(num),
                        new Color((int) (getColor(num).getRed() * factorDark),
                                (int) (getColor(num).getGreen() * factorDark),
                                (int) (getColor(num).getBlue() * factorDark)));
            });
        }, 0, TimeUnit.MILLISECONDS);
    }
    

    private boolean areEqualUntilIndex() {
        return Arrays.mismatch(sequencia, 0, contJogador, seqJogador, 0, contJogador) == -1;
    }

    private void playSound(int numero) {
        switch (numero) {
            case 1 -> playSoundBack("simonSound1.mp3");
            case 2 -> playSoundBack("simonSound2.mp3");
            case 3 -> playSoundBack("simonSound3.mp3");
            case 4 -> playSoundBack("simonSound4.mp3");
        }
    }

    private void playSoundBack(String soundFile) {
        try {
            InputStream is = new FileInputStream("C:\\Users\\nico\\Desktop\\Simons\\src\\main\\java\\Sounds\\" + soundFile);
            Player player = new Player(is);
            new Thread(() -> {
                try {
                    player.play();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printa() {
        System.out.println(IntStream.range(0, sequencia.length)
                    .mapToObj(i -> String.valueOf(sequencia[i]))
                    .reduce("", (s1, s2) -> s1 + s2) + System.lineSeparator() +
                    IntStream.range(0, contJogador)
                    .mapToObj(j -> String.valueOf(seqJogador[j]))
                    .reduce("", (s1, s2) -> s1 + s2));
    }
}
