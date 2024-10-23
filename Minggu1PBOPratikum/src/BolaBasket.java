/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author knoyan
 */
class BolaBasket extends Bola {
    private String jenisPermukaan;

    public BolaBasket(String merk, double diameter, String jenisPermukaan) {
        super(merk, diameter);
        this.jenisPermukaan = jenisPermukaan;
    }

    @Override
    public void info() {
        super.info(); 
        System.out.println("Jenis Permukaan: " + jenisPermukaan);
    }

    public void pantulkan() {
        System.out.println("Bola basket dipantulkan.");
    }
}