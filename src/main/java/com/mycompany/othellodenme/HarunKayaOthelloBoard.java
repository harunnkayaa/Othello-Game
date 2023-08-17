/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.othellodenme;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;

public class HarunKayaOthelloBoard {

    public int mevcutOyuncu;

    public enum Cell {
        EMPTY, PLAYER1, PLAYER2
    }//Bu Cell enum yapısı, Othello oyun tahtasındaki hücrelerin durumunu temsil etmek ve bu durumları saklamak için kullanılır.

    public Cell[][] board;
    public JButton[][] buttons;
    public int boardSize;

    public HarunKayaOthelloBoard(int boardSize) {

        this.boardSize = boardSize;//oyun tahtasının boyutunu atar
        this.board = new Cell[boardSize][boardSize];//boardsize'a göre nxn'lik Cell tipinde matris oluşturur
        this.buttons = new JButton[boardSize][boardSize];

        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                board[row][col] = Cell.EMPTY;
            // İlgili (row, col) koordinatlarındaki hücreyi boş olarak başlatır. Bu işlem, oyun tahtasındaki tüm hücreler için yapılır.
            }
        }
        mevcutOyuncu = 1;// başlangıçta 1.oyuncu hamle yaparak başlar.
    }

    public boolean hasValidMove(boolean isPlayer1Turn) {
        int mevcutOyuncu = isPlayer1Turn ? 1 : 2;
        //Şu anki oyuncunun kim olduğunu belirleyerek mevcutOyuncu değişkenine atar. Eğer isPlayer1Turn değeri true ise, 
        //şu anki oyuncu PLAYER1 (1) olarak belirlenir; değilse, şu anki oyuncu PLAYER2 (2) olarak belirlenir.
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                /*Eğer (row, col) koordinatlarındaki hücre şu anki oyuncu için geçerli bir hamle ise:
                return true;: hasValidMove metodu true değerini döndürerek şu anki oyuncunun geçerli bir hamlesi olduğunu belirtir.*/
                if (isValidMove(row, col, isPlayer1Turn)) {
                    return true;
                }
            }
        }
        /*geçerli bir hamle bulunamazsa, döngüler tamamlanır ve return false; ile hasValidMove metodu false 
        değerini döndürerek şu anki oyuncunun geçerli bir hamlesi olmadığını belirtir.*/
        return false;
    }

    //mevcutOyuncu değerini 1 ile 2 arasında değiştirerek, Othello oyununda sıranın bir oyuncudan diğerine geçişini sağlar.
    public void changePlayer() {
        mevcutOyuncu = 3 - mevcutOyuncu;
    }

    public int getCurrentPlayer() {
        return mevcutOyuncu;
    }

    public void setButtonAt(int row, int col, JButton button) {
        buttons[row][col] = button;
    }

    public JButton getButtonAt(int row, int col) {
        return buttons[row][col];

    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }

    public void initialize() {
        int halfSize = boardSize / 2;//Tahtanın yarısını hesaplayar.Örneğin, 8x8'lik bir oyun tahtası için halfSize 4 olacaktır.
        board[halfSize - 1][halfSize - 1] = Cell.PLAYER1;//Tahtanın tam ortasındaki üst sol hücreye PLAYER1'in taşını koyar.
        board[halfSize - 1][halfSize] = Cell.PLAYER2;//Tahtanın tam ortasındaki üst sağ hücreye PLAYER2'nin taşını koyar. 
        board[halfSize][halfSize - 1] = Cell.PLAYER2;//Tahtanın tam ortasındaki alt sol hücreye PLAYER2'nin taşını koyar. 
        board[halfSize][halfSize] = Cell.PLAYER1;//Tahtanın tam ortasındaki alt sağ hücreye PLAYER1'in taşını koyar. 
        updateButtonColors();//başlangıç durumundaki oyuncu taşlarının ve boş hücrelerin rengini belirler
    }

    public boolean isValidMove(int row, int col, boolean isPlayer1) {
        Cell player = isPlayer1 ? Cell.PLAYER1 : Cell.PLAYER2;//Bu kısım, oyuncunun ve rakibin kim olduğunu belirler.
        Cell opponent = isPlayer1 ? Cell.PLAYER2 : Cell.PLAYER1;//isPlayer1 doğruysa, player Cell.PLAYER1 olacak ve opponent Cell.PLAYER2 olacaktır. Aksi takdirde, bunlar ters olacaktır.
    
        if (board[row][col] != Cell.EMPTY) {
            return false;//seçilen hücrenin boş olup olmadığını kontrol eder. Eğer hücre boş değilse, hamle geçersizdir ve false döndürülür.
        }
        

        /*tüm olası yönlere göz atarak, oyuncunun ele geçirebileceği rakip taşlarını kontrol eder. 
        directions dizisi, tüm olası hareketlerin koordinatları için bir temel sağlar (-1, 0 ve 1). 
        xYonu ve yYonu değerleri ile -1, 0 ve 1 arasındaki tüm değer çiftleri alınarak 8 farklı yöne (yatay, dikey ve çapraz) bakılır.
        Eğer xYonu ve yYonu her ikisi de 0 ise, bu durum yer değiştirmeden aynı hücrede kalınacağı anlamına gelir ve bu durumda continue ile döngünün diğer adımına geçilir.*/
        int[] directions = {-1, 0, 1};
        for (int xYonu : directions) {
            for (int yYonu : directions) {
                if (xYonu == 0 && yYonu == 0) {
                    continue;
                }

                /*Bu kısım, seçilen yönde hücreleri kontrol eder. Eğer karşı oyuncunun taşları bulunuyor ve 
                ardından oyuncunun kendi taşı geliyorsa, bu durumda geçerli bir hamle yapılmıştır ve true döndürülür.
                Aksi takdirde, döngü sonraki yönde kontrol etmeye devam eder. Yeni satır ve sütun koordinatları, 
                newRow ve newCol değişkenlerine atanarak güncellenir.*/
                int newRow = row + xYonu;
                int newCol = col + yYonu;
                boolean foundOpponent = false;

                while (newRow >= 0 && newRow < boardSize && newCol >= 0 && newCol < boardSize) {
                // newRow ve newCol koordinatlarının tahta sınırları içinde olduğu sürece devam eder.
                    if (board[newRow][newCol] == opponent) {
                        foundOpponent = true;
                    } else if (foundOpponent && board[newRow][newCol] == player) {
                        return true;
                    } else {
                        break;
                    }

                    /*Bu kod parçası, döngüyü yeni koordinatlarla güncelleyerek seçilen yönde ilerlemeye devam etmeyi sağlar. 
                    Eğer hiçbir yönde geçerli bir hamle bulunamazsa, döngü tamamlanır ve return false; ile hamle geçersiz olarak kabul edilir.*/
                    newRow += xYonu;
                    newCol += yYonu;
                }
            }
        }

        return false;
    }

    public void makeMove(int row, int col, boolean isPlayer1) {
        //Bu kod parçası, tüm yönlere doğru ilerleyerek, ele geçirilecek rakip taşları bulur ve ele geçirir (döndürür).
        //İlk olarak, mevcut oyuncunun ve rakibin taşlarını temsil eden Cell nesneleri oluşturulur.
        Cell player = isPlayer1 ? Cell.PLAYER1 : Cell.PLAYER2;
        Cell rakip = isPlayer1 ? Cell.PLAYER2 : Cell.PLAYER1;

        //Ardından, belirtilen hücreye oyuncunun taşı yerleştirilir.
        board[row][col] = player;

        //Tüm yönlere doğru hareket edebilmek için bir directions dizisi oluşturulur ve iç içe geçmiş döngülerle her yönde kontrol gerçekleştirilir.
        int[] directions = {-1, 0, 1};
        for (int xYonu : directions) {
            for (int yYonu : directions) {
                if (xYonu == 0 && yYonu == 0) {
                    continue;
                }

                //Döngü içinde, yeni satır ve sütun koordinatları güncellenir ve rakibin taşları aranır.
                int newRow = row + xYonu;
                int newCol = col + yYonu;
                boolean rakipBulundu = false;
                ArrayList<Integer> rakipPositions = new ArrayList<>();

                while (newRow >= 0 && newRow < boardSize && newCol >= 0 && newCol < boardSize) {
                    /*Eğer board[newRow][newCol] hücresi rakibin taşı ise, foundOpponent değişkenini true olarak işaretler 
                    ve bu hücrenin koordinatını (tek boyutlu bir sayı olarak) opponentPositions listesine ekler.*/
                    if (board[newRow][newCol] == rakip) {
                        rakipBulundu = true;
                        rakipPositions.add(newRow * boardSize + newCol);
                        /*Eğer foundOpponent true ise ve board[newRow][newCol] hücresi oyuncunun taşı ise, bu durum mevcut yönde aralarında rakip taşlar olan iki oyuncu taşı olduğunu gösterir. 
                        Bu nedenle, opponentPositions listesindeki tüm rakip taşları ele geçirir (döndürür) ve oyuncunun taşı olarak işaretler.*/
                    } else if (rakipBulundu && board[newRow][newCol] == player) {
                        for (int pos : rakipPositions) {
                            int r = pos / boardSize;
                            int c = pos % boardSize;
                            board[r][c] = player;
                        }
                        break;
                        /*Eğer board[newRow][newCol] hücresi ne oyuncunun ne de rakibin taşı değilse (yani boş bir hücre),
                        döngüyü kırar ve başka bir yönde aramaya devam eder.*/
                    } else {
                        break;
                    }
                    //Son olarak, newRow ve newCol koordinatları, mevcut yönde hareket etmeye devam etmek için güncellenir.
                    newRow += xYonu;
                    newCol += yYonu;
                }
            }
        }
        // Bu metod, kullanıcı arayüzündeki hücrelerin renklerini günceller.
        updateButtonColors();
    }

    //oyun tahtasındaki tüm hücrelerin (butonların) arka plan renklerini güncelleyerek, oyuncu taşlarının rengini gösterir. 
    public void updateButtonColors() {
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                switch (board[row][col]) {
                    case PLAYER1:
                        buttons[row][col].setBackground(Color.BLACK);
                        break;
                    case PLAYER2:
                        buttons[row][col].setBackground(Color.WHITE);
                        break;
                    default:
                        buttons[row][col].setBackground(Color.GREEN);
                }
            }
        }
    }

    /*hasValidMove(true) çağrısı, PLAYER1 (siyah taşlar) için herhangi bir geçerli hamle olup olmadığını kontrol eder. 
    hasValidMove(false) çağrısı, PLAYER2 (beyaz taşlar) için herhangi bir geçerli hamle olup olmadığını kontrol eder. 
    İki çağrı da ! ile tersine çevrilir, yani her iki oyuncu için de geçerli hamle yoksa true ve en az bir oyuncu için geçerli hamle varsa false döndürür.
    her iki oyuncunun da geçerli hamlesi yoksa true döndürür ve oyunun sona erdiğini gösterir. Aksi takdirde, false döndürür ve oyunun devam ettiğini gösterir.*/
    public boolean isGameOver() {
        return !hasValidMove(true) && !hasValidMove(false);
    }

    public int[] getScore() {
        int[] score = new int[2];
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if (board[row][col] == Cell.PLAYER1) {
                    score[0]++;//eğer hücre PLAYER1'e aitse, PLAYER1'in skoru (score[0]) bir artırılır.
                } else if (board[row][col] == Cell.PLAYER2) {
                    score[1]++;//eğer hücre PLAYER2'ye aitse, PLAYER2'nin skoru (score[1]) bir artırılır.
                }
            }
        }
        return score;
    }

    public Color getButtonColorAt(int row, int col) {
        return buttons[row][col].getBackground();
    }

    public int getPlayer1Score() {
        int[] score = getScore();
        return score[0];
    }

    public int getPlayer2Score() {
        int[] score = getScore();
        return score[1];
    }
}
