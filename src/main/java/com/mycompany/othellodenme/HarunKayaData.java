/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.othellodenme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author harnk
 */
public class HarunKayaData {

    /*
    loggedInPlayerIds HashSet'i, oyuncu giriş yaptığında oyuncu ID'sini ekler. 
    Bu sayede, eğer başka bir oyuncu giriş yapmaya çalışırsa ve ID'si zaten HashSet içinde bulunuyorsa, 
    bu oyuncunun tekrar giriş yapmasına izin verilmez.
    HashSet, her elemanın yalnızca bir kez saklandığı bir veri yapısıdır.
    */
    
    public static Set<Integer> loggedInPlayerIds = new HashSet<>();
    static ArrayList<HarunKayaPlayers> playersList = new ArrayList<>();// Kayıtlı oyuncuların listesini saklamak için kullanılan bir ArrayList.
    public static String playersTxtFileName = "playersList.txt";//Oyuncu bilgilerinin saklandığı dosyanın adı.
    
    
    //ScoreFrm sınıfı için oluşturduğum yapı
    public boolean checkPassword(String username, String password) {
        // Kullanıcı adı ve şifreyi kontrol etmek için kullanılır. skor silme işleminde oyuncunun kendi şifresini silebilmesi için yazdığım kod.
    try (BufferedReader reader = new BufferedReader(new FileReader(playersTxtFileName))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("&");
            if (parts[2].equals(username)&& parts[3].equals(password)) {
                return true;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}

    public static int Login(String email, String password) {
        //E-posta ve şifreyi kullanarak oyuncunun giriş yapmasını sağlar.
        //Başarılı bir giriş durumunda oyuncunun ID'sini döndürür, aksi takdirde -1 döndürür.
        int playerId = -1;

        for (HarunKayaPlayers p : playersList) {
            if (p.email.compareTo(email) == 0 && p.password.compareTo(password) == 0) {
                playerId = p.id;
                break;
            }
        }

        return playerId;
    }

    public static void AddPerson(HarunKayaPlayers player) throws Exception {
        //Verilen player nesnesini playersList'e ekler. Eğer oyuncunun e-posta adresi zaten mevcutsa, bir Exception fırlatır.
        boolean isAdded = true;
        for (HarunKayaPlayers p : playersList) {
            if (p.email.compareTo(player.email) == 0) {
                throw new Exception("Same mail!");

            }

        }
        playersList.add(player);
    }
    public static void WritePlayersListToFile() {
        /*
        playersList'teki tüm oyuncuların bilgilerini dosyaya yazar. 
        Her bir oyuncu için toString() metodu kullanılarak dosyaya yazılacak metin elde edilir ve dosyaya eklenir.
        */
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(playersTxtFileName));
        for (HarunKayaPlayers player : playersList) {
            String values = player.toString();
            writer.append(values + "\n");
        }
        writer.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Bir hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
}

 public static void ReadFromFileToPlayersList() {
     /*
     ReadFromFileToPlayersList(): Dosyadan okunan oyuncu bilgilerini playersList'e ekler. 
     Dosya yoksa, yeni bir dosya oluşturulur. Dosyadaki her satırı okuyarak, 
     her bir oyuncu için bir Players nesnesi oluşturulur ve playersList'e eklenir.
     */
    File file = new File(playersTxtFileName);
    try {
        if (!file.exists()) {
            file.createNewFile(); // Eğer dosya mevcut değilse dosyayı oluştur
        }

        BufferedReader reader = new BufferedReader(new FileReader(playersTxtFileName));
        String line = "";
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) continue; // Boş satırı atla
            String[] values = line.split("&");
            HarunKayaPlayers readPlayer = new HarunKayaPlayers();
            readPlayer.id = Integer.parseInt(values[0]);
            readPlayer.email = values[1];
            readPlayer.nameSurname = values[2];
            readPlayer.password = values[3];
            readPlayer.telephone=Integer.parseInt(values[4]);
            
            
            playersList.add(readPlayer);

        }
        reader.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Bir hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
}}
