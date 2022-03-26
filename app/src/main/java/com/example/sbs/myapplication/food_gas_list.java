package com.example.sbs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class food_gas_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_gas_list);
    }
    public void onClick(View v) {

        Intent intent=new Intent(getApplicationContext(), view.class);
        startActivity(intent);
    }

}
