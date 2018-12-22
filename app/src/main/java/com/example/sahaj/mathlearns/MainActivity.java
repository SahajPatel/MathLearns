package com.example.sahaj.mathlearns;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View viewmain;

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    boolean isDay = true;


    private DrawerLayout drawLay;
    private ActionBarDrawerToggle mtog;

    //Day_Test_Class datobj = new Day_Test_Class();
    public void change(){
        if(isDay){
        viewmain.setBackgroundColor(Color.WHITE);
        }
        else {
            viewmain.setBackgroundColor(Color.BLACK);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawLay = (DrawerLayout) findViewById(R.id.drawerLayout);
        mtog = new ActionBarDrawerToggle(this, drawLay, R.string.open, R.string.close);

        drawLay.addDrawerListener(mtog);
        mtog.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewmain = this.getWindow().getDecorView();

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

            case R.id.dayLevel:
//                Toast.makeText(this, "Multiplication selected", Toast.LENGTH_SHORT).show();
                openday();
                return true;
        }
            if(mtog.onOptionsItemSelected(item)){
                return true;
            }
                return super.onOptionsItemSelected(item);
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
//    public void openMult2(){
//        Intent mult2 = new Intent(this, multLevTwo.class);
//        startActivity(mult2);
//    }
    public void openMain(){
        Intent main1 = new Intent(this, mainMenu.class);
        startActivity(main1);
    }

    public void openday(){
        Intent day1 = new Intent(this, Day_Test_Class.class);
        startActivity(day1);
    }


}
