/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Karyawan;

/**
 *
 * @author knoyan
 */
public class Biodata {
    private int id,gaji;
    private String nama,jabatan,jeniskelamin;
    
    public void nama(String value){
        nama = value;
    }

    public void jabatan(String value){
        jabatan = value;
    }

    public void jeniskelamin(String value){
        jeniskelamin = value;
    }

    public void gaji(int value){
        gaji = value;
    }

    public void id(int value){
        id = value;
    }
    
        
    public void tampilBiodata(){
        System.out.println("id: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
    
    
    
    
}
