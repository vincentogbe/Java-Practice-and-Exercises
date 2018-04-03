package com.vincent;

public class Fish extends animal {

    private int gills;
    private  int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private  void rest(){

    }
    private void moveMuscles(){

    }
    private void moveFin(){

    }
    private void swim(int speed){

        moveMuscles();
        moveFin();
        super.move(speed);

    }

}
