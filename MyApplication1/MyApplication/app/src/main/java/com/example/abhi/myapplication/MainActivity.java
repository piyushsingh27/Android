package com.example.abhi.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    Button b;
    DatePicker dp;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.ed1);
        e2 = (EditText) findViewById(R.id.ed2);

        b = (Button)findViewById(R.id.btn);

        dp = (DatePicker)findViewById(R.id.dtp1);
        dp.updateDate(2018,12,17);

        Calendar c = Calendar.getInstance();

        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                dp.updateDate(year,monthOfYear,dayOfMonth);


                                //date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, 2018, 11, 10);
                datePickerDialog.getDatePicker().setMinDate(new Date().getTime());
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime()+(1000*60*60*24*7));
                datePickerDialog.show();
            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(e1.getText().toString())) {
                    e1.setError("Enter Team 1 Name");
                    return;
                }

                if(TextUtils.isEmpty(e2.getText().toString())) {
                    e2.setError("Enter Team 2 Name");
                    return;
                }

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("Team1",e1.getText().toString());
                i.putExtra("Team2",e2.getText().toString());
                i.putExtra("date",""+dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear());

                startActivity(i);

            }
        });




    }
}
