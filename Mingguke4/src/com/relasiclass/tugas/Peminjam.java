/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.tugas;

/**
 *
 * @author knoyan
 */
public class Peminjam {
    private String nama,kelas,nim;
    
    public Peminjam(String nama, String kelas, String nim) {
        this.nama = nama;
        this.kelas = kelas;
        this.nim = nim;
    }
    
    public String getInfo() {
        return "Nama Peminjam: " + this.nama + "\nNIM: " + this.nim + "\n" + "Kelas: " + this.kelas + "\n";
    }
}
