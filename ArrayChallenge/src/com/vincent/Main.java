package com.vincent;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        int[] myinterger = getinter(7);
        int[] sorted = sortArray(myinterger);
        displayArray(sorted);


    }

    public static int[] getinter(int mynubers){

        int[] enteredNumbers = new int[mynubers];

        System.out.println("enter numbers \r");

        for (int i = 0; i < enteredNumbers.length; i ++){

            enteredNumbers[i] = scanner.nextInt();
        }

        return enteredNumbers;
    }
    public static void  displayArray(int [] myarray){

        for (int i = 0; i<myarray.length; i++){

            System.out.println("you entered " + myarray[i]);
        }

    }

    public static int[] sortArray(int [] myarray){

        int[] sordingArray = new int[myarray.length];

        for (int i = 0; i<myarray.length; i++){

            sordingArray[i] = myarray[i];

        }

        boolean flag = true;
        int temp;

        while (flag){

            flag = false;
            for (int i = 0; i<sordingArray.length-1; i ++){
                if (sordingArray[i]<sordingArray[i+1]){
                    temp = sordingArray[i];
                    sordingArray[i] = sordingArray[i+1];
                    sordingArray[i+1] = temp;
                    flag = true;
                }
            }

        }

        return sordingArray;

    }
}
