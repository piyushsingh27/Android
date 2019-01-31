package com.example.dashboard.labtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView editText, editText1;

    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonNB, buttonWide;

    int one = 1, two = 2, three = 3, four = 4, five = 5, six  = 6;
    int old_runs, new_runs;
    double over_new = 0.1;
    double over_old;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        buttonOne = (Button)findViewById(R.id.buttonOne);
        buttonTwo = (Button)findViewById(R.id.buttonTwo);
        buttonThree = (Button)findViewById(R.id.buttonThree);
        buttonFour = (Button)findViewById(R.id.buttonFour);
        buttonFive = (Button)findViewById(R.id.buttonFive);
        buttonSix = (Button)findViewById(R.id.buttonSix);
        buttonNB = (Button)findViewById(R.id.buttonNB);
        buttonWide = (Button)findViewById(R.id.buttonWide);


        editText = (TextView)findViewById(R.id.editText);
        editText1 = (TextView)findViewById(R.id.editText1);




        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               old_runs = Integer.parseInt(editText.getText() + "");
               over_old = Double.parseDouble(editText1.getText() + "");
               //new_runs = Float.parseFloat(editText.getText() + "");

               editText.setText(old_runs + one + "");
               editText1.setText(over_old + over_new + "");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_runs = Integer.parseInt(editText.getText() + "");
                over_old = Double.parseDouble(editText1.getText() + "");
                //new_runs = Float.parseFloat(editText.getText() + "");

                editText.setText(old_runs + two + "");
                editText1.setText(over_old + over_new + "");
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_runs = Integer.parseInt(editText.getText() + "");
                over_old = Double.parseDouble(editText1.getText() + "");
                //new_runs = Float.parseFloat(editText.getText() + "");

                editText.setText(old_runs + three + "");
                editText1.setText(over_old + over_new + "");
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_runs = Integer.parseInt(editText.getText() + "");
                over_old = Double.parseDouble(editText1.getText() + "");
                //new_runs = Float.parseFloat(editText.getText() + "");

                editText.setText(old_runs + four + "");
                editText1.setText(over_old + over_new + "");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_runs = Integer.parseInt(editText.getText() + "");
                over_old = Double.parseDouble(editText1.getText() + "");
                //new_runs = Float.parseFloat(editText.getText() + "");

                editText.setText(old_runs + five + "");
                editText1.setText(over_old + over_new + "");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_runs = Integer.parseInt(editText.getText() + "");
                over_old = Double.parseDouble(editText1.getText() + "");
                //new_runs = Float.parseFloat(editText.getText() + "");

                editText.setText(old_runs + six + "");
                editText1.setText(over_old + over_new + "");
            }
        });

        buttonWide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_runs = Integer.parseInt(editText.getText() + "");
                //new_runs = Float.parseFloat(editText.getText() + "");

                editText.setText(old_runs + one + "");
            }
        });

        buttonNB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_runs = Integer.parseInt(editText.getText() + "");
               // new_runs = Float.parseFloat(editText.getText() + "");

                editText.setText(old_runs + one + "");
            }
        });
    }


}
