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
public class ClassB extends ClassA{
    public int z;
    
    public void setZ(int z){
        this.z = z;
    }
    
    public void getNilaiZ(){
        System.out.println("nilai Z: " +z);
        
    }
    
    public void getJumlah(){
        System.out.println("jumlah:" + (x+y+z));
    }
}
