package com.tiborgazsovics.catyears;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void showCatAge(View view) {

        // creating a variable that refers to the textfield
        EditText ageEditText = (EditText) findViewById(R.id.catAgeEditText);

        // get the value of the field as a string
        String age = ageEditText.getText().toString();
        // convert it to integer
        int ageInt = Integer.parseInt(age);
        // multiply the integer by 7
        int catAgeInt = ageInt * 7;
        // and then convert the integer back to string
        String catAgeString = Integer.toString(catAgeInt);

        Toast.makeText(this, "Number of years is: " + catAgeString, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
