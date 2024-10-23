/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.percobaan1;

/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", p);
        
        
        L.info();
        
        
        Processor p1 = new Processor();
        p1.setMerk("Intel i7");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setMerk("Asus");
        l1.setProc(p1);
        l1.info();
    }
}
