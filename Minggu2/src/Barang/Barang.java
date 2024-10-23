/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang;

/**
 *
 * @author knoyan
 */
public class Barang {
    String kode,namaBarang;
    int hargaDasar;
    float diskon;

    public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual() {
        return (int)(hargaDasar - (diskon / 100 * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp" + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Jual: Rp" + hitungHargaJual());
    }

}
