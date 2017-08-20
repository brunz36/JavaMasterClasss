package com.brunoLearn;

public class GoodPlayer {

    private String name;
    private int hitpoints = 100;
    private String weapon;

    public GoodPlayer(String name, int hitpoints, String weapon) {
        this.name = name;
        if(hitpoints > 0 && hitpoints <= 100 ) {
            this.hitpoints = hitpoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoints -= damage;
        if (this.hitpoints <= 0) {
            System.out.println("Player is knocked out.");
        }
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
