/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.percobaan2;

/**
 *
 * @author knoyan
 */
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan(String nama, Mobil mobil, Sopir sopir, int hari) {
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this.hari = hari;
    }

    public Pelanggan() {
        
    }

    public int getHari() {
        return hari;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public String getNama() {
        return nama;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }


    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
    
    
}
