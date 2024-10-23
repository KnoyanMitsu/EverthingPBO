/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author knoyan
 */
public class Bio {
    private String nama,kelas;

    public Bio(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public Bio() {
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getInfo(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        return info;
    }
}
