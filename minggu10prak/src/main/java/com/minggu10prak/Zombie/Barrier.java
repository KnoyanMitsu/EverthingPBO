package com.minggu10prak.Zombie;

public class Barrier implements Destroyable{
    private int strength;
    public Barrier(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    @Override
    public void destroyed() {
        strength -= strength * 0.1;
    }

    public String getBarrierInfo() {
        return "Barrier strength = " + strength;
    }
}
