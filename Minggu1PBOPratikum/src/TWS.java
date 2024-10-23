/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author knoyan
 */
public class TWS extends Earphone{
    private int battery;
    
    public TWS(String tc, int v, int b) {
        super(tc, v);
        battery = b;
    }
    
    public void info(){     
        super.info();
        System.out.println("Battery: " + battery);

    }
    
}
