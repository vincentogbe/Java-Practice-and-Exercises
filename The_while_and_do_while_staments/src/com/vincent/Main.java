package com.vincent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //while loop
        /*
        int count = 1;
        while(count!=6){
            System.out.println("count value is "+ count);
            count++;
        }
        //end while

        System.out.println("**************************************");
        // for loop
        for (count = 1; count !=6; count++){
            System.out.println("count value is " + count);
        }
        // end for

        System.out.println("****************************************");
        count = 1;

        while (true) {
            if (count == 6) {
                break;
            } else {
                System.out.println("count value is " + count);
                count++;
            }
        }
        // end while

        System.out.println("******************************************");

        //do while
        count=1;
        do{
            System.out.println("count value is " + count);
            count++;

        }while(count != 6);
        */

        /*
        create a method called isEvenNumber that takes a parameter of type int
        its purpose is to determine if the argument passed to the method is
        an even number or not.
        return true if its an even number, otherwise return false
         */

        int number = 4;
        int finnishnumber = 20;

        while(number <= finnishnumber)
        {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("even number "+number);

        }


    }
    public static boolean isEvenNumber(int count){
        if(count%2 == 0 ){
            return true;
        }
        else
        {
            return false ;
        }
    }
}
