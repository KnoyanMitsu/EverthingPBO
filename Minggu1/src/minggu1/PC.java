/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

/**
 *
 * @author knoyan
 */
public class PC extends Devices {
    private String powersupplies,merekfan;
    
    public PC(String m, int r, String p, String g, String s, int v, String ps, String mf) {
        super(m, r, p, g, s, v);
        powersupplies = ps;
        merekfan = mf;
    }
    
    public void infopc(){
        super.info();        
        System.out.println("Power Supplies: " + powersupplies);
        System.out.println("Merek Fan: " + merekfan);
    }
    

}
