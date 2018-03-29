package com.vincent;

public class Main {

    public static void main(String[] args) {
	// example switch statement
    /*
        int value =3;
        if(value==1){
            System.out.println("value was 1");

        }
        else if(value == 2)
        {
            System.out.println( "value is 2");
        }
        else{
            System.out.println("was not 1 or 2");
        }

       */
        int switchvalue = 2;

        switch (switchvalue){
            case 1:

                System.out.println("value was 1 ");
                break;

            case 2:

                System.out.println("value was 2");
                break;

            default:
                System.out.println("was not1 or 2");

                break;
        }

        /*
         create a new switch using char instead of a int
         create a new char veriable
         create a switch statement testing for
         a , b , c , d or e
         display a message if any of these are found and then break
         add a default which displays a message saying not found
        */

        char myChar = 'a';

        switch (myChar)
        {
            case 'a':
                System.out.println("your char was "+ myChar);

                break;

            case 'b':
                System.out.println("your char was "+ myChar);

                break;

            case 'c':
                System.out.println("your char was "+ myChar);
                break;

            case'd':
                System.out.println("your char was "+ myChar);
                break;

            case 'e':
                System.out.println("your char was "+ myChar);

                break;

            default:
                System.out.println("you did'nt enter a b c d or e");


        }
        String month ="January";

        switch (month.toLowerCase())
        {
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("june");
                break;
            case "october":
                System.out.println("oct");
                break;
           default:
                System.out.println("cant be found");
                break;
        }
    }
}
