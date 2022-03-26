package com.example.sbs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class food_meat_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_meat_list);
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.back1:
                Intent i1 = new Intent(this, main.class);
                startActivity(i1);
                break;

        }
    }
}
