package com.example.dashboard.lab3checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public CheckBox item1, item2, item3;
    public Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item1 = findViewById(R.id.checkbox_burger);
        item2 = findViewById(R.id.checkbox_fries);
        item3 = findViewById(R.id.checkbox_coke);

    }

    public void onCheckboxClicked(View view) {
        // is the view now checked
        boolean checked = ((CheckBox) view).isChecked();

        final int  burger = 45;
        final int fries = 35;
        final int coke = 40;


        //Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_burger:
                if (checked) {
                    Toast.makeText(MainActivity.this, "Burger Selected\t" + "Cost Rs." + burger, Toast.LENGTH_LONG).show();
                }

                else
                    Toast.makeText(MainActivity.this, "Burger Deselected", Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkbox_fries:
                if (checked) {
                    Toast.makeText(MainActivity.this, "Fries Selected\t" + "Cost Rs." + fries, Toast.LENGTH_LONG).show();
                }

                else
                    Toast.makeText(MainActivity.this, "Fries Deselected", Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkbox_coke:
                if (checked) {
                    Toast.makeText(MainActivity.this, "Coke Selected\t" + "Cost Rs." + coke, Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(MainActivity.this, "Coke Deselected", Toast.LENGTH_LONG).show();

                break;
        }

        btnOrder = (Button)findViewById(R.id.btnOrder);


        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (item1.isChecked() && item2.isChecked() && item3.isChecked()) {
                    Toast.makeText(MainActivity.this, "Burger\t" + "Fries\t" + "Coke\n" + "Total Cost" + (burger+fries+coke), Toast.LENGTH_SHORT).show();
                }

                else if (item1.isChecked() && item2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Burger\t" + "Fries\n" + "Total Cost" + (burger+fries), Toast.LENGTH_SHORT).show();
                }

                else if (item1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Burger\n" + "Total Cost" + burger, Toast.LENGTH_SHORT).show();
                }

                else if (item2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Fries\n" + "Total Cost" + fries, Toast.LENGTH_SHORT).show();
                }

                else if (item3.isChecked()) {
                    Toast.makeText(MainActivity.this, "Coke\n" + "Total Cost" + coke, Toast.LENGTH_SHORT).show();
                }

                else if (item2.isChecked() && item3.isChecked()) {
                    Toast.makeText(MainActivity.this, "Fries\t" + "Coke\n" + "Total Cost" + fries+coke, Toast.LENGTH_SHORT).show();
                }

                else if (item1.isChecked() && item3.isChecked()) {
                    Toast.makeText(MainActivity.this, "Burger\t" + "Coke\n" + "Total Cost" + burger+coke, Toast.LENGTH_SHORT).show();
                }

                else if (item1.isChecked() && item2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Burger\t" + "Fries\n" + "Total Cost" + burger+fries, Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(MainActivity.this, "Please select an item before checkout", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
