package com.minggu10prak.Zombie;

public class WalkingZombie extends Zombie   {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }
    
    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += health * 0.1;
            case 2:
                health += health * 0.2;
            case 3:
                health += health * 0.3;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.02;
    }

    @Override
    public String getZombieInfo() {
        return "Zombie Walking data = \n" + super.getZombieInfo();
    }
    
}
