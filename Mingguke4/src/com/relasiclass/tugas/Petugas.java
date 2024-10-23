/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.tugas;

/**
 *
 * @author knoyan
 */
public class Petugas {
    private String nama;
    private String id;
    
    public Petugas(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    
    public String getInfo() {
        return "Nama Petugas: " + this.nama + "\nID Petugas: " + this.id + "\n";
    } 
}
