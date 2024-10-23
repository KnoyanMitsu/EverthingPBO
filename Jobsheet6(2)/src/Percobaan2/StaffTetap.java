/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;

/**
 *
 * @author knoyan
 */
public class StaffTetap extends Staff {
    public String golongan;
    public int asusransi;

    public StaffTetap() {
    }

    public StaffTetap(String golongan, int asusransi, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asusransi = asusransi;
    }
    
    public void tampilStaffTetap(){
        System.out.println("==========Data Staff Tetap==========");
        super.tampilDataStaff();
        System.out.println("Golongan            ="+golongan);
        System.out.println("Jumlah Asuransi            ="+asusransi);
        System.out.println("Gaji Bersih            ="+(gaji+lembur-potongan-asusransi));

    }
}
