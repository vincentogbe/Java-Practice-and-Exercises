package com.vincent;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gear, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;

    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): change to "+this.currentGear+" gear.");
    }
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println(" car.changeVelocity() : velocity "+ speed+" direction "+ direction);
    }


}