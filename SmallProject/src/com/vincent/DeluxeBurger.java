package com.vincent;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Beacon", 14.54, "white");
        super.addHamberAddition1("Chips", 2.75);
        super.addHamberAddition2("Drink", 3.65);

    }


    @Override
    public void addHamberAddition1(String name, double price) {
        System.out.println("cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamberAddition2(String name, double price) {
        System.out.println("cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamberAddition3(String name, double price) {
        System.out.println("cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamberAddition4(String name, double price) {
        System.out.println("cannot not add additional items to a deluxe burger");
    }


}
