package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {
    BottomNavigationView bnView;
    homefrag homefrag = new homefrag();
    callfrg callfrg = new callfrg();
    profilefrg profilefrg = new profilefrg();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       bnView = findViewById(R.id.bottomNavigationView);
       getSupportFragmentManager().beginTransaction().replace(R.id.container,homefrag).commit();

       bnView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected( MenuItem item) {
               switch (item.getItemId()){
                   case R.id.home:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,homefrag).commit();
                       return true;
                   case R.id.call:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,callfrg).commit();

                   case R.id.porfile:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,profilefrg).commit();
                       return true;
               }
               return false;
           }
       });

    }
}