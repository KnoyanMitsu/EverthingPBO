package com.Tugas.Overloading;

public class Segitiga {
    public int sudut;

    int totalSudut(int sudutA) {
        return 180 - sudutA;
        
    }

    int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
        
    }

    int keliling(int sudutA, int sudutB, int sudutC) {
        return sudutA + sudutB + sudutC;
        
    }

    double keliling(int sudutA, int sudutB) {
        return Math.sqrt(Math.pow(sudutB, 2) + Math.pow(sudutA, 2));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total sudut dengan satu sudut: " + segitiga.totalSudut(90));
        System.out.println("Total sudut dengan dua sudut: " + segitiga.totalSudut(90, 60));
        System.out.println( "Keliling dengan tiga sisi: " + segitiga.keliling(90, 60, 30));
        System.out.println( "Keliling dengan dua sisi: " + segitiga.keliling(5, 5));
    }
}
