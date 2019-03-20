package com.thisisbensilver.animalinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Activity_animalinfo extends AppCompatActivity implements Keys {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalinfo);


    }

    //Clicked on to submit in popup
    public void submitAnimal(View view) {


        String mType = ((EditText) findViewById(R.id.in_animal_type)).getText().toString();

        if (mType.equalsIgnoreCase("")) {
            mType = "NONAME";
        }
        int mLegs = 0;
        if (!((EditText) findViewById(R.id.in_animal_legs)).getText().toString().equalsIgnoreCase("")) {
            mLegs = Integer.parseInt((((EditText) findViewById(R.id.in_animal_legs)).getText().toString()));
        }
        boolean mTerror = ((CheckBox) findViewById(R.id.in_animal_terror)).isChecked();

        Animal myAnimal = new Animal(mType, mLegs, mTerror);

        Intent mIntent = new Intent();
        mIntent.putExtra(Keys.ext_Animal, myAnimal);
        setResult(Keys.res_Animal, mIntent);
        finish();


    }
}
