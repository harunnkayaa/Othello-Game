/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.othellodenme;

/**
 *
 * @author harnk
 */
public class HarunKayaPlayers {

    // Cinsiyet bilgisini saklamak için bir enum tanımlanıyor.
    public enum Gender {
        Male,
        Famale
    };
    public static int gid = 0;
    public int id;
    public String email;
    public String nameSurname;
    public String password;
    public int telephone;
    public String address;
    public Gender gender;
    public boolean isSmoker;

    public HarunKayaPlayers() {
        this.id = HarunKayaPlayers.gid;
        HarunKayaPlayers.gid++;

    }
//Oyuncu nesnesinin özelliklerini temsil eden bir dize döndürür
    @Override
    public String toString() {
        String values = "";
        values += this.id + "&";
        values += this.email + "&";
        values += this.nameSurname + "&";
        values += this.password + "&";
        values += this.telephone + "&";
        values += this.address + "&";
        values+=this.gender+ "&";
        values += this.isSmoker;

        return values;
    }

}
