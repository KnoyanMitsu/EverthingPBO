/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author knoyan
 */
class Laptop extends Komputer {
    String jnsBatrei;

        public Laptop(String jnsBatrei, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
            super(merk, jnsProcessor, kecProcessor, sizeMemory);
            this.jnsBatrei = jnsBatrei;
    }

    

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai   : " + jnsBatrei);
    }
    }