package com.mca.majorl3oat.lab09;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuSelected(View view) {
        switch (view.getId()) {
            case R.id.breakfastIB:
                FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                BreakfastActivity bAct = new BreakfastActivity();
                ft1.replace(R.id.fragment_container, bAct);
                ft1.commit();
                break;
            case R.id.lunchIB:
                FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                LunchActivity lAct = new LunchActivity();
                ft2.replace(R.id.fragment_container, lAct);
                ft2.commit();
                break;
            case R.id.dinnerIB:
                FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
                DinnerActivity dAct = new DinnerActivity();
                ft3.replace(R.id.fragment_container, dAct);
                ft3.commit();
                break;
            case R.id.dessertIB:
                FragmentTransaction ft4 = getSupportFragmentManager().beginTransaction();
                DessertActivity deAct = new DessertActivity();
                ft4.replace(R.id.fragment_container, deAct);
                ft4.commit();
                break;
        }
    }
}
