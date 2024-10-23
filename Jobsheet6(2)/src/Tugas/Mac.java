/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author knoyan
 */
class Mac extends Laptop {
    String security;

        public Mac(String security, String jnsBatrei, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
            super(jnsBatrei, merk, jnsProcessor, kecProcessor, sizeMemory);
            this.security = security;
        }

    

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security        : " + security);
    }
}