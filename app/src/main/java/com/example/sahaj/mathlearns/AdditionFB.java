package com.example.sahaj.mathlearns;

import java.util.Random;
public class AdditionFB {


    public static int getCorrect() {
        return correct;
    }

    public static void setCorrect(int correct) {
        AdditionFB.correct = correct;
    }

    public static int getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(int difficulty) {
        AdditionFB.difficulty = difficulty;
    }

    static int correct = 0;
    static int difficulty = 20;

    static Random randomGen  = new Random();
    static int num1 = 0;
    static int num2 = 0;
    static int result  = 0;


    public static double isRight(Double submitted){     //AdditionFB check answer
        result  = num1 + num2;
        if(submitted == result) {
            return 1.0;
        }
        if(submitted == null){
            return 0.0;
            }
        if(submitted != result && !(submitted == null)){
            return -1.0;
        }
        return 0.0;
    }
    public static String askMe(){   //AdditionFB question
        num1 = randomGen.nextInt(difficulty-1)+1;
        num2 = randomGen.nextInt(difficulty-1)+1;
        return "What is " + num1 + " + " + num2;
    }


}
