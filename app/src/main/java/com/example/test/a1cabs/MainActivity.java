package com.example.test.a1cabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //For next button
        // Creating object first for places
        Button placesInVizag = (Button) findViewById(R.id.nextbutton);
        //giving event listeners
        placesInVizag.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NavigationalActivity.class);
                startActivity(numbersIntent);
            }

        });
    }
}
