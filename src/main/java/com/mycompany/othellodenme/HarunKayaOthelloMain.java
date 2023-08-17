/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.othellodenme;


import java.util.ArrayList;
/*if(this.gender==Gender.Famale){
            values+="Famale";
        }
        if (this.gender==Gender.Male) {
            values+="Male";
        }*/

/**
 *
 * @author harnk
 */
public class HarunKayaOthelloMain {

    // Oyuncuların listesini saklamak için ArrayList kullanılır
        public static ArrayList<HarunKayaPlayers> playersList = new ArrayList<>();
    public static void main(String[] args) {
        // Dosyadan oyuncu listesini okuma işlemi gerçekleştirilir
        HarunKayaData.ReadFromFileToPlayersList();
        // Yeni bir LoginFrm nesnesi oluşturulur
       HarunKayaLoginFrm newFrm = new HarunKayaLoginFrm(); 
      // LoginFrame =newFrm;
       newFrm.setVisible(true);
    }
    }




