package com.example.sahaj.mathlearns;

import android.graphics.Color;
import android.view.View;

import java.util.Random;
public class Addition {


    public static int getCorrect() {
        return correct;
    }

    public static void setCorrect(int correct) {
        Addition.correct = correct;
    }

    public static int getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(int difficulty) {
        Addition.difficulty = difficulty;
    }

    static int correct = 0;
    static int difficulty = 20;

    static Random randomGen  = new Random();
    static int num1 = 0;
    static int num2 = 0;
    static int result  = 0;

    public static int getAno() {
        return ano;
    }

    static int ano = anB();
    static String one= "";
    public static String getOne() {
        return one;
    }

    public static String getTwo() {
        return two;
    }

    public static String getThree() {
        return three;
    }

    public static String getFour() {
        return four;
    }

    static String two= "";
    static String three= "";
    static String four= "";

    public static double isRight(Double submitted){
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
    public static String askMe(){
        num1 = randomGen.nextInt(difficulty-1)+1;
        num2 = randomGen.nextInt(difficulty-1)+1;
        return "What is " + num1 + " + " + num2;
    }

    public static int anB(){
        return randomGen.nextInt(4)+1;
    }

    public static void ans(){
        one = Integer.toString(randomGen.nextInt(difficulty-1)+1);
        two = Integer.toString(randomGen.nextInt(difficulty-1)+1);
        three = Integer.toString(randomGen.nextInt(difficulty-1)+1);
        four = Integer.toString(randomGen.nextInt(difficulty-1)+1);
        if(ano == 1){
            one = Integer.toString(result);
        }
        else if(ano == 2){
            two = Integer.toString(randomGen.nextInt(difficulty-1)+1);
        }
        else if(ano == 3){
            three = Integer.toString(randomGen.nextInt(difficulty-1)+1);
        }
        else if(ano == 4){
            four = Integer.toString(randomGen.nextInt(difficulty-1)+1);
        }
        if(one.equals(two)){
            two = two + 1;
        }
        if(one.equals(three)){
            three = three + 1;
        }
        if(one.equals(four)){
            four = four + 1;
        }
        if(two.equals(three)){
            three = three + 1;
        }
        if(two.equals(four)){
            four = four + 1;
        }
        if(three.equals(four)){
            four = four + 1;
        }

    }
}
