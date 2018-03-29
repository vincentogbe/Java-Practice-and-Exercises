package com.vincent;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 /3;
        float myFloatValue = 5f /3f;
        double myDoubleValue = 5d /3d;
        System.out.println("myIntValue =" + myIntValue);
        System.out.println("myFloatValue ="+ myFloatValue);
        System.out.println("myDoubleValue = "+ myDoubleValue);


        double Pounds = 200d;

        double kilograms = 0.45359237d * Pounds;

        System.out.println("there is "+ kilograms + " kilograms in " + Pounds + " pounds");
    }
}
