package com.example.sahaj.mathlearns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class menuHelper extends AppCompatActivity {//THIS CLASS IS UNUSED FOR NOW, but it should replace all copy/paste menu from classes
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

        return super.onOptionsItemSelected(item);
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

    public void openday(){
        Intent day1 = new Intent(this, Day_Test_Class.class);
        startActivity(day1);
    }
}
