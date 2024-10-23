/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kebenaran;

/**
 *
 * @author knoyan
 */
    interface A {
        void display();
    }

    interface B {
        void display();
    }

    class C implements A, B {
        // Mengimplementasikan metode display()
        public void display() {
            System.out.println("Class C Display");
        }

    }
