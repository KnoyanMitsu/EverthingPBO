/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author knoyan
 */
public class sofware {
    private String namaSoftware,jenisAplikasi,supportOS;
    private int minimalRam;
    private double versi;

    public sofware(String namaSoftware, String jenisAplikasi, String supportOS, int minimalRam, double versi) {
        this.namaSoftware = namaSoftware;
        this.jenisAplikasi = jenisAplikasi;
        this.supportOS = supportOS;
        this.minimalRam = minimalRam;
        this.versi = versi;
    }
    
    public void getSoftware(){
        System.out.println("Nama Aplikasi: " + this.namaSoftware);
        System.out.println("Jenis Aplikasi: " + this.jenisAplikasi);
        System.out.println("Support OS: " + this.supportOS);
        System.out.println("Minimal Ram: " + this.minimalRam);
        System.out.println("Versi: " + this.versi);

    }
}
