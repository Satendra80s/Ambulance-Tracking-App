package com.example.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnView;
    homefrag homefrag = new homefrag();
    callfrg callfrg = new callfrg();
    profilefrg profilefrg = new profilefrg();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        },3000);


    }
}