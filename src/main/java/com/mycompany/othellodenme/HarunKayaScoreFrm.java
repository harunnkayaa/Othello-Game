/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othellodenme;


import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author harnk
 */
public class HarunKayaScoreFrm extends javax.swing.JFrame {

    
    HarunKayaData data;

    public HarunKayaScoreFrm() {
        data = new HarunKayaData();
        initComponents();
        loadScores();
    }
 // Skorları yüklemek için kullanılan özel metod
    private void loadScores() {
        // Tablo modelini al ve satır sayısını sıfırla
        DefaultTableModel model = (DefaultTableModel) jtbl_skor.getModel();
        model.setRowCount(0);
        // "skorlar.txt" dosyasını okuyarak içindeki satırları tabloya ekle
        try (BufferedReader reader = new BufferedReader(new FileReader("skorlar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                model.addRow(new Object[]{line});
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_skorSil = new javax.swing.JButton();
        pnl_skor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_skor = new javax.swing.JTable();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_skorSil.setBackground(new java.awt.Color(153, 204, 255));
        btn_skorSil.setText("Skoru Sil");
        btn_skorSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_skorSilActionPerformed(evt);
            }
        });

        pnl_skor.setBackground(new java.awt.Color(204, 204, 255));

        jtbl_skor.setBackground(new java.awt.Color(153, 204, 255));
        jtbl_skor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Skorlar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_skor);

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_skorLayout = new javax.swing.GroupLayout(pnl_skor);
        pnl_skor.setLayout(pnl_skorLayout);
        pnl_skorLayout.setHorizontalGroup(
            pnl_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_skorLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_skorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancel)
                .addGap(39, 39, 39))
        );
        pnl_skorLayout.setVerticalGroup(
            pnl_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_skorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancel)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_skorSil, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnl_skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_skor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_skorSil, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
  
    private void btn_skorSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_skorSilActionPerformed
        // TODO add your handling code here:
         int selectedRow = jtbl_skor.getSelectedRow();
         // Eğer satır seçildiyse işleme devam et
    if (selectedRow != -1) {
        String username = JOptionPane.showInputDialog(this, "Lütfen kullanıcı adınızı girin:");
        String password = JOptionPane.showInputDialog(this, "Lütfen şifrenizi girin:");
        // Kullanıcı adı ve şifre doğruysa, seçili skoru sil ve başarılı mesajını göster
        if (username != null && password != null && data.checkPassword(username, password)) {
            deleteScore(selectedRow);
            JOptionPane.showMessageDialog(this, "Skor başarıyla silindi.");
        } else {
            // Aksi takdirde, geçersiz kullanıcı adı veya şifre mesajını göster
            JOptionPane.showMessageDialog(this, "Geçersiz kullanıcı adı veya şifre, lütfen tekrar deneyin.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Lütfen silmek istediğiniz skoru seçin.");
    }
    
    }//GEN-LAST:event_btn_skorSilActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void deleteScore(int rowIndex) {
        // Tablodan satırı kaldır
        DefaultTableModel model = (DefaultTableModel) jtbl_skor.getModel();
        model.removeRow(rowIndex);

        // Tablodaki mevcut skorları al ve listeye ekle
        ArrayList<String> scores = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {
            scores.add((String) model.getValueAt(i, 0));
        }
// Güncellenmiş skor listesini dosyaya yaz
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("skorlar.txt"))) {
            for (String score : scores) {
                writer.write(score);
                writer.newLine();
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_skorSil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbl_skor;
    private javax.swing.JPanel pnl_skor;
    // End of variables declaration//GEN-END:variables
}
