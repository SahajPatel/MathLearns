package com.example.sahaj.mathlearns;

import java.util.Random;

public class DivisionFB {


    public static int getCorrect() {
        return correct;
    }

    public static void setCorrect(int correct) {
        DivisionFB.correct = correct;
    }

    public static int getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(int difficulty) {
        DivisionFB.difficulty= difficulty;
    }
    static int correct = 0;
    static int difficulty = 6;


    static Random randomGen = new Random();

    static int num3 = 0;
    static int num4 = 0;
    static int result = 0;


    public static double isRight(Double submitted) {
        result = (num3 * num4)/num3;
        if (submitted == result) {
            return 1.0;
        }
        if (submitted == null) {
            return 0.0;
        }
        if (submitted != result && !(submitted == null)) {
            return -1.0;
        }
        return 0.0;
    }


    public static String askMe(){
        num3 = randomGen.nextInt(difficulty - 1) + 1;
        num4 = randomGen.nextInt(difficulty - 1) + 1;
        return "What is " + num3*num4 + " ÷ " + num3;
    }
}
