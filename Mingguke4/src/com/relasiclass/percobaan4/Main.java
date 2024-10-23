/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.percobaan4;

/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args) {
    Penumpang p = new Penumpang("12345", "Mr. Krab");
    Penumpang a = new Penumpang("1", "Budi");    
    Gerbong gerbong = new Gerbong("A", 10);
    gerbong.setPenumpang(p, 1);
    System.out.println(gerbong.info());
    gerbong.setPenumpang(a, 1);
    System.out.println(gerbong.info());
    }
}
