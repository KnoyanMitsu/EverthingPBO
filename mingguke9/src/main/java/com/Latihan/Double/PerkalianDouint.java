package com.Latihan.Double;

public class PerkalianDouint {
    void perkalian (int a, int b){
        System.out.println(a*b);
    }

    void perkalian (double a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        PerkalianDouint obj = new PerkalianDouint();
        obj.perkalian(25,43);
        obj.perkalian(34.56,23.7);
    }
}
