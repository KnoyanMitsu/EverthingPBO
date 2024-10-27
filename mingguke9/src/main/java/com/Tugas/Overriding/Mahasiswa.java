package com.Tugas.Overriding;

public class Mahasiswa extends Manusia{
    @Override
    public void makan() {
        System.out.println("Sedang Makan");
    }

    public void tidur() {
        System.out.println("Sedang Tidur");
    }
}
