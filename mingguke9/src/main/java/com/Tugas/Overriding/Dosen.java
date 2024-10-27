package com.Tugas.Overriding;

public class Dosen extends Manusia{
    @Override
    void makan() {
        System.out.println("Sedang Makan");
    }

    void lembur() {
        System.out.println("Sedang Lembur");
    }
}
