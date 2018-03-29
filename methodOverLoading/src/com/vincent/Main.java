package com.vincent;

public class Main {

    public static void main(String[] args) {
        //example of over loading methods
        int newscore = calulateScore("vincent", 500);
        System.out.println("new score is "+ newscore);
        //calling functions
        calulareScore(75);
        calulareScore();
        //..........................................................................
        double inches = 34;

        double centimeters = (calcFeetAndInchesToCentimeters(inches));


        if (centimeters >=0){
        System.out.println( centimeters );
        }
        else{
            System.out.println("this is'nt working ");
        }
        //............................................................................
    }
    //example methods
    public static int calulateScore(String playerName, int score){
        System.out.println(" player "+playerName+ " score "+score+ " points");
        return score*1000;
    }
    public static int calulareScore (int score){
        System.out.println("unnamed player scored "+ score + " points");
        return score*1000;
    }
    public static int calulareScore (){
        System.out.println("No play name"+" no points \n \n \n ");
        return 0;
    }
    //...................................................................................
    //exercise example
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){


        if (feet >=0 || inches >=0 && inches <=12 ){

           double centimeters = ((feet * 12) + inches) * 2.54;
           return centimeters;

        }
        else {
            return -1;
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches >=0){


            double feet = inches /12;
            inches = inches % 12;

            return  calcFeetAndInchesToCentimeters(feet , inches);



        }
        else {

            return -1;
        }
//.............................................................................................

    }
}
