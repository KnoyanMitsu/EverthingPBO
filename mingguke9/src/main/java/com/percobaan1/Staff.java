package com.percobaan1;

public class Staff extends Karyawan {
    public int lembur;
    public double gajilembur;
    public int getLembur() {
        return lembur;
    }
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    public double getGajilembur() {
        return gajilembur;
    }
    public void setGajilembur(double gajilembur) {
        this.gajilembur = gajilembur;
    }

    public double getGaji(int lembur, double gajilembur) {
        return super.getGaji()+lembur*gajilembur;
    }
    public double getGaji() {
        return super.getGaji()+lembur*gajilembur;
    }

    public void lihatInfo() {
        System.out.println("NIP : "+getNip());
        System.out.println("Nama : "+getNama());
        System.out.println("Golongan : "+getGolongan());
        System.out.println("Gaji : "+getGaji());
        System.out.println("Jumlah Lembur : "+this.getLembur());
        System.out.println("Gaji Lembur : "+this.getGajilembur());
        System.out.println("Total Gaji : "+getGaji());
    }


}
