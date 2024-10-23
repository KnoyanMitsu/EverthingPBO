/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args) {
        Kampus k = new Kampus("Universitas A", "Jakarta", "A");
        Fakultas f1 = new Fakultas("Teknik", "Dr. Budi", 500);
        Fakultas f2 = new Fakultas("Ekonomi", "Dr. Siti", 300);
        
        
        k.cetakProfile();
        System.out.println("Daftar Fakultas:");
        f1.cetakFakultas();
        f2.cetakFakultas();
    }
}
