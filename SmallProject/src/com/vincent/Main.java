package com.vincent;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("normal","chicken",3.45,"white");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamberAddition1("Tomato", 0.27);
        hamburger.addHamberAddition2("Lettuce",0.75);
        hamburger.addHamberAddition3("cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);
        healthyBurger.itemizedHamburger();
        healthyBurger.addHealthyAddition("egg", 5.34);
        healthyBurger.addHealthyAddition2("lettuce",0.23);
        System.out.println("Total Healthy Burger prise is " + healthyBurger.itemizedHamburger() );

        DeluxeBurger db = new DeluxeBurger();
        db.itemizedHamburger();
        db.addHamberAddition1("should not do this", 50.53);
        // write your code here
    }
}
