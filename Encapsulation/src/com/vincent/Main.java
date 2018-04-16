package com.vincent;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player player = new Player();
        player.name = "vincent";
        player.health = 50;
        player.weapon = "sword";

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        damage = 31;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());
    }
}
