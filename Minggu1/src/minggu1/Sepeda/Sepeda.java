/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1.Sepeda;

/**
 *
 * @author knoyan
 */
public class Sepeda {
    private String merk;
    private int kecepatan, gear;

    public Sepeda(String m, int k, int g) {
        merk = m;
        kecepatan = k;
        gear = g;
    }

    public int tambahKecepatan(int increment) {
        kecepatan += increment;
        return kecepatan;
    }

    public int kurangKecepatan(int decrement) {
        kecepatan -= decrement;
        return kecepatan;
    }

    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan);
    }

}

