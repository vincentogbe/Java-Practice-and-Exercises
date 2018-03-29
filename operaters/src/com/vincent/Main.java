package com.vincent;

public class Main {

    public static void main(String[] args) {

        int result = 1+2;
        System.out.println("1 + 2 = "+result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result );

        previousResult = result;

        result = result / 5;

        System.out.println(previousResult + " / 5 = " + result );

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result );


        previousResult = result;
        result = result + 1;

        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result+=2;
        System.out.println("Result is now " + result);

        result*=10;
        System.out.println("Result is now " + result);

        result-=10;
        System.out.println("Result is now " + result);

        result/=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true){
            System.out.println("is an alien");
        }
        else{
            System.out.println("is not an alien");
        }
    }
}
