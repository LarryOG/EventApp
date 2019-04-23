package com.example.eventapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    TextInputEditText whereTextInputEditText;
    TextInputEditText nameTextInputEditText;
    TextInputEditText lastnameTextInputEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        whereTextInputEditText = (TextInputEditText)findViewById(R.id.whereTextInput);
        nameTextInputEditText = (TextInputEditText)findViewById(R.id.nameTextInput);
        lastnameTextInputEditText = (TextInputEditText)findViewById(R.id.lastnameTextInput);

    }

    public void backButtonClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   MainActivity.class);
        startActivity(myIntent);
    }

    public void addButtonClick(View v){

        String where =  whereTextInputEditText.getText().toString();
        String name =  nameTextInputEditText.getText().toString();
        String lastname =  lastnameTextInputEditText.getText().toString();

        Guest guest = new Guest(name,lastname,where);
    }

}
