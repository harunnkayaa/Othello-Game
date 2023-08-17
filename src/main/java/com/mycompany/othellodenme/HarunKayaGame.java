/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othellodenme;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class HarunKayaGame extends javax.swing.JFrame {

    private HarunKayaOthelloBoard board;
    private int boardSize;
    private boolean isPlayer1Turn;
    private boolean gameOver;

    public HarunKayaGame() {
        initComponents();
        updatePlayerNames();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_game = new javax.swing.JPanel();
        txt_Player1 = new javax.swing.JTextField();
        txt_Player2 = new javax.swing.JTextField();
        btn_yeniOyun = new javax.swing.JButton();
        txt_skrPlayer1 = new javax.swing.JTextField();
        txt_skrPlayer2 = new javax.swing.JTextField();
        spnr_gridSize = new javax.swing.JSpinner();
        pnl_play = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_oyun = new javax.swing.JMenu();
        mnu_ıtemOyunBaslat = new javax.swing.JMenuItem();
        mnu_ıtemCıkıs = new javax.swing.JMenuItem();
        mnu_skorlar = new javax.swing.JMenu();
        mnu_ıtemSkorlarıGöster = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_game.setBackground(new java.awt.Color(136, 188, 197));

        btn_yeniOyun.setText("Yeni Oyun Başlat");
        btn_yeniOyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yeniOyunActionPerformed(evt);
            }
        });

        spnr_gridSize.setModel(new javax.swing.SpinnerNumberModel(5, 5, 10, 1));

        javax.swing.GroupLayout pnl_playLayout = new javax.swing.GroupLayout(pnl_play);
        pnl_play.setLayout(pnl_playLayout);
        pnl_playLayout.setHorizontalGroup(
            pnl_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_playLayout.setVerticalGroup(
            pnl_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_gameLayout = new javax.swing.GroupLayout(pnl_game);
        pnl_game.setLayout(pnl_gameLayout);
        pnl_gameLayout.setHorizontalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gameLayout.createSequentialGroup()
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gameLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txt_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txt_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txt_skrPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_skrPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addComponent(spnr_gridSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_yeniOyun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(pnl_play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_gameLayout.setVerticalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gameLayout.createSequentialGroup()
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_skrPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_skrPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnr_gridSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_yeniOyun))))
                .addGap(18, 18, 18)
                .addComponent(pnl_play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mnu_oyun.setText("Oyun");

        mnu_ıtemOyunBaslat.setText("Yeni Oyun Başlat");
        mnu_ıtemOyunBaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_ıtemOyunBaslatActionPerformed(evt);
            }
        });
        mnu_oyun.add(mnu_ıtemOyunBaslat);

        mnu_ıtemCıkıs.setText("Çıkış");
        mnu_ıtemCıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_ıtemCıkısActionPerformed(evt);
            }
        });
        mnu_oyun.add(mnu_ıtemCıkıs);

        jMenuBar1.add(mnu_oyun);

        mnu_skorlar.setText("Skorlar");

        mnu_ıtemSkorlarıGöster.setText("Skorları göster");
        mnu_ıtemSkorlarıGöster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_ıtemSkorlarıGösterActionPerformed(evt);
            }
        });
        mnu_skorlar.add(mnu_ıtemSkorlarıGöster);

        jMenuBar1.add(mnu_skorlar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yeniOyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yeniOyunActionPerformed
       //Bu metod  yeni bir Othello oyununun başlatılması için gerekli tüm işlemleri gerçekleştirir ve tahtanın düzgün bir şekilde görüntülenmesini sağlar.
        boardSize = (Integer) spnr_gridSize.getValue();

        tahtayiBaslat();

        onBoardButtonClick(evt);
        board.updateButtonColors();
    }//GEN-LAST:event_btn_yeniOyunActionPerformed

    private void mnu_ıtemOyunBaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_ıtemOyunBaslatActionPerformed
        // TODO add your handling code here:
        //menüden yeni bir Othello oyununun başlatılması için kullanılır. Bu metod, menüdeki "Oyun Başlat" öğesine tıklandığında çağrılır.
        int option = JOptionPane.showConfirmDialog(this, "Yeni oyun başlatmak istediğinize emin misiniz? ");
        if (option == JOptionPane.YES_OPTION) {
            boardSize = (Integer) spnr_gridSize.getValue();
            tahtayiBaslat();
            onBoardButtonClick(evt);
            board.updateButtonColors();
        }
    }//GEN-LAST:event_mnu_ıtemOyunBaslatActionPerformed

    private void mnu_ıtemCıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_ıtemCıkısActionPerformed
        // TODO add your handling code here:
        // kullanıcının çıkış yapmak için kullandığı menu itemidir.
        int option = JOptionPane.showConfirmDialog(this, "Çıkış yapmak  istediğinize emin misiniz? ");
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_mnu_ıtemCıkısActionPerformed

    private void mnu_ıtemSkorlarıGösterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_ıtemSkorlarıGösterActionPerformed
        // TODO add your handling code here:
       // kullanıcının oyun skorlarını görmek için kullandığı menu itemidir. ScoreFrm sınfının nesnesini oluşturur ve skorları göster mentü itemine basılınca ScoreFrm Frame'ine  sınıfına gider 
        HarunKayaScoreFrm skorlar = new HarunKayaScoreFrm();
        skorlar.setVisible(true);

    }//GEN-LAST:event_mnu_ıtemSkorlarıGösterActionPerformed
    public void actionPerformed(ActionEvent e) {
        // metodu, Othello tahtasındaki butonlara tıklanma olaylarını işler, tıklanan butonun konumunu belirler ve taşın rengini  
        //şu anki oyuncunun rengine göre günceller. Ardından, oyuncuyu değiştirir ve sıradaki oyuncunun hamlesine geçilir.
        JButton source = (JButton) e.getSource();//Bu satır, tıklanan butonu (JButton nesnesi) alır ve source adlı değişkene atar.
        //Bu satırlar, tıklanan butonun tahtadaki satır ve sütun konumunu saklamak için atandı.
        int row = -1;
        int col = -1;

        //İç içe geçmiş for döngüleri, tahtadaki butonları kontrol eder ve tıklanan düğmenin
        // satır ve sütun koordinatlarını bulur. Bulunan koordinatlar, row ve col değişkenlerine atanır.
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (source == board.getButtonAt(i, j)) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        if (row != -1 && col != -1) {//geçerli satır ve sütun koordinatları bulunduysa 
            if (board.getCurrentPlayer() == 1) {
                source.setBackground(Color.BLACK);
            } else {
                source.setBackground(Color.WHITE);
            }
            board.changePlayer();// şu anki oyuncuyu değiştirir. Oyuncu 1'den 2'ye veya 2'den 1'e geçer.
        }
    }

    private void tahtayiBaslat() {
        board = new HarunKayaOthelloBoard(boardSize);//boardSize değeri kullanılarak boyutu belirleniyor.
        pnl_play.removeAll();//pnl_play adlı bir panel seçiliyor ve önceki tüm bileşenler kaldırılıyor 
        pnl_play.setLayout(new GridLayout(boardSize, boardSize));//Panelin düzeni GridLayout olarak ayarlanıyor ve satır ve sütun sayısı boardSize olarak belirleniyor.

        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                JButton button = new JButton();//ahtanın her bir hücresi için bir JButton bileşeni oluşturuluyor.
                button.addActionListener(new ActionListener() {
                    //Yeni butona bir ActionListener ekleniyor, bu da butona tıklandığında onBoardButtonClick metodu çağrılmasını sağlayacak.
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        onBoardButtonClick(e);
                    }
                });
                pnl_play.add(button);//Oluşturulan buton, pnl_play paneline eklenir.
                board.setButtonAt(row, col, button);//board.setButtonAt(row, col, button) ile buton, OthelloBoard nesnesinin ilgili hücresine atanır.
            }
        }

        board.initialize();
        isPlayer1Turn = true;//Bu, oyunun başında ilk oyuncunun sırasının olduğunu belirtir.

        pnl_play.revalidate();//yapılan içerik değişikliklerinin düzgün bir şekilde uygulanmasını sağlamak için kullanılır
        pnl_play.repaint();//ekranda görünen bileşenin güncel görünümünü sağlamak amacıyla kullanılır
    }

    private void onBoardButtonClick(ActionEvent evt) {
        if (gameOver) {//Eğer oyun zaten sona ermişse (gameOver true ise), bu metot hiçbir şey yapmaz ve hemen sonlanır.
            return;
        }
        JButton source = (JButton) evt.getSource();//Olayın kaynağı olan JButton nesnesini alır ve 'source' adlı değişkene atar.
        int row = -1;// row ve col kordinatlasrını saklamak için tanımlanmıştır
        int col = -1;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                //Eğer 'source' değişkeni, şu anki satır ve sütundaki butona eşitse, satır ve sütun değerlerini değişkenlere atar ve döngüyü sonlandırır.
                if (source == board.getButtonAt(i, j)) {
                    row = i;//
                    col = j;
                    break;
                }
            }
        }
        if (row < 0 || row >= boardSize || col < 0 || col >= boardSize) {//Eğer satır veya sütun değerleri geçersizse  metot sonlanır ve hiçbir şey yapmaz
            return;
        }

        if (board.isValidMove(row, col, isPlayer1Turn)) {
            // Eğer tıklanan hücrede geçerli bir hamle yapılabilirse (isValidMove fonksiyonu true dönerse), aşağıdaki işlemler gerçekleştirilir:
            board.makeMove(row, col, isPlayer1Turn);
            isPlayer1Turn = !isPlayer1Turn;// Sıradaki oyuncu değiştirilir (eğer şu anki oyuncu 1 ise, sıra oyuncu 2'ye geçer ve tersi de geçerlidir).
            updateBoard();//Oyun tahtasındaki grafiksel bileşenlerin güncellenmesi
            checkGameState();//Oyunun durumunu kontrol etmek ve gerektiğinde oyunun bitip bitmediğini kontrol etmek için çağrılır
        }
    }

    private void updateBoard() {
        updateScore();
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                HarunKayaOthelloBoard.Cell cell = board.getCell(row, col);//getCell() metodu ile şu anki hücrenin durumunu (boş, oyuncu 1 veya oyuncu 2) alır ve 'cell' adlı değişkene atar.
                JButton button = board.getButtonAt(row, col);//Şu anki hücreye karşılık gelen JButton nesnesini alır ve 'button' adlı değişkene atar.
                if (cell == HarunKayaOthelloBoard.Cell.PLAYER1) {
                    button.setBackground(Color.BLACK);
                } else if (cell == HarunKayaOthelloBoard.Cell.PLAYER2) {
                    button.setBackground(Color.WHITE);
                } else {
                    button.setBackground(Color.GREEN); // Seçtiğiniz bir arka plan rengi
                }
            }
        }
    }

    private void checkGameState() {//Bu metod, oyunun mevcut durumunu kontrol etmek ve oyunun sona erip ermediğini belirlemek için kullanılır.
        if (!board.hasValidMove(isPlayer1Turn)) {//Şu anki oyuncunun (isPlayer1Turn) geçerli bir hamlesi olup olmadığını kontrol eder.
            if (!board.hasValidMove(!isPlayer1Turn)) {
                //Diğer oyuncunun da geçerli bir hamlesi olup olmadığını kontrol eder. Eğer her iki oyuncunun da geçerli bir hamlesi yoksa, oyunun sona erdiği anlamına gelir ve kod bloğuna girer.
                handleGameOver();// Oyunun sona erdiğini işler
            } else {
                isPlayer1Turn = !isPlayer1Turn;
            }
            updateScore();
        }
        //updatePlayerScores();
    }

    private void updateScore() {
        int player1Score = board.getPlayer1Score();
        int player2Score = board.getPlayer2Score();
        txt_skrPlayer1.setText(Integer.toString(player1Score));
        txt_skrPlayer2.setText(Integer.toString(player2Score));
    }

    /*private void updateBoardColors() {
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                Color color = board.getButtonColorAt(row, col);
                board.getButtonAt(row, col).setBackground(color);
            }
        }
    }*/
    private void handleGameOver() {
        String winner;
        int player1Score = board.getPlayer1Score();
        int player2Score = board.getPlayer2Score();

        //İki oyuncunun skorlarını karşılaştırarak, hangi oyuncunun kazandığını ya da beraberlik durumunu belirler.
        if (player1Score > player2Score) {
            winner = txt_Player1.getText();
        } else if (player1Score < player2Score) {
            winner = txt_Player2.getText();
        } else {
            winner = "Berabere";
        }

        // Skorları kaydet
        try ( FileWriter writer = new FileWriter("skorlar.txt", true)) {
            writer.write(txt_Player1.getText() + ": " + player1Score + "\n");
            writer.write(txt_Player2.getText() + ": " + player2Score + "\n");
        } catch (IOException e) {
            //e.printStackTrace();
        }

        // Oyun sonu mesajı
        String message;
        if (!winner.equals("Berabere")) {
            message = winner + " kazandı!";
        } else {
            message = "Oyun berabere bitti!";
        }

        int result = JOptionPane.showConfirmDialog(this, message + " Yeni oyun oynamak ister misiniz?", "Oyun Bitti", JOptionPane.YES_NO_OPTION);

        //Eğer kullanıcı yeni bir oyun oynamak isterse (result == JOptionPane.YES_OPTION), oyun tahtasını başlatan initializeBoard()
        //metodunu çağırır ve tahtanın buton renklerini günceller. Eğer kullanıcı yeni oyun oynamak istemezse, uygulama sonlandırılır (System.exit(0)).
        if (result == JOptionPane.YES_OPTION) {
            tahtayiBaslat();
            board.updateButtonColors();
        } else {
            System.exit(0);
        }
    }

    private void updatePlayerNames() {// Oyuncu adları, Data sınıfındaki loggedInPlayerIds ve playersList listelerinden alınır.
        ArrayList<Integer> loggedInPlayerIdsList = new ArrayList<>(HarunKayaData.loggedInPlayerIds);
   //Öncelikle, Data.loggedInPlayerIds listesinden bir ArrayList<Integer> türündeki loggedInPlayerIdsList oluşturulur.
        if (loggedInPlayerIdsList.size() >= 1) {//
    //Eğer loggedInPlayerIdsList listesinin boyutu 1 veya daha büyükse (yani en az 1 oyuncu giriş yapmışsa), oyuncu 1'in ID'sini alır ve playerId1 değişkenine atar.
            int playerId1 = loggedInPlayerIdsList.get(0);
            HarunKayaPlayers player1 = null;
            //Data.playersList listesinde, oyuncu 1'in ID'sine sahip oyuncuyu bulmaya çalışır. Eğer bu oyuncu bulunursa, player1 değişkenine atar ve döngüyü sonlandırır.
            for (HarunKayaPlayers p : HarunKayaData.playersList) {
                if (p.id == playerId1) {
                    player1 = p;
                    break;
                }
            }
            //Eğer player1 değişkeni null değilse (yani oyuncu bulunduysa), oyuncunun adını ve soyadını txt_Player1 metin alanına yazdırır.
            if (player1 != null) {
                txt_Player1.setText(player1.nameSurname);
            }
        }
        //Eğer loggedInPlayerIdsList listesinin boyutu 2 ise (yani 2 oyuncu da giriş yapmışsa), oyuncu 2'nin ID'sini alır ve playerId2 değişkenine atar
        if (loggedInPlayerIdsList.size() == 2) {
            int playerId2 = loggedInPlayerIdsList.get(1);
            HarunKayaPlayers player2 = null;
            //Data.playersList listesinde, oyuncu 2'nin ID'sine sahip oyuncuyu bulmaya çalışır. Eğer bu oyuncu bulunursa, player2 değişkenine atar ve döngüyü sonlandırır.
            for (HarunKayaPlayers p : HarunKayaData.playersList) {
                if (p.id == playerId2) {
                    player2 = p;
                    break;
                }
            }
            //Eğer player2 değişkeni null değilse (yani oyuncu bulunduysa), oyuncunun adını ve soyadını txt_Player2 metin alanına yazdırır.
            if (player2 != null) {
                txt_Player2.setText(player2.nameSurname);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_yeniOyun;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnu_oyun;
    private javax.swing.JMenu mnu_skorlar;
    private javax.swing.JMenuItem mnu_ıtemCıkıs;
    private javax.swing.JMenuItem mnu_ıtemOyunBaslat;
    private javax.swing.JMenuItem mnu_ıtemSkorlarıGöster;
    private javax.swing.JPanel pnl_game;
    private javax.swing.JPanel pnl_play;
    private javax.swing.JSpinner spnr_gridSize;
    private javax.swing.JTextField txt_Player1;
    private javax.swing.JTextField txt_Player2;
    private javax.swing.JTextField txt_skrPlayer1;
    private javax.swing.JTextField txt_skrPlayer2;
    // End of variables declaration//GEN-END:variables
}
