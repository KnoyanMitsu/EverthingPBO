/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.percobaan2;

/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
