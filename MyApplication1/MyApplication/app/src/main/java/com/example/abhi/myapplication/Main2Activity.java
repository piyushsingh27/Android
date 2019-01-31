package com.example.abhi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    TextView tv1,tv1s,tv2,tv2s,date;
    String t1,t2,dates;

    Button b1,b2,b3,b4,b5,b6,bn,bw;

    RadioButton rdt1,rdt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String t1 = getIntent().getStringExtra("Team1");
        String t2 = getIntent().getStringExtra("Team2");
        String dates = getIntent().getStringExtra("date");
//
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

        tv1s = (TextView)findViewById(R.id.tv1s);
        tv2s = (TextView)findViewById(R.id.tv2s);

        date = (TextView)findViewById(R.id.date);
        date.setText(dates);

        rdt1 = (RadioButton)findViewById(R.id.rdt1);
        rdt2 = (RadioButton)findViewById(R.id.rdt2);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        bn = (Button)findViewById(R.id.bn);
        bw = (Button)findViewById(R.id.bw);

        tv1.setText(t1);
         tv2.setText(t2);

         rdt1.setText(t1);
         rdt2.setText(t2);

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(rdt1.isChecked())
                 {
                     int x = Integer.parseInt(tv1s.getText().toString());
                     x = x + 1;
                     tv1s.setText(Integer.toString(x));

                 }
                 else if(rdt2.isChecked())
                 {
                     int x = Integer.parseInt(tv2s.getText().toString());
                     x = x + 1;
                     tv2s.setText(Integer.toString(x));

                 }
             }
         });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdt1.isChecked())
                {
                    int x = Integer.parseInt(tv1s.getText().toString());
                    x = x + 2;
                    tv1s.setText(Integer.toString(x));

                }
                else if(rdt2.isChecked())
                {
                    int x = Integer.parseInt(tv2s.getText().toString());
                    x = x + 2;
                    tv2s.setText(Integer.toString(x));

                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdt1.isChecked())
                {
                    int x = Integer.parseInt(tv1s.getText().toString());
                    x = x + 3;
                    tv1s.setText(Integer.toString(x));

                }
                else if(rdt2.isChecked())
                {
                    int x = Integer.parseInt(tv2s.getText().toString());
                    x = x + 3;
                    tv2s.setText(Integer.toString(x));

                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdt1.isChecked())
                {
                    int x = Integer.parseInt(tv1s.getText().toString());
                    x = x + 4;
                    tv1s.setText(Integer.toString(x));

                }
                else if(rdt2.isChecked())
                {
                    int x = Integer.parseInt(tv2s.getText().toString());
                    x = x + 4;
                    tv2s.setText(Integer.toString(x));

                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdt1.isChecked())
                {
                    int x = Integer.parseInt(tv1s.getText().toString());
                    x = x + 5;
                    tv1s.setText(Integer.toString(x));

                }
                else if(rdt2.isChecked())
                {
                    int x = Integer.parseInt(tv2s.getText().toString());
                    x = x + 5;
                    tv2s.setText(Integer.toString(x));

                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdt1.isChecked())
                {
                    int x = Integer.parseInt(tv1s.getText().toString());
                    x = x + 6;
                    tv1s.setText(Integer.toString(x));

                }
                else if(rdt2.isChecked())
                {
                    int x = Integer.parseInt(tv2s.getText().toString());
                    x = x + 6;
                    tv2s.setText(Integer.toString(x));

                }
            }
        });

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdt1.isChecked())
                {
                    int x = Integer.parseInt(tv1s.getText().toString());
                    x = x + 1;
                    tv1s.setText(Integer.toString(x));

                }
                else if(rdt2.isChecked())
                {
                    int x = Integer.parseInt(tv2s.getText().toString());
                    x = x + 1;
                    tv2s.setText(Integer.toString(x));

                }
            }
        });

        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdt1.isChecked())
                {
                    int x = Integer.parseInt(tv1s.getText().toString());
                    x = x + 1;
                    tv1s.setText(Integer.toString(x));

                }
                else if(rdt2.isChecked())
                {
                    int x = Integer.parseInt(tv2s.getText().toString());
                    x = x + 1;
                    tv2s.setText(Integer.toString(x));

                }
            }
        });

    }
}
