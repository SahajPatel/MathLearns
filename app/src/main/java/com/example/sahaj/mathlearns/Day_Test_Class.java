
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
        import android.widget.CompoundButton;
        import android.widget.Switch;
        import android.widget.TextView;


public class Day_Test_Class extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    View view;
    addLevOne o = new addLevOne();
    boolean night;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        Button Day = findViewById(R.id.Day_Test);
        Button Night = findViewById(R.id.night_Test);
       final TextView ColorText = (TextView)findViewById(R.id.Color_Test);
        Switch switch1 = (Switch)findViewById(R.id.switch1); //switch
        switch1.setOnCheckedChangeListener(this);

        view = this.getWindow().getDecorView();
        if(addLevOne.getDa()==true){
            switch1.setChecked(true);
        }
        else{
            switch1.setChecked(false);
        }




        Day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorText.setText("It's a bright sun shiny day!");
                ColorText.setTextColor(Color.RED);

            }
        });

        Night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorText.setText("I was born in the darkness " );
                ColorText.setTextColor(Color.BLUE);
            }

        });

    }



    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
    {
        final TextView ColorText = (TextView)findViewById(R.id.Color_Test);
        Switch switch1 = (Switch)findViewById(R.id.switch1); //switch
        if(switch1.isChecked()){
            ColorText.setText("Night Mode");
            ColorText.setTextColor(Color.WHITE);
            view.setBackgroundColor(Color.BLACK);
           // Addition.setDifficulty(Addition.getDifficulty()+1);
            addLevOne.setDa(true);
        } else{
            ColorText.setText("Day Mode");
            ColorText.setTextColor(Color.BLACK);
            view.setBackgroundColor(Color.WHITE);
            addLevOne.setDa(false);
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
            default:
                return super.onOptionsItemSelected(item);
        }
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
    public void openDiv(){
        Intent div1 = new Intent(this, divLev.class);
        startActivity(div1);
    }
}
