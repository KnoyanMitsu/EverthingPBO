/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1.Sepeda;

/**
 *
 * @author knoyan
 */
public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;
    
    
    public SepedaGunung(String m, int k, int g, String t) {
        super(m, k, g);
        tipeSuspensi = t;
    }
    

    
    public void info(){
        super.info();
        System.out.println("Suspensi: " + tipeSuspensi);
    }
    

}
