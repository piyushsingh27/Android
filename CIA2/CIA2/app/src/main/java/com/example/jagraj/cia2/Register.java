package com.example.jagraj.cia2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Register extends DialogFragment {


    OnDataPass dataPasser;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        dataPasser = (OnDataPass) context;
    }


    public void passData(String data) {
        dataPasser.onDataPass(data);
    }


    public static Register newInstance(String title) {
        Register frag = new Register();
//        Bundle args = new Bundle();
//        args.putString("title", title);
//        frag.setArguments(args);
        return frag;
    }


    EditText e1,e2;
    Button b1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v;
        v = inflater.inflate(R.layout.fragment_register, container, false);
        // Inflate the layout for this fragment

        e1 = v.findViewById(R.id.id);
        e2 = v.findViewById(R.id.pass);
        b1 = v.findViewById(R.id.reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2;
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {

                }
                else
                {
                    passData(s1+"|"+s2);
                    getActivity().getSupportFragmentManager().beginTransaction().remove(Register.this).commit();
                }

            }
        });
        return v;
    }
}
