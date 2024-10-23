/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

/**
 *
 * @author knoyan
 */
public class Fakultas {
    private String namaFakultas,dekan;
    private int jumlahMahasiswa;

    public Fakultas(String namaFakultas, String dekan, int jumlahMahasiswa) {
        this.namaFakultas = namaFakultas;
        this.dekan = dekan;
        this.jumlahMahasiswa = jumlahMahasiswa;
    }
    
    public void cetakFakultas(){
        System.out.println("Nama Fakultas: " + this.namaFakultas);
        System.out.println("Jumlah Mahasiswa: " + this.jumlahMahasiswa);
        System.out.println("Dekan: " + this.dekan);
        System.out.println("------------------------");
    }
    
}
