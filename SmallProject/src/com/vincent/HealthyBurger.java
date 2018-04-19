package com.vincent;

public class HealthyBurger extends Hamburger {

    private String healthyEXtraName;
    private  double healthyExtraPrise;

    private String healthyEXtraName2;
    private  double healthyExtraPrise2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");

    }
    public void addHealthyAddition(String name, double price){
        this.healthyEXtraName = name;
        this.healthyExtraPrise = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyEXtraName2 = name;
        this.healthyExtraPrise2 = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(this.healthyEXtraName != null){
            hamburgerPrice += this.healthyExtraPrise;
            System.out.println("Added " + this.healthyEXtraName + "for an extra " + this.healthyExtraPrise);
        }
        if(this.healthyEXtraName2 != null){
            hamburgerPrice += this.healthyExtraPrise2;
            System.out.println("Added " + this.healthyEXtraName2 + "for an extra " + this.healthyExtraPrise2);
        }
        return hamburgerPrice;
    }
}
