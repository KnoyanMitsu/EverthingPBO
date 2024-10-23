/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Karyawan;

/**
 *
 * @author knoyan
 */
public class TestBio {
    public static void main(String args[]){
        Biodata bio = new Biodata();
        bio.id(1);
        bio.nama("Fabian");
        bio.jeniskelamin("Laki-Laki");
        bio.jabatan("TI");
        bio.gaji(2000000);
        bio.tampilBiodata();
        
        
    }
}
