package com.thisisbensilver.animalinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void displayInfo(View view) {

        Intent mIntent = new Intent(this, InfoActivity.class);

        String mType = ((EditText) findViewById(R.id.in_animal_type)).getText().toString();


        int mLegs = 0;
        if (!((EditText) findViewById(R.id.in_animal_legs)).getText().toString().equalsIgnoreCase("")) {
            mLegs = Integer.parseInt((((EditText) findViewById(R.id.in_animal_legs)).getText().toString()));
        }


        boolean mTerror = ((CheckBox) findViewById(R.id.in_animal_terror)).isChecked();
        int mTerrorLvl = 0;
        if (mTerror) {
            mTerrorLvl = ((SeekBar) findViewById(R.id.in_animal_terror_lvl_seekbar)).getProgress();
        }
        String mDetails = ((EditText) findViewById(R.id.in_animal_details)).getText().toString();


        Animal myAnimal = new Animal(mType, mLegs, mTerror, mTerrorLvl, mDetails);

        mIntent.putExtra("myAnimal", myAnimal);

        if (mIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mIntent);
        }

    }

    //Show/Hide the slider that only makes sense if the box is checked
    public void showHideTerror(View view) {

        if (((CheckBox) view).isChecked()) {
            findViewById(R.id.in_animal_terror_lvl).setVisibility(view.VISIBLE);
        } else {
            findViewById(R.id.in_animal_terror_lvl).setVisibility(view.GONE);
        }

    }
}
