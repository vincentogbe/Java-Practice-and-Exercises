package com.vincent;

public class Main {

    public static void main(String[] args) {

       //example of methods
       int finalScore;

        finalScore=calculateScore(true,800,5,100);
        System.out.println("your final score was " +finalScore);

        finalScore=calculateScore(true,10000,8,200);
        System.out.println("your final score was " +finalScore);

        // practise using methods
        String name;
        int myScore;

       myScore = caluclateHighScorePositon(1500);
        displayHighscorePostion("vincent",myScore);
        System.out.println("you finished number = "+ myScore + " on the score table");
        myScore = caluclateHighScorePositon(900);
        displayHighscorePostion("josh",myScore);
        System.out.println("you finished number = "+ myScore + " on the score table");
        myScore = caluclateHighScorePositon(400);
        displayHighscorePostion("mark",myScore);
        System.out.println("you finished number = "+ myScore + " on the score table");
        myScore = caluclateHighScorePositon(50);
        displayHighscorePostion("sean",myScore);
        System.out.println("you finished number = "+ myScore + " on the score table");



    }

    //example method

    public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+= 2000;
            return finalScore;
        }
        return -1;

    }

    // prcatise method

    public static void displayHighscorePostion(String name, int highScore){

        System.out.println(name +" manged to get into position " +highScore + " on the high score table" );

    }

    public static int caluclateHighScorePositon(int score){

        if(score >=1000){
            return 1;
        }
        else if ((score >=500 && score< 1000)){
            return 2;

        }
        else if (score >=100 && score < 500){
            return 3;
        }
        else
        {
            return 4;
        }


    }
}
