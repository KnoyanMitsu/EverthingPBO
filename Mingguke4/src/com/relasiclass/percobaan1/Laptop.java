/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.percobaan1;

/**
 *
 * @author knoyan
 */
public class Laptop{
    private String merk;
    private Processor proc;
    
    public Laptop(){
        
    }
    
    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    
        
    public void setProc(Processor proc){
        this.proc = proc;
    }
    
    public Processor getProc(){
        return this.proc;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getmerk(){
        return this.merk;
    }
    
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
