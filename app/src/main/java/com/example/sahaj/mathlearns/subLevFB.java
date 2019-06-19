package com.example.sahaj.mathlearns;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class subLevFB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fb);
        Button increase = findViewById(R.id.increase);
        Button decrease = findViewById(R.id.decrease);

        EditText answerText;
        final TextView Questions = (TextView) findViewById(R.id.Questions);
        Questions.setText(SubtractionFB.askMes());

        Button Submit = (Button) findViewById(R.id.Submit);

        final TextView Level = findViewById(R.id.Level);
        Level.setTextColor(Color.CYAN);
        Level.setText("SubtractionFB Level " + (SubtractionFB.getDifficulty()-3));

        final TextView correctView = findViewById(R.id.correctCount);
        correctView.setTextColor(Color.GREEN);

        Submit.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          EditText answerText = (EditText) findViewById(R.id.answerText);
                                          Integer submitted = 0;
                                          TextView correctTextView = (TextView) findViewById(R.id.Correct);
                                          if(answerText.getText().length()==0){
                                              correctTextView.setText("Please submit an answer");
                                          }else{
                                              if(answerText.getText().length()!=0) {
                                                 submitted = Integer.parseInt(answerText.getText().toString());
//hi
                                              }}
                                          //    int submitted = Integer.parseInt(answerText.getText().toString());
                                          Random randomGen  = new Random();
                                          int num1 = randomGen.nextInt();
                                          int num2 = randomGen.nextInt();
                                          int result  = num1 - num2;

                                          if(SubtractionFB.isRight(submitted) == 1){
                                              correctTextView.setTextColor(Color.GREEN);
                                              correctTextView.setText("Correct");
                                              SubtractionFB.setCorrect(SubtractionFB.getCorrect() + 1);
                                              correctView.setText(Integer.toString(SubtractionFB.getCorrect()));
                                              Questions.setText(SubtractionFB.askMes());
                                          }else {
                                              if (SubtractionFB.isRight(submitted) == -1) {
                                                  correctTextView.setTextColor(Color.RED);
                                                  correctTextView.setText("Try Again");
                                              }
                                          }
                                      }
                                  }
        );
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubtractionFB.setDifficulty(SubtractionFB.getDifficulty()+1);
                Level.setText("SubtractionFB Level " + (SubtractionFB.getDifficulty()-3));

            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SubtractionFB.getDifficulty() >= 5) {
                    SubtractionFB.setDifficulty(SubtractionFB.getDifficulty() - 1);
                    Level.setText("SubtractionFB Level " + (SubtractionFB.getDifficulty()-3));

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.level_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.addingLevel:
//                Toast.makeText(this, "AdditionFB selected", Toast.LENGTH_SHORT).show();
                openAdd1();
                return true;
//
//            case R.id.subitem1:
//               // Toast.makeText(this, "SUB1", Toast.LENGTH_SHORT).show();
//                openAddFB();
//                return true;
//
//            case R.id.subitem2:
//                //Toast.makeText(this, "SUB2", Toast.LENGTH_SHORT).show();
//                openAdd2();
//                return true;

            case R.id.minusLevel:
//                Toast.makeText(this, "SubtractionFB selected", Toast.LENGTH_SHORT).show();
                openSub1();
                return true;

//            case R.id.subitem3:
//                openSubFB();
//                return true;
//
//            case R.id.subitem4:
//                openSub2();
//                return true;

            case R.id.timesLevel:
//                Toast.makeText(this, "Multiplication selected", Toast.LENGTH_SHORT).show();
                openMult1();
                return true;

//            case R.id.subitem5:
//                openMultFB();
//                return true;

//            case R.id.subitem6:
//                openMult2();
//                return true;
            case R.id.mainMenus:
//                Toast.makeText(this, "Multiplication selected", Toast.LENGTH_SHORT).show();
                openMain();
                return true;
            case R.id.divideLevel:
//                Toast.makeText(this, "Multiplication selected", Toast.LENGTH_SHORT).show();
                openDiv();
                return true;

//            case R.id.day_Mode:
//               Toast.makeText(this, "Day mode selected", Toast.LENGTH_SHORT).show();
//                openDay();
//                return true;
//            case R.id.night_Mode:
//                Toast.makeText(this, "Night mode selected", Toast.LENGTH_SHORT).show();
//                openNight();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void openAdd1(){
        Intent add1 = new Intent(this, addLevFB.class);
        startActivity(add1);
    }
    //    public void openAdd2(){
//        Intent add2 = new Intent(this, addLevCh.class);
//        startActivity(add2);
//    }
    public void openSub1(){
        Intent sub1 = new Intent(this, subLevFB.class);
        startActivity(sub1);
    }
    //    public void openSub2(){
//        Intent sub2 = new Intent(this, subLevCh.class);
//        startActivity(sub2);
//    }
    public void openMult1(){
        Intent mult1 = new Intent(this, multLevFB.class);
        startActivity(mult1);
    }
    public void openMain(){
        Intent main1 = new Intent(this, MainActivity.class);
        startActivity(main1);
    }

    public void openDiv(){
        Intent div1 = new Intent(this, divLevFB.class);
        startActivity(div1);
    }

//    public void openDay(){
//        Intent day1 = new Intent(this, mainMenu.class);
//        startActivity(day1);
//    }
//
//    public void openNight(){
//        Intent night1 = new Intent(this, mainMenu.class);
//        startActivity(night1);
//    }
}
