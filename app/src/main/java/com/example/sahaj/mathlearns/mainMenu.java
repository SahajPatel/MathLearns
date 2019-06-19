package com.example.sahaj.mathlearns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//                Toast.makeText(this, "AdditionFB selected", Toast.LENGTH_SHORT).show();
                openAdd1();
                return true;
//
//            case R.id.subitem1:
//               // Toast.makeText(this, "SUB1", Toast.LENGTH_SHORT).show();
//                openAddFB();
//                return true;
//
//            case R.id.subitem2:
//                //Toast.makeText(this, "SUB2", Toast.LENGTH_SHORT).show();
//                openAdd2();
//                return true;

            case R.id.minusLevel:
//                Toast.makeText(this, "SubtractionFB selected", Toast.LENGTH_SHORT).show();
                openSub1();
                return true;

//            case R.id.subitem3:
//                openSubFB();
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
//                openMultFB();
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
        Intent add1 = new Intent(this, addLevFB.class);
        startActivity(add1);
    }
    //    public void openAdd2(){
//        Intent add2 = new Intent(this, addLevCh.class);
//        startActivity(add2);
//    }
    public void openSub1(){
        Intent sub1 = new Intent(this, subLevFB.class);
        startActivity(sub1);
    }
    //    public void openSub2(){
//        Intent sub2 = new Intent(this, subLevCh.class);
//        startActivity(sub2);
//    }
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
