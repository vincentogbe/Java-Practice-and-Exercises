package com.vincent;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myinterger = getinterger(5);

         for(int i=0; i<myinterger.length; i++){

             System.out.println(myinterger[i]);
         }

        System.out.println("The average of your numbers is " + getaverage(myinterger));


    }

    public static int[] getinterger(int myintergers){

        System.out.println(" enter " + myintergers + "integer values.\r");

        int[] values = new int[myintergers];

        for(int i =0; i<values.length;i++ ){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getaverage(int[] number){

        int sum = 0 ;

        for (int i =0; i< number.length;i++){

            sum = sum +number[i];
        }



        return (double)sum/(double)number.length;
    }
}
