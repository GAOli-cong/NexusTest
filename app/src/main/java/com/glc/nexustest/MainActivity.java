package com.glc.nexustest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.glc.mylibrary.Utils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.getInstance().add(1,1);
    }
}