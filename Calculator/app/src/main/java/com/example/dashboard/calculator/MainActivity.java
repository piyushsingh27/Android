package com.example.dashboard.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSubtract,
            buttonProduct, buttonDivision, buttonMod, buttonEqual, buttonClear, buttonDot;

    EditText editText;

    float valueOne, valueTwo;

    boolean mAddition, mSubtraction, mMultiplication, mDivision, mModulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonSubtract = (Button)findViewById(R.id.buttonSubtract);
        buttonProduct = (Button)findViewById(R.id.buttonProduct);
        buttonDivision = (Button)findViewById(R.id.buttonDivision);
        buttonMod = (Button)findViewById(R.id.buttonMod);
        buttonEqual = (Button)findViewById(R.id.buttonEqual);
        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonDot = (Button)findViewById(R.id.buttonDot);

        editText = (EditText)findViewById(R.id.editText);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    mAddition = true;
                    editText.setText(null);
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    mSubtraction = true;
                    editText.setText(null);
                }
            }
        });

        buttonProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    mMultiplication = true;
                    editText.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    mDivision = true;
                    editText.setText(null);
                }
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    mModulus = true;
                    editText.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(editText.getText() + "");

                if(mAddition == true) {
                    editText.setText(valueOne + valueTwo + "");
                    mAddition = false;
                }

                if (mSubtraction == true) {
                    editText.setText(valueOne - valueTwo + "");
                    mSubtraction = false;
                }

                if (mMultiplication == true) {
                    editText.setText(valueOne * valueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    editText.setText(valueOne / valueTwo + "");
                    mDivision = false;
                }

                if (mModulus == true) {
                    editText.setText(valueOne % valueTwo + "");
                    mModulus = false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });



    }
}
