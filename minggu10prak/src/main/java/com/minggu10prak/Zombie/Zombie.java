package com.minggu10prak.Zombie;

abstract class Zombie implements Destroyable{
    protected int health, level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    public String getZombieInfo() {
        return "Health: " + health + ", Level: " + level;
    }
    
}
