package com.thisisbensilver.animalinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent mIntent = getIntent();
        Animal myAnimal = (Animal) mIntent.getSerializableExtra("myAnimal");


        ((TextView) findViewById(R.id.info_animal_type)).setText(((TextView) findViewById(R.id.info_animal_type)).getText() + " " + myAnimal.getaType());
        ((TextView) findViewById(R.id.info_animal_legs)).setText(((TextView) findViewById(R.id.info_animal_legs)).getText() + " " + myAnimal.getaLegs());

        ((TextView) findViewById(R.id.info_animal_terror)).setText(((TextView) findViewById(R.id.info_animal_terror)).getText() + " " + myAnimal.getaTerror());

        if (myAnimal.getaTerror()) {
            ((TextView) findViewById(R.id.info_animal_terror_lvl)).setText(((TextView) findViewById(R.id.info_animal_terror_lvl)).getText() + " " + myAnimal.getaTerrorLvl());
            findViewById(R.id.info_animal_terror_lvl).setVisibility(View.VISIBLE);

        }


        ((TextView) findViewById(R.id.info_animal_details)).setText(((TextView) findViewById(R.id.info_animal_details)).getText() + " " + myAnimal.getaDetails());


    }

}
