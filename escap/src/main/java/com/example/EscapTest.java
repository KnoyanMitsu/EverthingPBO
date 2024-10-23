package com.example;

public class EscapTest {
    public static void main(String[] args) {
        EscapDemo encap = new EscapDemo();
        encap.setNama("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getNama());
        System.out.println("Age : " + encap.getAge());
    }    
}
