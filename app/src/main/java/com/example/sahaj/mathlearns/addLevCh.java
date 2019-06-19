package com.example.sahaj.mathlearns;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class addLevCh extends AppCompatActivity {
    View viewadd;

    public static void setDa(boolean isDa) {
        addLevFB.Da = isDa;
    }
    public static boolean getDa(){
        return Da;
    }
    static boolean Da;

    public static void setMultC(boolean isMultC) {addLevFB.MultC = isMultC;}
    public static boolean getMultC() { return MultC;}
    static boolean MultC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView correctTextView = findViewById(R.id.Correct);
        setContentView(R.layout.ch);
        Button increase = findViewById(R.id.increase);
        Button decrease = findViewById(R.id.decrease);
        final Button A1 = findViewById(R.id.A1);
        final Button A2 = findViewById(R.id.A2);
        final Button A3 = findViewById(R.id.A3);
        final Button A4 = findViewById(R.id.A4);

        final TextView questions = findViewById(R.id.questions);
        questions.setText(AdditionFB.askMe());

        final TextView Level = findViewById(R.id.Level);
        Level.setTextColor(Color.CYAN);
        Level.setText("AdditionFB Level " + (AdditionFB.getDifficulty() - 3));

        viewadd = this.getWindow().getDecorView();
        final TextView correctView = findViewById(R.id.correctCount);
        correctView.setTextColor(Color.GREEN);
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
            questions.setTextColor(Color.WHITE);
        }


        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double submitted = Double.parseDouble(A1.getText().toString());
//                  if(Integer.parseInt(AdditionFB.getAno() == AdditionFB.getOne()){


                if (AdditionFB.isRight(submitted) == 1) {
                    correctTextView.setTextColor(Color.GREEN);
                    correctTextView.setText("Correct");
                    AdditionFB.setCorrect(AdditionFB.getCorrect() + 1);
                    correctView.setText(Integer.toString(AdditionFB.getCorrect()));
                    questions.setText(AdditionFB.askMe());
                } else {
                    if (AdditionFB.isRight(submitted) == -1) {
                        correctTextView.setTextColor(Color.RED);
                        correctTextView.setText("Try Again");
                    }
                }
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double submitted = Double.parseDouble(A2.getText().toString());
                if (AdditionFB.isRight(submitted) == 1) {
                    correctTextView.setTextColor(Color.GREEN);
                    correctTextView.setText("Correct");
                    AdditionFB.setCorrect(AdditionFB.getCorrect() + 1);
                    correctView.setText(Integer.toString(AdditionFB.getCorrect()));
                    questions.setText(AdditionFB.askMe());
                } else {
                    if (AdditionFB.isRight(submitted) == -1) {
                        correctTextView.setTextColor(Color.RED);
                        correctTextView.setText("Try Again");
                    }
                }
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double submitted = Double.parseDouble(A3.getText().toString());
                if (AdditionFB.isRight(submitted) == 1) {
                    correctTextView.setTextColor(Color.GREEN);
                    correctTextView.setText("Correct");

                    AdditionFB.setCorrect(AdditionFB.getCorrect() + 1);
                    correctView.setText(Integer.toString(AdditionFB.getCorrect()));
                    questions.setText(AdditionFB.askMe());
                } else {
                    if (AdditionFB.isRight(submitted) == -1) {
                        correctTextView.setTextColor(Color.RED);
                        correctTextView.setText("Try Again");
                    }
                }
            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double submitted = Double.parseDouble(A4.getText().toString());
                if (AdditionFB.isRight(submitted) == 1) {
                    correctTextView.setTextColor(Color.GREEN);
                    correctTextView.setText("Correct");
                    AdditionFB.setCorrect(AdditionFB.getCorrect() + 1);
                    correctView.setText(Integer.toString(AdditionFB.getCorrect()));
                    questions.setText(AdditionFB.askMe());
                } else {
                    if (AdditionFB.isRight(submitted) == -1) {
                        correctTextView.setTextColor(Color.RED);
                        correctTextView.setText("Try Again");
                    }
                }
            }
        });
    }
    }

