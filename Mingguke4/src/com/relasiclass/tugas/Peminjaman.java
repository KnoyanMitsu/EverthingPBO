/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.tugas;

/**
 *
 * @author knoyan
 */
public class Peminjaman {
    private Buku buku;
    private Peminjam peminjam;
    private Petugas petugas;
    
    public Peminjaman(Buku buku, Peminjam peminjam, Petugas petugas) {
        this.buku = buku;
        this.peminjam = peminjam;
        this.petugas = petugas;
    }
    
    public String getInfo() {
        String info = "";
        info += buku.getInfo();
        info += peminjam.getInfo();
        info += petugas.getInfo();
        return info;
    }   
}
