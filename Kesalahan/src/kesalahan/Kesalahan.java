/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kesalahan;

/**
 *
 * @author knoyan
 */


    class A {
        void display() {
            System.out.println("Class A Display");
        }
    }

    class B {
        void display() {
            System.out.println("Class B Display");
        }
    }

    class C extends A, B {
        public static void main(String[] args) {
            C obj = new C();
            obj.display();
        }
    }
    
