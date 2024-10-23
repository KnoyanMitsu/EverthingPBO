/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesalahan;

/**
 *
 * @author knoyan
 */
public class Kesalahan_Cyclic {
    class B extends A {
        
    }

    class A extends B { 
        public static void main(String[] args) {
            A obj = new A();
        }
    }

}
