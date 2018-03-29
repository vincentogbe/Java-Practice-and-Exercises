package com.vincent;

public class Main {

    public static void main(String[] args) {
        // write your code here

         /*
        using the for statement, call the calculateInterest method with
        the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        and print the results to the console window.
        */


        double number  = 2.0;
        for(int i= 2; i<=8; i++){
            System.out.println("10,000 at "+i+ "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));


        }
        System.out.println("\n \n \n ");
        /*
        how would you modify the for loop above to do the same thing as
        shown but to start from 8% and work back to 2%
        */
        for(int i= 8; i>=2; i--){
            System.out.println("10,000 at "+i+ "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));


        }


        /*
        create a for statement using ang rang of numbers
        determine if the number is a prime number using the isPrime method
        if it is a prime number, print it out AND increment a count of the
        number of prime numbers found
        if the count is 3 exit the for loop
        hint: use the break; statement to exit
        */


        int counter = 0;

        for(int i = 10; i<50; i++){


            if(isPrime(i)){

                counter++;
                System.out.println("this is prime "+ i);
               if(counter ==10){
                   System.out.println("exiting loop ");
                   break;
               }
            }


        }


    }


    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for (int i=2; i <= n/2; i++)
        {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static  double calculateInterest (double amount , double interestRate)
    {
        return (amount*(interestRate/100));
    }

}
