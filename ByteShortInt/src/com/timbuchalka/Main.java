package com.timbuchalka;

/**
 * created by vincent ogbe 04/12/2018
 */
public class Main {

    public static void main(String[] args) {
        int MyMinValue = -2147483648;
        int MyMaxValue = -2147483648;
        int myTotal = (MyMaxValue/2);
        System.out.println("myTotal = " + myTotal);

        byte myByteValue = -128;
        byte myNewByte = (byte)(myByteValue/2);
        System.out.println("mynewbyte = "+ myNewByte);

        short myShortValue = 32767;
        short newShortvalue = (short) (myShortValue/2);
        long myLongValue = 9_223_372_036_854_775_807L;
    }
}
