/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author knoyan
 */
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    public DaftarGaji(int maxSize) {
        listPegawai = new Pegawai[maxSize];
        count = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (count < listPegawai.length) {
            listPegawai[count] = pegawai;
            count++;
        } else {
            System.out.println("Daftar gaji sudah penuh.");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < count; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("Nama: " + pegawai.getNama() + ", Gaji: " + pegawai.getGaji());
        }
    }
}
