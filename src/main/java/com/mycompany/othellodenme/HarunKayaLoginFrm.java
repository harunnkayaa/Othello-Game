/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othellodenme;

import javax.swing.JOptionPane;


/**
 *
 * @author harnk
 */
public class HarunKayaLoginFrm extends javax.swing.JFrame {

    private int loggedInPlayers = 0;

    /**
     * Creates new form LoginFrm
     */
    public HarunKayaLoginFrm() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_loginEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_loginPassword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OTHELLO GAME~LOGİN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 2, 24))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Email");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 109, 96, 25));
        jPanel1.add(txt_loginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 110, 243, -1));

        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 155, -1, -1));
        jPanel1.add(txt_loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 152, 243, -1));

        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 237, 116, 50));

        btn_register.setText("REGISTER");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 237, 116, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
   
        // Kullanıcının girdiği e-posta ve şifreyi al
        String email = txt_loginEmail.getText();
        String password = txt_loginPassword.getText();
        // Kullanıcı kimliğini Data sınıfının Login metodu ile kontrol et
        int playerId = HarunKayaData.Login(email, password);
        // Eğer kullanıcı kimliği geçerli ve oyuncu zaten oturum açmamışsa
        if (playerId != -1 && !HarunKayaData.loggedInPlayerIds.contains(playerId)) {
            // Kullanıcıyı oturum açan oyuncular listesine ekle
            HarunKayaData.loggedInPlayerIds.add(playerId);

            JOptionPane.showMessageDialog(rootPane, "Giriş başarılı. Oyuncu " + HarunKayaData.loggedInPlayerIds.size() + " oturum açtı.");
            // Eğer iki oyuncu da oturum açtıysa
            if (HarunKayaData.loggedInPlayerIds.size() == 2) {
                // Yeni bir Game nesnesi oluştur ve görünür yap
                HarunKayaGame oyun = new HarunKayaGame();
                oyun.setVisible(true);
                dispose(); // Ana ekrani kapat
            }
        } else {
            // Eğer kullanıcı kimliği geçersizse
            if (playerId == -1) {
                JOptionPane.showMessageDialog(rootPane, "Hatalı e-posta veya şifre.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "2.oyuncu farklı kullanıcı olmalıdır.");
            }
        }

        HarunKayaData.WritePlayersListToFile();

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        //RegisterFrm sınıfından bir nesne oluşturulur ve kayıt formu görünür hale getirilir. Giriş formu, kayıt formu görünür olduğunda gizlenir.
        this.setVisible(false);
        HarunKayaRegisterFrm regıisterFrm = new HarunKayaRegisterFrm(this);
        regıisterFrm.setVisible(true);
    }//GEN-LAST:event_btn_registerActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_loginEmail;
    private javax.swing.JPasswordField txt_loginPassword;
    // End of variables declaration//GEN-END:variables
}