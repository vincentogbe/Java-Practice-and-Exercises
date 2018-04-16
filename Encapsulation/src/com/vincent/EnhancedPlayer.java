package com.vincent;

public class EnhancedPlayer {

    private String name;
    private int hitpoints;
    private String weapon;


    public EnhancedPlayer(String name, int health, String weapon) {

        this.name = name;

        if (health>0 && health <= 100){

            this.hitpoints = health;
        }


        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitpoints = hitpoints - damage;
        if(this.hitpoints <=0){
            System.out.println("player is out");
        }
    }
    public int healthRemaining(){
        return this.hitpoints;
    }

    public int getHealth() {
        return hitpoints;
    }
}
