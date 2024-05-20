package simons;

import java.awt.EventQueue;

import javax.swing.*;

public class Simons extends JFrame{

    private SimonsGame sim;
    
    public Simons() {
        initComponents();
        setTitle("Simons Game - Salocod");
        setResizable(false);
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcoes = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        jpOpcoes = new javax.swing.JPanel();
        jbJogar = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        FacilJRB = new javax.swing.JRadioButton();
        MedioJRB = new javax.swing.JRadioButton();
        DificilJRB = new javax.swing.JRadioButton();
        HardCoreJRB = new javax.swing.JRadioButton();
        ImpossivelJRB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jpJogo = new javax.swing.JPanel();
        btRed = new javax.swing.JButton();
        btGreen = new javax.swing.JButton();
        btYellow = new javax.swing.JButton();
        btBlue = new javax.swing.JButton();
        jlNivel = new javax.swing.JLabel();

        FacilJRB.setActionCommand("1");
        MedioJRB.setActionCommand("2");
        DificilJRB.setActionCommand("3");
        HardCoreJRB.setActionCommand("4");
        ImpossivelJRB.setActionCommand("5");
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new java.awt.CardLayout());

        jbJogar.setText("Jogar");
        jbJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJogarActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jlTitulo.setText("GENIUS");

        buttonGroupOpcoes.add(FacilJRB);
        FacilJRB.setText("Facil");

        buttonGroupOpcoes.add(MedioJRB);
        MedioJRB.setText("Medio");

        buttonGroupOpcoes.add(DificilJRB);
        DificilJRB.setText("Dificil");

        buttonGroupOpcoes.add(HardCoreJRB);
        HardCoreJRB.setText("HardCore");

        buttonGroupOpcoes.add(ImpossivelJRB);
        ImpossivelJRB.setText("Impossivel");

        jLabel1.setText("Selecione uma dificuldade:");

        javax.swing.GroupLayout jpOpcoesLayout = new javax.swing.GroupLayout(jpOpcoes);
        jpOpcoes.setLayout(jpOpcoesLayout);
        jpOpcoesLayout.setHorizontalGroup(
            jpOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOpcoesLayout.createSequentialGroup()
                .addGroup(jpOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOpcoesLayout.createSequentialGroup()
                        .addGroup(jpOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpOpcoesLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jbJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpOpcoesLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jpOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOpcoesLayout.createSequentialGroup()
                                        .addComponent(jlTitulo)
                                        .addGap(14, 14, 14)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpOpcoesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(FacilJRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MedioJRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DificilJRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HardCoreJRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImpossivelJRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpOpcoesLayout.setVerticalGroup(
            jpOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOpcoesLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FacilJRB)
                    .addComponent(MedioJRB)
                    .addComponent(DificilJRB)
                    .addComponent(HardCoreJRB)
                    .addComponent(ImpossivelJRB))
                .addGap(18, 18, 18)
                .addComponent(jbJogar)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        background.add(jpOpcoes, "card3");

        jpJogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btRed.setBackground(java.awt.Color.red);
        btRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRedActionPerformed(evt);
            }
        });

        btGreen.setBackground(new java.awt.Color(0, 102, 0));
        btGreen.setForeground(new java.awt.Color(0, 102, 0));
        btGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGreenActionPerformed(evt);
            }
        });

        btYellow.setBackground(java.awt.Color.orange);
        btYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYellowActionPerformed(evt);
            }
        });

        btBlue.setBackground(new java.awt.Color(51, 51, 255));
        btBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBlueActionPerformed(evt);
            }
        });

        jlNivel.setText("Nivel: 1");

        javax.swing.GroupLayout jpJogoLayout = new javax.swing.GroupLayout(jpJogo);
        jpJogo.setLayout(jpJogoLayout);
        jpJogoLayout.setHorizontalGroup(
            jpJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpJogoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jpJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btYellow, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btGreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jpJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBlue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(btRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpJogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlNivel)
                .addGap(188, 188, 188))
        );
        jpJogoLayout.setVerticalGroup(
            jpJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpJogoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlNivel)
                .addGap(34, 34, 34)
                .addGroup(jpJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btGreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jpJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(btYellow, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        background.add(jpJogo, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGreenActionPerformed
        sim.adicionaSequencia(btGreen, 1);
    }//GEN-LAST:event_btGreenActionPerformed

    private void btRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRedActionPerformed
        sim.adicionaSequencia(btRed, 2);
    }//GEN-LAST:event_btRedActionPerformed

    private void btYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYellowActionPerformed
        sim.adicionaSequencia(btYellow, 3);
    }//GEN-LAST:event_btYellowActionPerformed

    private void btBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBlueActionPerformed
        sim.adicionaSequencia(btBlue, 4);
    }//GEN-LAST:event_btBlueActionPerformed

    private void jbJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJogarActionPerformed
        jpOpcoes.setVisible(false);
        jpJogo.setVisible(true);
        sim = new SimonsGame(Integer.parseUnsignedInt(buttonGroupOpcoes.getSelection().getActionCommand()), btGreen, btRed, btYellow, btBlue, jlNivel);
        jlNivel.setText("Nivel: 1/" + sim.determinarSequencia());
        new Thread(() -> sim.startGame()).start();
    }//GEN-LAST:event_jbJogarActionPerformed
    
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DificilJRB;
    private javax.swing.JRadioButton FacilJRB;
    private javax.swing.JRadioButton HardCoreJRB;
    private javax.swing.JRadioButton ImpossivelJRB;
    private javax.swing.JRadioButton MedioJRB;
    private javax.swing.JPanel background;
    private javax.swing.JButton btBlue;
    private javax.swing.JButton btGreen;
    private javax.swing.JButton btRed;
    private javax.swing.JButton btYellow;
    private javax.swing.ButtonGroup buttonGroupOpcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbJogar;
    private javax.swing.JLabel jlNivel;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpJogo;
    private javax.swing.JPanel jpOpcoes;
    // End of variables declaration//GEN-END:variables
}
