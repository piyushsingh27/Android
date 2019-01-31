package com.example.dashboard.labtest2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {


    private Button buttonSubmit1;

    private EditText editTextEmail, editTextPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonSubmit1 = findViewById(R.id.buttonSubmit1);


        buttonSubmit1.setOnClickListener(this);
    }


    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successful
        //if (awesomeValidation.validate()) {
        Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonSubmit1) {
            submitForm();
        }
    }
}
