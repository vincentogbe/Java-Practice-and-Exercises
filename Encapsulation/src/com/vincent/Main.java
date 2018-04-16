package com.vincent;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
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

         */

        EnhancedPlayer player = new EnhancedPlayer("vin", 80, "sword");

            System.out.println("Initial health is " + player.getHealth());

    }



}
