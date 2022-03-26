package com.example.sbs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), food_meat_list.class);
        startActivity(intent);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(getApplicationContext(), food_ChickenAndPizza_list.class);
        startActivity(intent);
    }

    public void onClick3(View v) {
        Intent intent = new Intent(getApplicationContext(), food_tteokbokki_list.class);
        startActivity(intent);
    }

    public void onClick4(View v) {
        Intent intent = new Intent(getApplicationContext(), food_gas_list.class);
        startActivity(intent);
    }

    public void onClick5(View v) {
        Intent intent = new Intent(getApplicationContext(), food_cup_list.class);
        startActivity(intent);
    }

    public void onClick6(View v) {
        Intent intent = new Intent(getApplicationContext(), food_lostchicken_xml.class);
        startActivity(intent);
    }

    public void onClick7(View v) {
        Intent intent = new Intent(getApplicationContext(), food_koreanfood_list.class);
        startActivity(intent);
    }

    public void onClick8(View v) {
        Intent intent = new Intent(getApplicationContext(), food_chinafood_list.class);
        startActivity(intent);
    }
}
