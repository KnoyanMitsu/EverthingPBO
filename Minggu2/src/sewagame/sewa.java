/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewagame;

/**
 *
 * @author knoyan
 */
public class sewa {
    private int id,lamaSewa, hargaPerHari;
    private String namaMember,namaGame;


   
    public sewa(int id, String namaMember, String namaGame, int lamaSewa, int hargaPerHari) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.lamaSewa = lamaSewa;
        this.hargaPerHari = hargaPerHari;
    }

    public double hitungHarga() {
        return lamaSewa * hargaPerHari;
    }

    public void tampilData() {
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Harga per Hari: Rp" + hargaPerHari);
        System.out.println("Total Harga yang Harus Dibayar: Rp" + hitungHarga());
    }
}
