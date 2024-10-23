/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;

import Percobaan1.*;

/**
 *
 * @author knoyan
 */
public class Inherintance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("2A", 100000, 200000, 250000, "Budi", "Malang", "Lakilaki", 20, 2000000);
        ST.tampilStaffTetap();
        
        StaffHarian SH = new StaffHarian(100, 100000, 50000, "Indah", "Malang", "Perempuan", 27, 10000);
        SH.tampilStaffHarian();
    }
}
