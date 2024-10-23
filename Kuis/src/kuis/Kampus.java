/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis;

/**
 *
 * @author knoyan
 */
public class Kampus {
    private String namaKampus, lokasiKampus, akreditasi;

    public Kampus(String namaKampus, String lokasiKampus, String akreditasi) {
        this.namaKampus = namaKampus;
        this.lokasiKampus = lokasiKampus;
        this.akreditasi = akreditasi;
    }
    
    public void cetakProfile(){
        System.out.println("Nama Kampus: " + this.namaKampus);
        System.out.println("Lokasi: " + this.lokasiKampus);
        System.out.println("Akreditasi: " + this.akreditasi);
    }
        
}
