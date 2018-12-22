package com.example.sahaj.mathlearns;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class multLevOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int level = 1;
        final int correct = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lev_one);

        Button increase = findViewById(R.id.increase);
        Button decrease = findViewById(R.id.decrease);

        final TextView Questions =  findViewById(R.id.Questions);
        Questions.setText(Multiplicationz.askMe());
        Button Submit = findViewById(R.id.Submit);

        final TextView correctView = findViewById(R.id.correctCount);
        correctView.setTextColor(Color.GREEN);

        Submit.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          EditText answerText = findViewById(R.id.answerText);
                                          double submitted = 0;
                                          TextView correctTextView =  findViewById(R.id.Correct);
                                          if(answerText.getText().length()==0){
                                              correctTextView.setText("Please submit an answer");
                                          }else{
                                              if(answerText.getText().length()!=0) {
                                                  submitted = Double.parseDouble(answerText.getText().toString());
                                              }}

                                          if(Multiplicationz.isRight(submitted) == 1){
                                              correctTextView.setTextColor(Color.GREEN);
                                              correctTextView.setText("Correct");
                                              Multiplicationz.setCorrect(Multiplicationz.getCorrect() + 1);
                                              correctView.setText(Integer.toString(Multiplicationz.getCorrect()));
                                              Questions.setText(Multiplicationz.askMe());
                                          }else {
                                              if (Multiplicationz.isRight(submitted) == -1) {
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
                Multiplicationz.setDifficulty(Multiplicationz.getDifficulty()+1);

            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Multiplicationz.getDifficulty() >= 5) {
                    Multiplicationz.setDifficulty(Multiplicationz.getDifficulty() - 1);
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
            default:
                return super.onOptionsItemSelected(item);
        }
    }
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
}
