package com.example.sahaj.mathlearns;

import java.util.Random;
public class Addition {



//    int submitted = Integer.parseInt(answerText.getText().toString());
    static Random randomGen  = new Random();
    static int num1 = 0;
    static int num2 = 0;
    static int result  = 0;
    public static int isRight(Integer submitted){
        result  = num1 + num2;
        if(submitted == result) {
            return 1;
        }
        if(submitted == null){
            return 0;
            }
        if(submitted != result && !(submitted == null)){
            return -1;
        }
        return 0;
    }
    public static String askMe(){
        num1 = randomGen.nextInt(20-1)+1;
        num2 = randomGen.nextInt(20-1)+1;
        return "What is " + num1 + " + " + num2;
    }
}
