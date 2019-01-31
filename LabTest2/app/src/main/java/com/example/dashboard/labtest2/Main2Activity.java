package com.example.dashboard.labtest2;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Main2Activity extends AppCompatActivity
        implements View.OnClickListener {


    //The view objects
    private EditText editTextName, editTextEmail, editTextMobile,
            editTextPassword, editTextAddress;

    private RadioButton radio_male, radio_female;

    private Button buttonSubmit;

//    static Button timePickerBT;
//    static Button datePickerBT;
//
//    //defining AwesomeValidation object
//    private AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        initView();
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//
//
//        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //initializing view objects
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextMobile = (EditText) findViewById(R.id.editTextMobile);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);

        radio_male = findViewById(R.id.radio_male);
        radio_female = findViewById(R.id.radio_female);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


//        //adding validation to edittexts
//        awesomeValidation.addValidation(this, R.id.editTextName, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
//        awesomeValidation.addValidation(this, R.id.editTextEmail, Patterns.EMAIL_ADDRESS, R.string.emailerror);
//        awesomeValidation.addValidation(this, R.id.editTextPassword, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.passworderror);
//        awesomeValidation.addValidation(this, R.id.editTextMobile, "^[2-9]{2}[0-9]{8}$", R.string.mobileerror);


        buttonSubmit.setOnClickListener(this);
    }

//    private void initView() {
//        timePickerBT = findViewById(R.id.timeBT);
//        datePickerBT = findViewById(R.id.dateBT);
//    }

//    public void showTimePickerDialog(View view) {
//        DialogFragment newFragment = new TimePickerFragment();
//        newFragment.show(getSupportFragmentManager(), "timePicker");
//    }
//
//    public static void setTimeText(String timeText) {
//        timePickerBT.setText(timeText);
//    }
//
//    public void showDatePickerDialog(View v) {
//        DialogFragment newFragment = new DatePickerFragment();
//        newFragment.show(getSupportFragmentManager(), "datePicker");
//    }
//
//    public static void setDateText(String dateText) {
//        datePickerBT.setText(dateText);
//    }
//
//    public static class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
//        String returnDate;
//        @Override
//        public Dialog onCreateDialog(Bundle savedInstanceState) {
//            // Use the current time as the default values for the picker
//            final Calendar c = Calendar.getInstance();
//            int hour = c.get(Calendar.HOUR_OF_DAY);
//            int minute = c.get(Calendar.MINUTE);
//
//            // Create a new instance of TimePickerDialog and return it
//            return new TimePickerDialog(getActivity(), this, hour, minute,
//                    DateFormat.is24HourFormat(getActivity()));
//        }
//
//        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//            StringBuffer temp = new StringBuffer();
//            temp.append(hourOfDay).append(" : ").append(minute);
//            setTimeText(temp.toString());
//        }
//    }
//
//    public static class DatePickerFragment extends DialogFragment
//            implements DatePickerDialog.OnDateSetListener {
//
//        @Override
//        public Dialog onCreateDialog(Bundle savedInstanceState) {
//            // Use the current date as the default date in the picker
//            final Calendar c = Calendar.getInstance();
//            int year = c.get(Calendar.YEAR);
//            int month = c.get(Calendar.MONTH);
//            int day = c.get(Calendar.DAY_OF_MONTH);
//
//            // Create a new instance of DatePickerDialog and return it
//            return new DatePickerDialog(getActivity(), this, year, month, day);
//        }
//
//        public void onDateSet(DatePicker view, int year, int month, int day) {
//            StringBuffer temp = new StringBuffer();
//            temp.append(year).append(" / ").append(month + 1).append(" / ").append(day);
//            setDateText(temp.toString());
//        }
//    }

    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successful
//        if (awesomeValidation.validate()) {
        Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);

        //process the data further
        // }
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_male:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_female:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    @Override
    public void onClick(View view) {
        if (view == buttonSubmit) {
            submitForm();
        }
    }

}



