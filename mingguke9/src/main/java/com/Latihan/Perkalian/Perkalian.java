package com.Latihan.Perkalian;

public class Perkalian {
    void perkalian (int d, int e){
        System.out.println(d*e);
    }

    void perkalian (int a, int b, int c){
        System.out.println(a*b*c);
    }

    public static void main(String[] args) {
        Perkalian obj = new Perkalian();
        obj.perkalian(25,43);
        obj.perkalian(34,23,56);
    }
}
