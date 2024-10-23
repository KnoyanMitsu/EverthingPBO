/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author knoyan
 */
public class TV {
   private String status,jarak;
    private boolean power;
    private int volume,inch;
    
    
    public TV(String j,int v, int i){
        jarak = j;
        volume = v;
        inch = i;

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
        System.out.println("Jarak Melihat: " + jarak);
        System.out.println("Volume: " + volume);
        System.out.println("Kondisi: " + status);
        System.out.println("Inch TV: " + inch+ '"');
    }
    

}
