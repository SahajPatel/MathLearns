package com.example.sahaj.mathlearns;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    View viewmain;

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    boolean isDay = true;


    private DrawerLayout drawLay;
//    private ActionBarDrawerToggle mtog;

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

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawLay = findViewById(R.id.setting_menu);
        ActionBarDrawerToggle mtog = new ActionBarDrawerToggle(this, drawLay, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawLay.addDrawerListener(mtog);
        mtog.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewmain = this.getWindow().getDecorView();

        //
//        setContentView(R.layout.activity_day);
//        final TextView ColorText = (TextView)findViewById(R.id.Color_Test);
//        Switch switch1 = (Switch)findViewById(R.id.switch1); //switch
//        switch1.setOnCheckedChangeListener(this);

//        viewmain = this.getWindow().getDecorView();
//        if(addLevOne.getDa()==true){
//            switch1.setChecked(true);
//        }
//        else{
//            switch1.setChecked(false);
//        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){
            case R.id.day_Mode:
                addLevOne.setDa(false);
                break;

            case R.id.night_Mode:
                addLevOne.setDa(true);
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed(){
        if(drawLay.isDrawerOpen(GravityCompat.START)){
            drawLay.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
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

            case R.id.dayLevel:

                openday();
                return true;
        }
//            if(mtog.onOptionsItemSelected(item)){
//                return true;
//            }
                return super.onOptionsItemSelected(item);
    }
    public void openAdd1(){
        Intent add1 = new Intent(this, addLevOne.class);
        startActivity(add1);
    }

    public void openSub1(){
        Intent sub1 = new Intent(this, subLevOne.class);
        startActivity(sub1);
    }

    public void openMult1(){
        Intent mult1 = new Intent(this, multLevOne.class);
        startActivity(mult1);
    }

    public void openMain(){
        Intent main1 = new Intent(this, mainMenu.class);
        startActivity(main1);
    }

    public void openday(){
        Intent day1 = new Intent(this, Day_Test_Class.class);
        startActivity(day1);
    }


}
