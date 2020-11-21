package com.jagannath.randomlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jagannath.mylibrary.RandomString;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RandomString randomString=new RandomString();
        String b=randomString.generateAlphaNumeric(6);
    }
}