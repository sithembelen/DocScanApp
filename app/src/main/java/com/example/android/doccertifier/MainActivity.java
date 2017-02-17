package com.example.android.doccertifier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android .view.View;
import android .content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }



    public void onClick(View v){

        Intent oupa = new Intent(getApplicationContext() , Register.class);
    }
}
