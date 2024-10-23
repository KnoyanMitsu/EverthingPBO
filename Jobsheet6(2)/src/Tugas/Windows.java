/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author knoyan
 */
class Windows extends Laptop {
    String fitur;

        public Windows(String fitur, String jnsBatrei, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
            super(jnsBatrei, merk, jnsProcessor, kecProcessor, sizeMemory);
            this.fitur = fitur;
        }

    

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur           : " + fitur);
    }
}    

