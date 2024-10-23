package com.relasiclass.tugas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "Budi Raharjo");
        Peminjam peminjam1 = new Peminjam("Fabian Ananda Merdana", "TI-2C", "244107023004");
        Petugas petugas1 = new Petugas("Dewi", "PTG001");
        
        Peminjaman peminjaman1 = new Peminjaman(buku1, peminjam1, petugas1);
        
        System.out.println(peminjaman1.getInfo());
    }
}
