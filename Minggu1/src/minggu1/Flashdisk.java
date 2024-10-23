/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

/**
 *
 * @author knoyan
 */
public class Flashdisk {
    private String merek,storage,status;
    private boolean konek;

    public Flashdisk(String m,String s){
        storage = s;
        merek = m;
    }
    
    
    public boolean connect(boolean on){
        konek = on;
        
        if (konek == true){
            status = "Connect";
        }else{
            status = "Disconnect";
        }
        
        return konek;
    }
    
    public void info(){
        System.out.println("Merek Flashdisk: " + merek);
        System.out.println("Storage: " + storage);
        System.out.println("Status: " + status);
    }
}
