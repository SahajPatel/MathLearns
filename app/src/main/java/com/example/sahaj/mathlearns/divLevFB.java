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

public class divLevFB extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int level = 1;
        final int correct = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fb);

        Button increase = findViewById(R.id.increase);
        Button decrease = findViewById(R.id.decrease);

        final TextView Questions =  findViewById(R.id.Questions);
        Questions.setText(DivisionFB.askMe());
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

                                          if(DivisionFB.isRight(submitted) == 1){
                                              correctTextView.setTextColor(Color.GREEN);
                                              correctTextView.setText("Correct");
                                              DivisionFB.setCorrect(DivisionFB.getCorrect() + 1);
                                              correctView.setText(Integer.toString(DivisionFB.getCorrect()));
                                              Questions.setText(DivisionFB.askMe());
                                          }else {
                                              if (DivisionFB.isRight(submitted) == -1) {
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
                DivisionFB.setDifficulty(DivisionFB.getDifficulty()+1);

            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(DivisionFB.getDifficulty() >=5) {
                    DivisionFB.setDifficulty(DivisionFB.getDifficulty() - 1);
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

            default:
                return super.onOptionsItemSelected(item);
        }
    }
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
}
