package com.example.sbs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class HomeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);

        setTitle("메인화면");

        int loginedMemberId = getIntent().getIntExtra("loginedMemberId", 0);

        Member loginedMember = AppDatabase.findMember(loginedMemberId);

        TextView textViewLoginedMemberName = findViewById(R.id.textViewLoginedMemberName);
        textViewLoginedMemberName.setText(loginedMember.getName() + "님 환영합니다.");

        Handler hand = new Handler();

        hand.postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(HomeMainActivity.this, main.class);
                startActivity(i);
                finish();

            }
        }, 2000);

    }


}