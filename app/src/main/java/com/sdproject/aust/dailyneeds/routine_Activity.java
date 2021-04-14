package com.sdproject.aust.dailyneeds;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;


public class routine_Activity extends AppCompatActivity {
    Spinner sp;
    Spinner sp2;

    TextView routin_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routine);
        sp = (Spinner) findViewById(R.id.spinner1);
        sp2 = (Spinner) findViewById(R.id.spinner2);

        List<String> list = new ArrayList<String>();

        list.add("1.1");
        list.add("1.2");
        list.add("2.1");
        list.add("2.2");
        list.add("3.1");
        list.add("3.2");
        list.add("4.1");
        list.add("4.2");

        List<String> list2 = new ArrayList<String>();

        list2.add("A");
        list2.add("B");
        list2.add("C");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list2);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                routin_tv = (TextView) findViewById(R.id.semister);
                routin_tv.setText(item);
                routin_tv = null;
                Toast.makeText(routine_Activity.this, "selected:" + item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp2.setAdapter(adapter2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                routin_tv = (TextView) findViewById(R.id.section);
                routin_tv.setText(item);
                routin_tv = null;
                Toast.makeText(routine_Activity.this, "selected:" + item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}