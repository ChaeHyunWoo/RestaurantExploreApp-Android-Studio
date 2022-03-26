package com.example.sbs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        WebView w1 = (WebView) findViewById(R.id.alchoneweb);
        w1.loadUrl("file:///android_asset/cupbab/alchon.html");

    }
}