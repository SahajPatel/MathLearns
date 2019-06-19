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


public class addLevFB extends AppCompatActivity {
    View viewadd;
    //This affects the day/night themes
    public static void setDa(boolean isDa) {
        addLevFB.Da = isDa;
    }
    public static boolean getDa(){
        return Da;
    }
    static boolean Da;

    //this affects Multiple choice
    public static void setMultC(boolean isMultC) {addLevFB.MultC = isMultC;}
    public static boolean getMultC() { return MultC;}
    static boolean MultC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        final int level = 1;
//        final int correct = 0;
        super.onCreate(savedInstanceState);
        final TextView correctTextView = findViewById(R.id.Correct);

        setContentView(R.layout.fb);

        Button increase = findViewById(R.id.increase);
        Button decrease = findViewById(R.id.decrease);

        final TextView Questions = findViewById(R.id.Questions);
        Questions.setText(AdditionFB.askMe());

        final TextView Level = findViewById(R.id.Level);
        Level.setTextColor(Color.CYAN);
        Level.setText("AdditionFB Level " + (AdditionFB.getDifficulty() - 3));

        viewadd = this.getWindow().getDecorView();

        Button Submit = findViewById(R.id.Submit);

        final TextView correctView = findViewById(R.id.correctCount);
        correctView.setTextColor(Color.GREEN);

        final EditText answerText = findViewById(R.id.answerText);
        if (Da) {
            answerText.setTextColor(Color.WHITE);

        } else {
            answerText.setTextColor(Color.BLACK);
        }

        Submit.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          double submitted = 0;
                                          TextView correctTextView = findViewById(R.id.Correct);
                                          if (answerText.getText().length() == 0) {
                                              correctTextView.setText("Please submit an answer");
                                          } else {
                                              if (answerText.getText().length() != 0) {
                                                  submitted = Double.parseDouble(answerText.getText().toString());
                                              }
                                          }

                                          if (AdditionFB.isRight(submitted) == 1) {
                                              correctTextView.setTextColor(Color.GREEN);
                                              correctTextView.setText("Correct");
                                              answerText.setText("");
                                              AdditionFB.setCorrect(AdditionFB.getCorrect() + 1);
                                              correctView.setText(Integer.toString(AdditionFB.getCorrect()));
                                              Questions.setText(AdditionFB.askMe());
                                          } else {
                                              if (AdditionFB.isRight(submitted) == -1) {
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
                AdditionFB.setDifficulty(AdditionFB.getDifficulty() + 1);
                Level.setText("AdditionFB Level " + (AdditionFB.getDifficulty() - 3));

            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AdditionFB.getDifficulty() >= 5) {
                    AdditionFB.setDifficulty(AdditionFB.getDifficulty() - 1);
                    Level.setText("AdditionFB Level " + (AdditionFB.getDifficulty() - 3));
                }
            }
        });

        if (!Da) {
            viewadd.setBackgroundColor(Color.WHITE);
        } else {
            viewadd.setBackgroundColor(Color.parseColor("#2c2f33"));
            Questions.setTextColor(Color.WHITE);
        }

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
                openAdd1();
                return true;

            case R.id.minusLevel:
                openSub1();
                return true;

            case R.id.timesLevel:
                openMult1();
                return true;

            case R.id.mainMenus:
                openMain();
                return true;
            case R.id.divideLevel:
                openDiv();
                return true;

            case R.id.dayLevel:
                openday();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }}

    public void openAdd1(){
        Intent add1 = new Intent(this, addLevFB.class);
        startActivity(add1);
    }
    public void openSub1(){
        Intent sub1 = new Intent(this, subLevFB.class);
        startActivity(sub1);
    }
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
    public void openday(){
        Intent day1 = new Intent(this, Day_Test_Class.class);
        startActivity(day1);
    }
}
