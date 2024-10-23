/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.percobaan2;

/**
 *
 * @author knoyan
 */
public class Mobil {
    private String merk;
    private int biaya;
    
    
    public Mobil(){
        
    }
    
    public Mobil(String merk, int biaya){
        this.merk = merk;
        this.biaya = biaya;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return this.merk;
    }
    
    
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    
    public int getBiaya(){
        return this.biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
    
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
    
}
