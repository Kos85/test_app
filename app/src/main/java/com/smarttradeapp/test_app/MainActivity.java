package com.smarttradeapp.test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.chromium.base.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Log.i("==>", "test1");
    }
}