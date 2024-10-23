/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author knoyan
 */
public class main {
    public static void main(String[] args) {
        game Game = new game("DirectX", "FPS", "Call of Duty Warzone", "game", "Windows", 12, 3.1);
        Game.getGame();
        System.out.println("===================================");
        cloudStorage Cloud = new cloudStorage("Google Drive", 12, "Penyimpanan Data", false, "Google Docs", "Aplikasi Produktif", "Android, iOS, Windows, Linux", 1, 0);
        Cloud.getCloud();
        System.out.println("===================================");
        cloudStorage Cloud1 = new cloudStorage("Google Drive", 12, "Penyimpanan Data", true, "Photo", "Aplikasi Produktif", "Android, iOS, Windows, Linux", 1, 0);
        Cloud1.getCloud();
    }
}
