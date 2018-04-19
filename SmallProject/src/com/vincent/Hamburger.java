package com.vincent;

public class Hamburger {
    private String name;
    private String meat;
    private double price = 0;
    private String broad;

    private String additionalIteams;
    private double additionalprise;

    private String additional2;
    private double additionalprise2;

    private String additional3;
    private double additionalprise3;

    private String additional4;
    private double additionalprise4;

    public Hamburger(String name, String meat, double price, String broad) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.broad = broad;
    }

    public void addHamberAddition1(String name, double price){

        this.additionalIteams = name;
        this.additionalprise = price;
    }
    public void addHamberAddition2(String name, double price){

        this.additional2 = name;
        this.additionalprise2 = price;
    }
    public void addHamberAddition3(String name, double price){

        this.additional3 = name;
        this.additionalprise3 = price;
    }
    public void addHamberAddition4(String name, double price){

        this.additional4 = name;
        this.additionalprise4 = price;
    }



    public double itemizedHamburger(){
    double hamburgerPrise = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.broad + " roll with "+ meat +
                ", prise is " + this.price);

        if (this.additionalIteams !=null){
            hamburgerPrise += this.additionalprise;
            System.out.println("Added " + this.additionalIteams + " for an extra " + this.additionalprise);
        }
        if (this.additional2 !=null){
            hamburgerPrise += this.additionalprise2;
            System.out.println("Added " + this.additional2 + " for an extra " + this.additionalprise2);
        }
        if (this.additional3 !=null){
            hamburgerPrise += this.additionalprise3;
            System.out.println("Added " + this.additional3 + " for an extra " + this.additionalprise3);
        }
        if (this.additional4 !=null){
            hamburgerPrise += this.additionalprise4;
            System.out.println("Added " + this.additional4 + " for an extra " + this.additionalprise4);
        }

        return hamburgerPrise;
    }
}


