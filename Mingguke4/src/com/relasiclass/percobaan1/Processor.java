/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.relasiclass.percobaan1;

/**
 *
 * @author knoyan
 */
public class Processor {
    private String merk;
    private double cache;
    
    public Processor(){
        
    }
    
    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }
    
    public void setCache(double cache){
        this.cache = cache;
    }
    
    public double getcache(){
        return this.cache;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getmerk(){
        return this.merk;
    }

    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
    
}
