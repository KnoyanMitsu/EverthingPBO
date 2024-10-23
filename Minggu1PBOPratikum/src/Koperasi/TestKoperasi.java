/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koperasi;

/**
 *
 * @author knoyan
 */

import java.util.Scanner;
public class TestKoperasi
{
    public static void main(String[] args)
    {
        
    Scanner scanner = new Scanner(System.in);    
    Anggota donny = new Anggota("111333444", "Donny", 5000000);

    System.out.println("Nama Anggota: " + donny.getNama());
    System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
    
    System.out.print("\nMasukkan jumlah pinjaman: ");
    int jumlahPinjam = scanner.nextInt();
    donny.pinjam(jumlahPinjam);
    
    if (donny.getJumlahPinjaman() == 0) {
        return;
    }    
    
    
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    
    System.out.print("\nMasukkan jumlah angsuran: ");
    int jumlahAngsur = scanner.nextInt();
    donny.angsur(jumlahAngsur);

        while (donny.getJumlahPinjaman() > 0) {
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

            System.out.print("\nMasukkan jumlah angsuran: ");
            jumlahAngsur = scanner.nextInt();
            donny.angsur(jumlahAngsur);
            if (donny.getJumlahPinjaman() == 0) {
                break;
            }
        }
        scanner.close();
    }
}
