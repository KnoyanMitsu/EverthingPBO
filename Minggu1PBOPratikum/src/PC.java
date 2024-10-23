/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author knoyan
 */
public class PC extends Laptop{
    private String powersupplieswatt;
    
    public PC(int r, String p, String g, String s, int v, String ps) {
        super(r, p, g, s, v);
        powersupplieswatt = ps;
    }
    
    public void infopc(){
        super.info();        
        System.out.println("Power Supplies Watt: " + powersupplieswatt);
    }
    
}
