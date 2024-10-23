/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

/**
 *
 * @author knoyan
 */
public class main {
    public static void main(String[] args) {
        PC device1 = new PC("Z790 AORUS XTREME X ",16,"Intel I5 Gen 14 14400f","NVIDIA GeForce RTX3060","1TB",100,"750 Watt","Corsair H100");
        device1.turunvolume(50);
        device1.hidupkan(false);
        device1.infopc();
        System.out.println();        
        Laptop Device2 = new Laptop("MSI gf65 thin 10ue",8,"Intel Core i7-10750H+HM470","NVIDIA GeForce RTX3060 Max-Q, GDDR6 6GB","512GB",20,"75 Watt",80);
        Device2.naikvolume(50);
        Device2.hidupkan(true);
        Device2.infolaptop();
        System.out.println();        
        Handheld device3 = new Handheld("Steam Deck",16,"Zen 2 4c/8t, 2.4-3.5GHz","8 RDNA 2 CUs, 1.6GHz ","512 GB",100,80);
        device3.turunvolume(20);
        device3.hidupkan(true);
        device3.infohh();
        System.out.println();        
        HP device4 = new HP("Poco F5",8,"Snapdragon 7+ gen 2","Adreno 725","128GB",100,80);
        device4.turunvolume(50);
        device4.hidupkan(true);
        device4.infohp();
        System.out.println();
        Flashdisk device5 = new  Flashdisk("Sandisk","1TB");
        device5.connect(true);
        device5.info();
        
    }
}
