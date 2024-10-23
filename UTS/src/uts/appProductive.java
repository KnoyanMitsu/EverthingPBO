/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author knoyan
 */
public class appProductive extends sofware{
    private String jenis;
    protected boolean supportOffline;

    public appProductive(String jenis, boolean supportOffline, String namaSoftware, String jenisAplikasi, String supportOS, int minimalRam, double versi) {
        super(namaSoftware, jenisAplikasi, supportOS, minimalRam, versi);
        this.jenis = jenis;
        this.supportOffline = supportOffline;
    }
    
    
    void getApp(){
        super.getSoftware();
        System.out.println("Jenis Kegunaan: " + jenis);
        System.out.println("Offline Only?: " + supportOffline);
    }
}
