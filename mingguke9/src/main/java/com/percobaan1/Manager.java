package com.percobaan1;

public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];
    public double getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public String getBagian() {
        return bagian;
    }
    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
    public void setStaff(Staff st[]) {
        this.st = st;
    }


    public void viewStaff(){
        int i;
        System.out.println("--------------------------");
        for(i=0;i<st.length;i++)
            {
                st[i].lihatInfo();
            }
        System.out.println("--------------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager : " + getBagian());
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Golongan : " + getGolongan());
        System.out.printf("Tunjangan : " + getTunjangan());
        System.out.printf("Gaji : " + getGaji());
        System.out.println("Bagian : " + getBagian());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji()+tunjangan;
    }
}
