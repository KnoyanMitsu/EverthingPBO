/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author knoyan
 */
public class cloudStorage extends appProductive{
    private String providerCloud;
    private int storage;

    public cloudStorage(String providerCloud, int storage, String jenis, boolean supportOffline, String namaSoftware, String jenisAplikasi, String supportOS, int minimalRam, double versi) {
        super(jenis, supportOffline, namaSoftware, jenisAplikasi, supportOS, minimalRam, versi);
        this.providerCloud = providerCloud;
        this.storage = storage;
    }
    
    void getCloud(){
        if (super.supportOffline) {
            System.out.println("Peringatan: Aplikasi ini tidak support Online");
            super.getApp();
        } else {
            super.getApp();
            System.out.println("Provider Cloud: " + providerCloud);
            System.out.println("Storage: " + storage);
        }
    }
}
