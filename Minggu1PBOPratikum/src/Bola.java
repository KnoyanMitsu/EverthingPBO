/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author knoyan
 */
public class Bola {
    private String merk;
    private double diameter;

    public Bola(String merk, double diameter) {
        this.merk = merk;
        this.diameter = diameter;
    }

    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Diameter: " + diameter + " cm");
    }

    public double hitungVolume() {
        return (4/3.0) * Math.PI * Math.pow(diameter / 2, 3);
    }
}