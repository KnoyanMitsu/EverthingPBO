/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author knoyan
 */

public class Animal {
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

class Bird extends Animal{
    public void twit(){
        System.out.println("Tweet");
                
    }
    public void fly(){
        System.out.println("Flying");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("Meoww");
    }
    public void walk(){
        System.out.println("Walking");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        
        bird.eat();
        bird.fly();
        bird.sleep();
        bird.twit();
        
        
        cat.eat();
        cat.meow();
        cat.walk();
        cat.sleep();
        
    }
}
