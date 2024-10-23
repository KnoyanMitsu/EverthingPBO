package com.pbo.Overloading;

public class main {
    public static void main(String[] args) {
        math obj = new math();
        System.out.println(obj.tambah(10, 20));
        System.out.println(obj.tambah(10, 20, 30));
        System.out.println(obj.tambah(10.5, 20.5));
    }
}
