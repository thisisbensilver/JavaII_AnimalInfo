package com.thisisbensilver.animalinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    //Clicked on in Main
    public void addAnimal(View view) {

        Intent mIntent = new Intent(this, Activity_animalinfo.class);



        if (mIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(mIntent, Keys.req_Animal);
        }

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Keys.req_Animal && resultCode == Keys.res_Animal) {

            Animal myAnimal = (Animal) data.getSerializableExtra(Keys.ext_Animal);
            updateList(myAnimal.toString());

        }
    }

    public void updateList(String a) {
        View list = findViewById(R.id.txt_ListAll);

        ((TextView) list).setText(((TextView) list).getText() + a + "\n\n");

    }

}
