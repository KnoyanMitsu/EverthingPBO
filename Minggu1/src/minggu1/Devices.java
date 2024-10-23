/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu1;

/**
 *
 * @author knoyan
 */
public class Devices {
    private int ram,volume;
    private String merek,proccesor,gpu,storage,status;
    private boolean power;

    public Devices(String m,int r, String p,String g,String s, int v){
        ram = r;
        gpu = g;
        storage = s;
        proccesor = p;
        merek = m;
        volume = v;
    }
    
    
    public boolean hidupkan(boolean on){
        power = on;
        
        if (power == true){
            status = "Hidup";
        }else{
            status = "Mati";
        }
        
        return power;
    }
    
    public int naikvolume(int naik){
        volume += naik;
        return volume;
        
    }
    

    public int turunvolume(int turun){
        volume -= turun;
        return volume;
        
    }
    
    public void info(){
        System.out.println("Merek HP: " + merek);
        System.out.println("RAM: " + ram);
        System.out.println("GPU: " + gpu);
        System.out.println("Storage: " + storage);
        System.out.println("Proccesor: " + proccesor);
        System.out.println("Power Device: " + status);
        System.out.println("Volume: " + volume + "%");
    }
    

    
}
