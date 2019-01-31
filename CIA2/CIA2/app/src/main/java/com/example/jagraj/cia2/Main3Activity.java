package com.example.jagraj.cia2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setTitle("Hello  "+getIntent().getExtras().getString("User"));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // two parameter - 1 which xml file , menu class name
        getMenuInflater().inflate(R.menu.mymenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        LinearLayout l;
        l = findViewById(R.id.con);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        switch(item.getItemId()){
            case R.id.it1:
                Car c = new Car();
                ft.replace(R.id.con,c);
                ft.commit();
                break;
            case R.id.it2:
                Bike b = new Bike();
                ft.replace(R.id.con,b);
                ft.commit();
                break;
            case R.id.it3:
                Truck t = new Truck();
                ft.replace(R.id.con,t);
                ft.commit();
                break;

            case R.id.it4:
                plane p = new plane();
                ft.replace(R.id.con,p);
                ft.commit();
        }
        return super.onOptionsItemSelected(item);
    }
}
