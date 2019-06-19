package com.example.sahaj.mathlearns;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    View viewmain;

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    boolean isDay = true;

    boolean isMultChoice = false;


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


    DatabaseHelper myDB; //this is the database instantiated

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this); //this is causing a crash!
        Button fillIn = findViewById(R.id.fillIn);
        Button MC = findViewById(R.id.multCho);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.downarrow);
        drawLay = findViewById(R.id.setting_menu);
        ActionBarDrawerToggle mtog = new ActionBarDrawerToggle(this, drawLay, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawLay.addDrawerListener(mtog);
        mtog.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewmain = this.getWindow().getDecorView();


        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isMultChoice = true;

            }
        });
        fillIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isMultChoice = false;

            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){
            case R.id.day_Mode:
                addLevFB.setDa(false);
                break;

            case R.id.night_Mode:
                addLevFB.setDa(true);
                break;

//            case R.id.addMode:
//                Intent add1 = new Intent(this, addLevFB.class);
//                startActivity(add1);
//                break;
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
                if(isMultChoice == true){
                    openAddMC();
                }else {
                    openAddFB();
                }
                return true;

            case R.id.minusLevel:
                openSubFB();
                return true;

            case R.id.timesLevel:
                openMultFB();
                return true;

            case R.id.divideLevel:
                openDivFB();
                return true;

            case R.id.mainMenus:
                openMain();
                return true;

            case R.id.dayLevel:

                openday();
                return true;
        }

                return super.onOptionsItemSelected(item);
    }
    public void openAddFB(){
        Intent add1 = new Intent(this, addLevFB.class);
        startActivity(add1);
    }

    public void openSubFB(){
        Intent sub1 = new Intent(this, subLevFB.class);
        startActivity(sub1);
    }

    public void openMultFB(){
        Intent mult1 = new Intent(this, multLevFB.class);
        startActivity(mult1);
    }

    public void openDivFB(){
        Intent div1 = new Intent(this, divLevFB.class);
        startActivity(div1);
    }

    public void openMain(){
        Intent main1 = new Intent(this, MainActivity.class);
        startActivity(main1);
    }

    public void openday(){
        Intent day1 = new Intent(this, Day_Test_Class.class);
        startActivity(day1);
    }

    public void openAddMC(){
        Intent addCh = new Intent(this, addLevCh.class);
        startActivity(addCh);
    }



}
