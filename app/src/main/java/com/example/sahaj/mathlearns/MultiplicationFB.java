package com.example.sahaj.mathlearns;

import java.util.Random;

public class MultiplicationFB {

    public static int getCorrect() {
        return correct;
    }

    public static void setCorrect(int correct) {
        MultiplicationFB.correct = correct;
    }

    public static int getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(int difficulty) {
        MultiplicationFB.difficulty = difficulty;
    }
    public static int getCorrect1() {
        return correct1;
    }

    public static void setCorrect1(int correct1) {
        MultiplicationFB.correct1 = correct1;
    }

    public static int getDifficulty1() {
        return difficulty1;
    }

    public static void setDifficulty1(int difficulty1) {
        MultiplicationFB.difficulty1 = difficulty1;
    }
    static int correct = 0;
    static int correct1 =0;
    static int difficulty = 6;
    static int difficulty1 = 6;

    static Random randomGen = new Random();
    static int num1 = 0;
    static int num2 = 0;
    static int num3 = 0;
    static int num4 = 0;
    static int result = 0;

    public static double isRight(Double submitted) {
        result = num1 * num2;
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

    public static double isRight2(Double submitted) {
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

    public static String askMe() {
        num1 = randomGen.nextInt(difficulty - 1) + 1;
        num2 = randomGen.nextInt(difficulty - 1) + 1;
        return "What is " + num1 + " x " + num2;
    }
    public static String askMes2(){
        num3 = randomGen.nextInt(difficulty1 - 1) + 1;
        num4 = randomGen.nextInt(difficulty1 - 1) + 1;
        return "What is " + num3*num4 + " ÷ " + num3;
    }
}