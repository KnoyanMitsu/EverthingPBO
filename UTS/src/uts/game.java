/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author knoyan
 */
public class game extends sofware{
    private String  jenisAPIGraphics, Genre;

    public game(String jenisAPIGraphics, String Genre, String namaSoftware, String jenisAplikasi, String supportOS, int minimalRam, double versi) {
        super(namaSoftware, jenisAplikasi, supportOS, minimalRam, versi);
        this.jenisAPIGraphics = jenisAPIGraphics;
        this.Genre = Genre;
    }
    
    
    void getGame(){
        super.getSoftware();
        System.out.println("Jenis API Graphics: " + this.jenisAPIGraphics);
        System.out.println("Genre: A" + this.Genre);
    }
}
