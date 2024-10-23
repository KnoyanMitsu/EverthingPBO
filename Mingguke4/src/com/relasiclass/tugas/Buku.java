package com.relasiclass.tugas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author knoyan
 */
public class Buku {
    private String judul;
    private String pengarang;
    
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    public String getInfo() {
        return "Judul: " + this.judul + "\nPengarang: " + this.pengarang + "\n";
    }
}
