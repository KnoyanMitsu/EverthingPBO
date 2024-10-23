/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author knoyan
 */
class Pc extends Komputer {
    int ukuranMonitor;

        public Pc(int ukuranMonitor, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
            super(merk, jnsProcessor, kecProcessor, sizeMemory);
            this.ukuranMonitor = ukuranMonitor;
        }

    

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor  : " + ukuranMonitor);
    }
}
