/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.app;

import biblioteca.Biblioteca;
import java.awt.Color;

/**
 *
 * @author gustavoguerino
 */
public class JFrameCadastro extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadastro
     */
    Biblioteca bibliot;
    public JFrameCadastro(Biblioteca biblioteca) {
        bibliot = biblioteca;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelEnd = new javax.swing.JLabel();
        LabelCpf = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        CampoEnd = new javax.swing.JTextField();
        CampoCPF = new javax.swing.JTextField();
        CampoLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CampoSenha = new javax.swing.JPasswordField();
        CampoConfSenha = new javax.swing.JPasswordField();
        BotãoCadastro = new javax.swing.JButton();
        LabelConfSenha = new javax.swing.JLabel();
        LabelAvisos = new javax.swing.JLabel();
        Lavisos = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dyuthi", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SGB");

        jToggleButton1.setText("jToggleButton1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Dyuthi", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SGB");

        LabelNome.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        LabelNome.setText("Nome completo");

        LabelEnd.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        LabelEnd.setText("Endereço");

        LabelCpf.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        LabelCpf.setText("CPF (Somente Numeros)");

        LabelLogin.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        LabelLogin.setText("Login");

        LabelSenha.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        LabelSenha.setText("Senha");

        CampoNome.setBackground(new java.awt.Color(102, 102, 102));
        CampoNome.setForeground(new java.awt.Color(255, 255, 255));
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        CampoEnd.setBackground(new java.awt.Color(102, 102, 102));
        CampoEnd.setForeground(new java.awt.Color(255, 255, 255));
        CampoEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEndActionPerformed(evt);
            }
        });

        CampoCPF.setBackground(new java.awt.Color(102, 102, 102));
        CampoCPF.setForeground(new java.awt.Color(255, 255, 255));
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });

        CampoLogin.setBackground(new java.awt.Color(102, 102, 102));
        CampoLogin.setForeground(new java.awt.Color(255, 255, 255));
        CampoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLoginActionPerformed(evt);
            }
        });

        CampoSenha.setBackground(new java.awt.Color(102, 102, 102));
        CampoSenha.setForeground(new java.awt.Color(255, 255, 255));

        CampoConfSenha.setBackground(new java.awt.Color(102, 102, 102));
        CampoConfSenha.setForeground(new java.awt.Color(255, 255, 255));

        BotãoCadastro.setText("Cadastrar");
        BotãoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastroActionPerformed(evt);
            }
        });

        LabelConfSenha.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        LabelConfSenha.setText("Confirme sua senha");

        Lavisos.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoNome)
                            .addComponent(CampoEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelSenha)
                                    .addComponent(CampoConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelNome)
                                    .addComponent(LabelEnd)
                                    .addComponent(LabelCpf)
                                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelLogin)
                                    .addComponent(LabelConfSenha)
                                    .addComponent(Lavisos))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addComponent(BotãoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(LabelAvisos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lavisos)
                .addGap(10, 10, 10)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelConfSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(LabelAvisos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotãoCadastro)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
               
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEndActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoLoginActionPerformed

    private void BotãoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastroActionPerformed
       if(CampoNome.getText().length() < 10){
           Lavisos.setText("Nome deve possuir 10+ caracteres!");
       }
       else if(CampoEnd.getText().length() < 10){
           Lavisos.setText("Endereço deve possuir 10+ caracteres!");
       }
       else if(CampoCPF.getText().length() != 11){
           Lavisos.setText("CPF deve possuir exatamente 11 caracteres!");
       }
       else if(CampoLogin.getText().length() < 3){
           Lavisos.setText("Login deve possuir 3+ caracteres!");
       }
       else if(CampoSenha.getText().length() < 6){
           Lavisos.setText("Senha deve possuir 6+ caracteres!");
       }
       else{
           if(!CampoSenha.getText().equals(CampoConfSenha.getText())){
               Lavisos.setText("Confirmação de senha incorreta!");
               System.out.println(CampoSenha.getText());
           }
           else if(!bibliot.cadastrarUsuario(CampoNome.getText(), CampoEnd.getText(), 
                   CampoCPF.getText(), CampoLogin.getText(), CampoSenha.getText())){
               Lavisos.setText("Já existe um usuario cadastrado com o mesmo login!");
           }
           else{
               SistemaBiblioteca.teste();
               dispose();
           }
       }
    }//GEN-LAST:event_BotãoCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCadastro;
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JPasswordField CampoConfSenha;
    private javax.swing.JTextField CampoEnd;
    private javax.swing.JTextField CampoLogin;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel LabelAvisos;
    private javax.swing.JLabel LabelConfSenha;
    private javax.swing.JLabel LabelCpf;
    private javax.swing.JLabel LabelEnd;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel Lavisos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
