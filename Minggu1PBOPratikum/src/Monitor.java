/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author knoyan
 */
public class Monitor extends TV {
    private int height,width;
    
    public Monitor(String j, int v,int i, int h, int w) {
        super(j, v,i);
        height = h;
        width = w;
    }
    
    public void info(){
        super.info();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }
    
}
