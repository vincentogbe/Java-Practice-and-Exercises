package com.vincent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        challenge
        start with a base class of a vehicle, then create a car class that inherits from this base class.
        finally, create another class, a specific type of car that inherits from the car class.
        you should be able to hand steering, changing gears, and moving (speed in other word).
        you will want to decide where to put the appropriate state and behaviours(fields and methods).
        as mentioned above, changing gears, increasing/decreasing speed should be included.
        for you specific type of vehicle you will want to add something specific for that type of car
         */

       SportsCar sportsCar = new SportsCar(36);
        sportsCar.steer(45);
       sportsCar.accelerate(30);
        sportsCar.accelerate(20);
        sportsCar.accelerate(-42);
    }
}
