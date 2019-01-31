package com.example.dashboard.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.widget.Button;
import android.view.View;


public class Main2Activity extends AppCompatActivity {

    private Button btnshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnshow = findViewById(R.id.btnShow);
        registerForContextMenu(btnshow);
    }

//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        menu.setHeaderTitle("Context Menu");
//        menu.add(0, v.getId(), 0, "Upload");
//        menu.add(0, v.getId(), 0, "Search");
//        menu.add(0, v.getId(), 0, "Share");
//        menu.add(0, v.getId(), 0, "Bookmark");
//    }
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
//        return true;
//    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0, v.getId(), 0, "Upload");
        menu.add(0, v.getId(), 0, "Search");
        menu.add(0, v.getId(), 0, "Share");
        menu.add(0, v.getId(), 0, "Bookmark");

    }
}
