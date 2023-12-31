/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othellodenme;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author harnk
 */
public class HarunKayaRegisterFrm extends javax.swing.JFrame {

    JFrame parentFrame;
    
  
// Kayıt formunu başlatan ve ana pencereyi depolayan parametreli yapılandırıcı
    public HarunKayaRegisterFrm(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
    }
//LoginFrm lgnFrm = new LoginFrm();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_grpGender = new javax.swing.ButtonGroup();
        pnl_register = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txt_nameSurname = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        psw_field = new javax.swing.JPasswordField();
        frmtd_txtTelephone = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_addressArea = new javax.swing.JTextArea();
        btn_register = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        chc_ısSmoker = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_register.setBackground(new java.awt.Color(89, 120, 225));
        pnl_register.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OTHELLO GAME ~ REGISTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 2, 24))); // NOI18N

        jLabel1.setText("Name Surname");

        jLabel2.setText("Email");

        jLabel3.setText("Telephone");

        jLabel4.setText("Password");

        jLabel6.setText("Gender");

        btn_grpGender.add(rbtn_male);
        rbtn_male.setText("Male");

        btn_grpGender.add(rbtn_female);
        rbtn_female.setText("Female");

        jLabel7.setText("Address");

        txt_addressArea.setColumns(20);
        txt_addressArea.setRows(5);
        jScrollPane1.setViewportView(txt_addressArea);

        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel5.setText("Is Smoker");

        chc_ısSmoker.setText("Is Smoker");

        javax.swing.GroupLayout pnl_registerLayout = new javax.swing.GroupLayout(pnl_register);
        pnl_register.setLayout(pnl_registerLayout);
        pnl_registerLayout.setHorizontalGroup(
            pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registerLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_registerLayout.createSequentialGroup()
                        .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_registerLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_registerLayout.createSequentialGroup()
                                        .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_registerLayout.createSequentialGroup()
                                                .addComponent(rbtn_male)
                                                .addGap(70, 70, 70)
                                                .addComponent(rbtn_female))
                                            .addComponent(chc_ısSmoker, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56))
                                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(frmtd_txtTelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(psw_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nameSurname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_registerLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_registerLayout.createSequentialGroup()
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pnl_registerLayout.setVerticalGroup(
            pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registerLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(frmtd_txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(psw_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtn_male)
                    .addComponent(rbtn_female))
                .addGap(18, 18, 18)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chc_ısSmoker))
                .addGap(27, 27, 27)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(pnl_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here: 
        // kayıt esnasında mail için özel form oluşturma(regex ile)
        Pattern pattern = Pattern.compile("^([a-z]+\\w*){3,}@{1}((gmail)|(hotmail)){1}(.com){1}$");
        Matcher matcher =pattern.matcher(txt_email.getText());
        if (!matcher.find()) {
           JOptionPane.showMessageDialog(this, "Mail formatınız 'abcd@gmail.com' şeklinde olamlıdır.\n@'den önceki kısım en az 4 karakterli olmalıdır, hotmail veya gmail kullanılabilir", "Mail formatı geçersidir!", HEIGHT);
        }
        /*pattern = Pattern.compile("^(\\d{2})\\d{10}$");
        matcher =pattern.matcher(frmtd_txtTelephone.getText());
        if (!matcher.find()) {
            JOptionPane.showMessageDialog(this, "Telefon numaranızı uygun formatta girmediniz, başına alan kodunu yazarak tekrar deneyiniz! ");
        }*/
        pattern = Pattern.compile("^([a-z]{7,})$");
        matcher =pattern.matcher(psw_field.getText());
       if (!matcher.find()) {
            JOptionPane.showMessageDialog(this, "Şifreniz en az 8 karakterli olmalı; rakam, sembol ve büyük harf içermemelidir.");
        }
       // Kullanıcıdan alınan verilerle yeni bir Players nesnesi oluşturma
        HarunKayaPlayers newp = new HarunKayaPlayers();
        newp.email = txt_email.getText();
        newp.nameSurname = txt_nameSurname.getText();
        String telephoneText = frmtd_txtTelephone.getText();
        /*
Integer.parseInt() metodunun boş bir dize ile çalıştırılması nedeniyle bir hata ortaya ortaya çıkmıştı. 
frmtd_txtTelephone.getText() sonucunda boş bir dize elde ettiğim için bu hatayı aldığımı öğrendim. 
Bu durumu düzeltmek için, Integer.parseInt() metodunu çalıştırmadan önce bir dize kontrolü yaptım.
         */
        newp.telephone = !telephoneText.isEmpty() ? Integer.parseInt(telephoneText) : 0;
        newp.password = psw_field.getText();
        newp.address = txt_addressArea.getText();

        if (rbtn_female.isSelected()) {
            newp.gender = HarunKayaPlayers.Gender.Famale;
        } if (rbtn_male.isSelected()) {
            newp.gender= HarunKayaPlayers.Gender.Male;
        }
        
        newp.isSmoker = chc_ısSmoker.isSelected();

        // Tüm alanların doldurulup doldurulmadığını kontrol etme
        if (newp.email.isEmpty() || newp.nameSurname.isEmpty() || newp.telephone == 0 || newp.password.isEmpty() || newp.address.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen tüm alanları doldurun.");
        } else {
            //Tüm alanlar doldurulduysa, yeni oyuncuyu veri tabanına ekleme ve mevcut pencereyi kapatma
            try {
                HarunKayaData.AddPerson(newp);
                
                this.parentFrame.setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }

    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
      
        // TODO add your handling code here:
        // Ana pencereyi görünür yapma ve mevcut kayıt penceresini kapatma
        this.parentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.ButtonGroup btn_grpGender;
    private javax.swing.JButton btn_register;
    private javax.swing.JCheckBox chc_ısSmoker;
    private javax.swing.JFormattedTextField frmtd_txtTelephone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_register;
    private javax.swing.JPasswordField psw_field;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTextArea txt_addressArea;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nameSurname;
    // End of variables declaration//GEN-END:variables
}
