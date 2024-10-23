/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author knoyan
 */
public class Earphone {
    private String TypeConnection;
    private int volume;
    
    public Earphone(String tc,int v){
        TypeConnection = tc;
        volume = v;

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
        System.out.println("Volume: " + volume + "%");
        System.out.println("Tipe Koneksi: " + TypeConnection);

    }
    
}
