/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;

/**
 *
 * @author knoyan
 */
public class Inherintance1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama="Vivin";
        M.alamat="JL. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManager();
        
        Staff S = new Staff();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaff();
        
    }
}
