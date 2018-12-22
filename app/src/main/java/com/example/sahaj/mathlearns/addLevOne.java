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
import android.widget.Toast;


public class addLevOne extends AppCompatActivity {
    View viewadd;
    public static boolean isDa() {
        return Da;
    }

    public static void setDa(boolean isDa) {
        addLevOne.Da = isDa;
    }

    static boolean Da;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int level = 1;
        final int correct = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lev_one);

        Button increase = findViewById(R.id.increase);
        Button decrease = findViewById(R.id.decrease);

        final TextView Questions = findViewById(R.id.Questions);
        Questions.setText(Addition.askMe());

        final TextView Level = findViewById(R.id.Level);
        Level.setTextColor(Color.CYAN);
        Level.setText("Addition Level " + (Addition.getDifficulty()-3));

        viewadd = this.getWindow().getDecorView();

        Button Submit = findViewById(R.id.Submit);

        final TextView correctView = findViewById(R.id.correctCount);
        correctView.setTextColor(Color.GREEN);

        Submit.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                          EditText answerText = findViewById(R.id.answerText);
//                                          if(Da){
//                                              answerText.setTextColor(Color.WHITE);
//                                          }
//                                          else{
//                                              answerText.setTextColor(Color.BLACK);
//                                          }
                                          double submitted = 0;
                                          TextView correctTextView = findViewById(R.id.Correct);
                                          if (answerText.getText().length() == 0) {
                                              correctTextView.setText("Please submit an answer");
                                          } else {
                                              if (answerText.getText().length() != 0) {
                                                  submitted = Double.parseDouble(answerText.getText().toString());
                                              }
                                          }

                                          if (Addition.isRight(submitted) == 1) {
                                              correctTextView.setTextColor(Color.GREEN);
                                              correctTextView.setText("Correct");
                                              Addition.setCorrect(Addition.getCorrect() + 1);
                                              correctView.setText(Integer.toString(Addition.getCorrect()));
                                              Questions.setText(Addition.askMe());
                                          } else {
                                              if (Addition.isRight(submitted) == -1) {
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
                Addition.setDifficulty(Addition.getDifficulty()+1);
                Level.setText("Addition Level " + (Addition.getDifficulty()-3));

            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Addition.getDifficulty() >= 5) {
                    Addition.setDifficulty(Addition.getDifficulty() - 1);
                    Level.setText("Addition Level " + (Addition.getDifficulty()-3));
                }
            }
        });

        if(!Da){
            viewadd.setBackgroundColor(Color.WHITE);
        }
        else{
            viewadd.setBackgroundColor(Color.BLACK);
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
//                Toast.makeText(this, "Addition selected", Toast.LENGTH_SHORT).show();
                openAdd1();
                return true;
//
//            case R.id.subitem1:
//               // Toast.makeText(this, "SUB1", Toast.LENGTH_SHORT).show();
//                openAdd1();
//                return true;
//
//            case R.id.subitem2:
//                //Toast.makeText(this, "SUB2", Toast.LENGTH_SHORT).show();
//                openAdd2();
//                return true;

            case R.id.minusLevel:
//                Toast.makeText(this, "Subtraction selected", Toast.LENGTH_SHORT).show();
                openSub1();
                return true;

//            case R.id.subitem3:
//                openSub1();
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
//                openMult1();
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

            case R.id.dayLevel:
//                Toast.makeText(this, "Multiplication selected", Toast.LENGTH_SHORT).show();
                openday();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }}

    public void openAdd1(){
        Intent add1 = new Intent(this, addLevOne.class);
        startActivity(add1);
    }
    //    public void openAdd2(){
//        Intent add2 = new Intent(this, addLevTwo.class);
//        startActivity(add2);
//    }
    public void openSub1(){
        Intent sub1 = new Intent(this, subLevOne.class);
        startActivity(sub1);
    }
    //    public void openSub2(){
//        Intent sub2 = new Intent(this, subLevTwo.class);
//        startActivity(sub2);
//    }
    public void openMult1(){
        Intent mult1 = new Intent(this, multLevOne.class);
        startActivity(mult1);
    }
    public void openMain(){
        Intent main1 = new Intent(this, mainMenu.class);
        startActivity(main1);
    }
    public void openDiv(){
        Intent div1 = new Intent(this, divLev.class);
        startActivity(div1);
    }
    public void openday(){
        Intent day1 = new Intent(this, Day_Test_Class.class);
        startActivity(day1);
    }
}
