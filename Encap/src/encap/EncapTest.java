/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;

/**
 *
 * @author knoyan
 */
public class EncapTest {
    public static void main(String args[]) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        
        encap.setAge(16);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());

        encap.setAge(20);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    
    }
}
