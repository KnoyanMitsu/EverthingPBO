/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author knoyan
 */
public class Komputer {
    String merk,jnsProcessor;
    int kecProcessor,sizeMemory;

    public Komputer(String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        this.merk = merk;
        this.jnsProcessor = jnsProcessor;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
    }


    public void tampilData() {
        System.out.println("Merk            : " + merk);
        System.out.println("Kecepatan Processor : " + kecProcessor);
        System.out.println("Ukuran Memory   : " + sizeMemory);
        System.out.println("Jenis Processor : " + jnsProcessor);
    }
    
}
