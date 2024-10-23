/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author knoyan
 */
public class Laptop {
    private int ram,volume;
    private String proccesor,gpu,storage,status;
    private boolean power;

    
    public Laptop(int r, String p,String g,String s, int v){
        ram = r;
        gpu = g;
        storage = s;
        proccesor = p;
        volume = v;
        
    }
    
    
    public void hidupkan(boolean on){
        power = on;
        
        if (power == true){
            status = "Hidup";
        }else{
            status = "Mati";
        }
        
    }
    
    public void naikvolume(int naik){
        volume += naik;
        
    }
    

    public void turunvolume(int turun){
        volume -= turun;
        
    }
    
    public void info(){
        System.out.println("RAM: " + ram + "GB");
        System.out.println("GPU: " + gpu);
        System.out.println("Storage: " + storage);
        System.out.println("Proccesor: " + proccesor);
        System.out.println("Power Device: " + status);
        System.out.println("Volume: " + volume + "%");
    }
    

}
