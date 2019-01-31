package com.example.dashboard.labtest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private Button NewUser, Login;

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    NewUser = findViewById(R.id.buttonNewUser);

    Login = findViewById(R.id.buttonLogin);

    image = findViewById(R.id.image1);


    NewUser.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
            //}
        }
    });


    Login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //if (view == Login) {
//                Intent intent = new Intent(this, Main2Activity.class);
//                startActivity(intent);
                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent1);
            //}
        }
    });
    }
}
