package com.vincent;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
	// this is actually important so im just going to put statements in this file

        int myVariable=50;
        myVariable++;
        myVariable--;
        System.out.println("this is a test ");

        System.out.println("this is " + "another" + " still more.");

        //if key words and code blocks

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
/*
        if(score == 5000)
        {
            System.out.println("your score was 5000");

        }
        else
        {
            System.out.println("cant find your score");
        }
 */
    if(gameOver == true){
        int finalScore = score + (levelCompleted * bonus);
        System.out.println(finalScore);
    }
     if(gameOver == true)
     {
         score = 10000;
         levelCompleted = 8;
         bonus =200;
         int secondScore = score + (levelCompleted * bonus);
         System.out.println("your score is "+ secondScore);
     }

    }
}
