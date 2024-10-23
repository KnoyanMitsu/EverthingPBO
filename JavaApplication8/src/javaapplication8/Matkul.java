/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author knoyan
 */
public class Matkul {
    private String matkul;
    private Bio bio;

    public Matkul() {
    }

    public String getMatkul() {
        return matkul;
    }

    public Matkul(String matkul, Bio bio) {
        this.matkul = matkul;
        this.bio = bio;
    }

    public Bio getBio() {
        return bio;
    }

    public void setBio(Bio bio) {
        this.bio = bio;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }
    
     
    
    public String getInfo(){
        String info = "";
        info += this.bio.getInfo();
        info += "Matkul: " + this.matkul + "\n";
        return info;
    }
}
