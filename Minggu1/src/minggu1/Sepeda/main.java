/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1.Sepeda;

/**
 *
 * @author knoyan
 */
public class main {
    public static void main(String[] args) {
        
        
        Sepeda spd1 = new Sepeda("Poligon", 10, 1);
        SepedaGunung spd2 = new SepedaGunung("Tango", 10, 1, "Dual");
        
        spd1.tambahKecepatan(10);
        spd1.info();
        System.out.println();
        spd2.tambahKecepatan(15);
        spd2.info();
    }
}
