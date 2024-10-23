package com.example;

public class EscapDemo {
    private String name;
    private int age;


    public String getNama(){
        return name;
    }

    public void setNama(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge > 30){
            age = 30;
        }else{
            age = newAge;
        }
    }
}
