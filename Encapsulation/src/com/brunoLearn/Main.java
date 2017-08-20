package com.brunoLearn;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.fullName = "Bruno";
//        player.health = 100;
//        player.weapon = "Katana";
//
//        int damage = 50;
//        player.loseHealth(damage);
//        System.out.println("The remaining health is : " + player.healthRemaing());
//
//        damage = 52;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("The remaining health is : " + player.healthRemaing());
//        THIS IS BAD PRACTICE EXAMPLE
        GoodPlayer goodPlayer = new GoodPlayer("Bruno", 101, "Katana");

        System.out.println("Bruno health is : " + goodPlayer.getHitpoints());
    }
}
