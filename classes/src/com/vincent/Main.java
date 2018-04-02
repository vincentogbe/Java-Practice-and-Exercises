package com.vincent;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setDoors(4);
        porsche.setWheels(4);
        porsche.setModel("porsche");
        porsche.setEngine("clean");
        porsche.setColour("black");

        System.out.println("car has "+ porsche.getDoors() +" doors " +porsche.getWheels()
         + " wheels and is a " + porsche.getModel() +" it is "+ porsche.getEngine()+" and its " + porsche.getColour());
    }
}
