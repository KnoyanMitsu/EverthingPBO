package com.Tugas.Overriding;

public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("----------MAHASISWA-------------");
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();
        System.out.println("----------DOSEN-------------");
        Dosen dosen = new Dosen();
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();
    }
}
