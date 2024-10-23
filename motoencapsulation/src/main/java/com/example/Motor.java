package com.example;

public class Motor {
    private int kecepatan = 90;
    private boolean kontakOn= false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }


    public void tambahKecepatan(){
        if(kontakOn == true){
            if (kecepatan + 5 > 100) {
                kecepatan = 100;
                System.out.println("Kecepatan sudah mencapai batas maksimal!");
            } else {
                kecepatan += 5;
            }
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!");
        }
    }


    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!");
        }
    }

    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak on");
        }else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
