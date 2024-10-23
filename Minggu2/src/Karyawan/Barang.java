/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Karyawan;

/**
 *
 * @author knoyan
 */
public class Barang {
    public String namaBrg,jenisBrg;
    public int stok;
    
    public void namaBrg(String value){
        namaBrg = value;
    }

    public void jenisBrg(String value){
        jenisBrg = value;
    }

    public void stok(int value){
        stok = value;
    }
   
    public void tampilBarang(){
        System.out.println("Nama Barang "+namaBrg);
        System.out.println("Jenis Barang "+namaBrg);
        System.out.println("Stok "+namaBrg);
    }
    
    public int tambahStok(int brgMasuk){
        int stokBaru=brgMasuk+stok;
        return stokBaru;
    }
}
