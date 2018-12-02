package com.example.sahaj.mathlearns;

import java.util.Random;

public class Multiplicationz {

    static Random randomGen = new Random();
    static double num1 = 0;
    static double num2 = 0;
    static double result = 0;

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

    public static String askMe() {
        num1 = randomGen.nextInt(10 - 1) + 1;
        num2 = randomGen.nextInt(10 - 1) + 1;
        return "What is " + num1 + " * " + num2;
    }
    public static String askMes2(){
        num1 = randomGen.nextInt(15 - 1) + 1;
        num2 = randomGen.nextInt(15 - 1) + 1;
        return "What is " + num1 + " * " + num2;
    }
}