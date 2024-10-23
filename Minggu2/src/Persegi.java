/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author knoyan
 */
public class Persegi {
    private int sisi,hasil;
    
    
    public void hitung(int Value){
        sisi = Value;
        hasil = sisi * sisi;
    }
    
    public void info(){
        System.out.println("Sisi: " + sisi + "cm");
        System.out.println("Hasil: " + hasil + "cm");
    }
    
    public static void main(String[] args){
        Persegi persegi1 = new Persegi();
        persegi1.hitung(4);
        persegi1.info();
    }
}
