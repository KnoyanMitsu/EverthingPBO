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

}

class babyCat extends Cat{
    public void mew(){
        System.out.println("Meeeww");
    }

}

class main{
    
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        babyCat baby = new babyCat();
        System.out.println(" ");
        System.out.println("Bird ");
        bird.eat();
        bird.fly();
        bird.sleep();
        bird.twit();
        System.out.println(" ");
        System.out.println("Cat ");
        cat.eat();
        cat.meow();
        cat.walk();
        cat.sleep();
        System.out.println(" ");
        System.out.println("Baby cat ");
        baby.eat();
        baby.mew();
        baby.walk();
        baby.sleep();
        
    }
}