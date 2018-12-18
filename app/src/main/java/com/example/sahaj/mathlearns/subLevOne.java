package com.example.sahaj.mathlearns;

import android.content.Intent;
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


public class subLevOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lev_one);
        EditText answerText;
        final TextView Questions = (TextView) findViewById(R.id.Questions);
        Questions.setText(Subtraction.askMes());
        Button Submit = (Button) findViewById(R.id.Submit);
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

                                          if(Subtraction.isRight(submitted) == 1){
                                              correctTextView.setText("Correct");
                                              Questions.setText(Subtraction.askMes());
                                          }else {
                                              if (Subtraction.isRight(submitted) == -1) {
                                                  correctTextView.setText("Try Again");
                                              }
                                          }
                                      }
                                  }
        );
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
}
