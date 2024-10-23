/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Mac
        Mac mac = new Mac("Face ID", "Lithium", "MacbookPro M1", "M1 Arm64", 3, 16);
        System.out.println("Data Mac:");
        mac.tampilMac();
        System.out.println();

        // Instansiasi objek Windows
        Windows windows = new Windows("Windows Hello", "Lithium", "MSI GF65 thin", "Intel i7-12400H", 5, 32);
        System.out.println("Data Windows:");
        windows.tampilWindows();
        System.out.println();

        // Instansiasi objek Pc
        Pc pc = new Pc(13, "Asus", "Intel i7-4500", 3, 8);
        System.out.println("Data Pc:");
        pc.tampilPc();
    }
}
