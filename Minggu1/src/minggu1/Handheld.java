/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

/**
 *
 * @author knoyan
 */
public class Handheld extends Devices{
    private int battery;
        

    public Handheld(String m, int r, String p, String g, String s, int v, int b) {
        super(m, r, p, g, s, v);
        battery = b;
    }
    
    public void infohh(){
        super.info();
        System.out.println("Battery: " + battery + "%");
        
    }
    
}
