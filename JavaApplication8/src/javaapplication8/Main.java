/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args) {
        Bio b = new Bio("Knoyan", "Longway-12");
        Matkul m = new Matkul("PBO", b);
        
        System.out.println(m.getInfo());
    }
}
