/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author knoyan
 */
public class Main {
    public static void main(String[] args){
        TV tv1 = new TV("Jauh", 20, 12);
        Monitor mnt = new Monitor("Dekat", 50, 11, 1920, 1080);
        tv1.hidupkan(true);
        mnt.hidupkan(true);
        tv1.naikvolume(10);
        mnt.turunvolume(5);
        System.out.println("TV");
        tv1.info();
            System.out.println("");
            System.out.println("Monitor");
        mnt.info();
        System.out.println("");
        Bola bolaUmum = new Bola("Nike", 22);
        BolaBasket bolaBasket = new BolaBasket("Mikasa", 24, "Kulit");
        Bola bola1 = bolaUmum;
        Bola bola2 = bolaBasket;
        System.out.println("Bola");
        bola1.info();
        System.out.println("Volume Bola: " + bola1.hitungVolume() + " cm³");
        System.out.println();
        System.out.println("");
        System.out.println("Bola Basket");
        bola2.info();
        System.out.println("Volume Bola Basket: " + bola2.hitungVolume() + " cm³");
        System.out.println("");
        PC pc = new PC(16, "Intel I7", "Nvidia RTX 3060", "1TB", 50, "500Watt");
        Laptop laptop = new Laptop(12, "Intel i5", "Nvidia GTX 1080", "500GB", 20);
        pc.hidupkan(true);
        laptop.hidupkan(true);
        pc.naikvolume(10);
        laptop.turunvolume(5);
        System.out.println("PC");
        pc.info();
        System.out.println("");
        System.out.println("Laptop");
        laptop.info();
        System.out.println("");
        System.out.println("Earphone");
        Earphone ear1 = new Earphone("Jack", 20);
        ear1.naikvolume(30);
        ear1.info();
        System.out.println("");
        System.out.println("TWS");
        TWS tws1 = new TWS("Bluetooth", 50, 100);
        tws1.turunvolume(10);
        tws1.info();
        
    }
}
