package com.example.dashboard.lab6;

import android.Manifest;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {


    //The view objects
    private EditText editTextName, editTextEmail, editTextMobile,
            editTextPassword, editTextAddress;

    private RadioButton radio_male, radio_female;

    private Button buttonSubmit;

    static Button timePickerBT;
    static Button datePickerBT;

    //defining AwesomeValidation object
    private AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //initializing view objects
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextMobile = (EditText) findViewById(R.id.editTextMobile);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);

        radio_male = findViewById(R.id.radio_male);
        radio_female = findViewById(R.id.radio_female);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


        //adding validation to edittexts
        awesomeValidation.addValidation(this, R.id.editTextName, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.editTextEmail, Patterns.EMAIL_ADDRESS, R.string.emailerror);
       // awesomeValidation.addValidation(this, R.id.editTextPassword, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.passworderror);
        awesomeValidation.addValidation(this, R.id.editTextMobile, "^[2-9]{2}[0-9]{8}$", R.string.mobileerror);


        buttonSubmit.setOnClickListener(this);
    }

    private void initView() {
        timePickerBT = findViewById(R.id.timeBT);
        datePickerBT = findViewById(R.id.dateBT);
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public static void setTimeText(String timeText) {
        timePickerBT.setText(timeText);
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public static void setDateText(String dateText) {
        datePickerBT.setText(dateText);
    }

    public static class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
        String returnDate;
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            StringBuffer temp = new StringBuffer();
            temp.append(hourOfDay).append(" : ").append(minute);
            setTimeText(temp.toString());
        }
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            StringBuffer temp = new StringBuffer();
            temp.append(year).append(" / ").append(month + 1).append(" / ").append(day);
            setDateText(temp.toString());
        }
    }

    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successful
        if (awesomeValidation.validate()) {
            Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);

            //process the data further
        }
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
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


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id == R.id.contactus) {
            Toast.makeText(this, "Contacted Us", Toast.LENGTH_SHORT).show();
            if(isPermissionGranted()){
                call_action();
            }
            return true;
        }
        else if (id == R.id.feedback) {
            Toast.makeText(this, "Feedback selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

        if (id == R.id.home) {
            //handle the camera action
        } else if (id == R.id.callus) {
            if(isPermissionGranted()){
                call_action();
            }
        } else if (id == R.id.emailus) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto","vinay.m@christuniversity.in", null));
            startActivity(Intent.createChooser(emailIntent, "Send email..."));

        } else if (id == R.id.maps) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW);
            mapIntent.setData(Uri.parse("geo: 12.972442, 77.580643"));
            Intent chooser = Intent.createChooser(mapIntent, "Launch Maps");
            startActivity(chooser);

        } else if (id == R.id.web) {
            String url = "https://christuniversity.in";
            Intent webIntent = new Intent(Intent.ACTION_VIEW);
            webIntent.setData(Uri.parse(url));
            startActivity(webIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void call_action() {
        String phnum = "+919046392720";
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + phnum));
        startActivity(callIntent);
    }

    private boolean isPermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.CALL_PHONE)
                    == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(MainActivity.this, "Granted", Toast.LENGTH_SHORT).show();
                // Log.v("TAG","Permission is granted");
                return true;
            } else {
                Toast.makeText(MainActivity.this, "Revoked`", Toast.LENGTH_SHORT).show();
                // Log.v("TAG","Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Toast.makeText(MainActivity.this, "Granted", Toast.LENGTH_SHORT).show();
            Log.v("TAG","Permission is granted");
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {

            case 1: {

                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(), "  granted", Toast.LENGTH_SHORT).show();
                    call_action();
                } else {
                    Toast.makeText(getApplicationContext(), "Permission denied", Toast.LENGTH_SHORT).show();
                }
                return;
            }

        }
    }
}
