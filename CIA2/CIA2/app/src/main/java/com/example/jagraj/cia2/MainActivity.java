package com.example.jagraj.cia2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnDataPass {


    String usr[] = new String[10];
    String pass[] = new String[10];
    int i = 1;


    EditText e1,e2;
    Button log,reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr[0] = "user";
        pass[0] = "pass";

        e1 = findViewById(R.id.id);
        e2 = findViewById(R.id.pass);

        log = findViewById(R.id.log);
        reg = findViewById(R.id.reg);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                Register editNameDialogFragment = Register.newInstance("Some Title");
                editNameDialogFragment.show(fm, "fragment_edit_name");
            }
        });


        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, usr[i-1]+"   "+pass[i-1], Toast.LENGTH_SHORT).show();
                String s1,s2;
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                for(int j = 0 ; j < i ; j++ )
                {
                    if(s1.equals(usr[j])&&s2.equals(pass[j]))
                    {
                        Intent in = new Intent(MainActivity.this,Main3Activity.class);
                        in.putExtra("User",usr[j]);
                        startActivity(in);
                    }
                }
            }
        });
    }

    @Override
    public void onDataPass(String data) {
        //Log.d("LOG","hello " + data);
        String u,p;
        u = data.substring(0,data.indexOf('|'));
        p = data.substring(data.indexOf('|')+1);

        usr[i] = u;
        pass[i] = p;
        i++;
    }
}
