/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;

import Percobaan1.*;

/**
 *
 * @author knoyan
 */
public class Manager extends Karyawan{
    public int tunjangan;

    public Manager() {
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan           ="+tunjangan);
        System.out.println("Total Gaji          ="+(super.gaji+tunjangan));

    }
    
}
