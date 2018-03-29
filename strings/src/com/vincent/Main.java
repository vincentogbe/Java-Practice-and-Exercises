package com.vincent;

public class Main {

    public static void main(String[] args) {
        String  mystring = "this is a string";
        System.out.println(mystring);
        mystring = mystring + " and more ";
        System.out.println(mystring);
        mystring = mystring + " \u00A9";
        System.out.println(mystring);

        String numberString = "250.55";
        System.out.println(numberString);
        numberString = numberString +" 49.95";
        System.out.println(numberString);

        String laststring = "10";
        int myint  = 50;
        laststring = laststring + myint;
        System.out.println( laststring);
        double mydouble = 129.47;
        laststring = laststring + mydouble;
        System.out.println("my last number is " + laststring);
    }
}
