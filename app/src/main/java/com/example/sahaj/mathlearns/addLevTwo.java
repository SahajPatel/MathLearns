package com.example.sahaj.mathlearns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class addLevTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lev_two);
        final TextView Questionss =  findViewById(R.id.Questionss);
        Questionss.setText(AdditionTwo.askMee());
        Button Submit = findViewById(R.id.Submits);
        Submit.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          EditText answerText = findViewById(R.id.answerTexts);
                                          Integer submitted = 0;
                                          TextView correctTextView =  findViewById(R.id.Corrects);
                                          if(answerText.getText().length()==0){
                                              correctTextView.setText("Please submit an answer");
                                          }else{
                                              if(answerText.getText().length()!=0) {
                                                  submitted = Integer.parseInt(answerText.getText().toString());
                                              }}

                                          if(AdditionTwo.isRight(submitted) == 1){
                                              correctTextView.setText("Correct");
                                              Questionss.setText(AdditionTwo.askMee());
                                          }else {
                                              if (AdditionTwo.isRight(submitted) == -1) {
                                                  correctTextView.setText("Try Again");
                                              }
                                          }
                                      }
                                  }
        );
    }
}
