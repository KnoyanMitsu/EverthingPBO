/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;

/**
 *
 * @author knoyan
 */
public class ClassB extends ClassA{
    public int z;

    public ClassB() {
        super(0, 0);
    }

    
    
    public ClassB(int z,int y,int x) {
        super(x, y);
        this.z = z;
        
    }
    
    
    
    
    public void getNilaiZ(){
        System.out.println("nilai Z: " +z);
        
    }
    
    public void getJumlah(){
        System.out.println("jumlah:" + (x+y+z));
    }
}
