package com.example.listeplanetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> planetes;
    ListView listview;
    PlaneteAdapter adapter;
    Button verifier = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Data datas = new Data();
        listview = (ListView) findViewById(R.id.listView);
        adapter = new PlaneteAdapter(datas.getPlanetesName(),MainActivity.this);
        listview.setAdapter(adapter);

        verifier = (Button) findViewById(R.id.verifier_btn);
        verifier.setOnClickListener(verifierListener);
    }

    private View.OnClickListener verifierListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

        }
    };

    /*
    private void installePlanetes() {
        planetes = new ArrayList<String>();
        planetes.add("Mercure");
        planetes.add("Venus");
        planetes.add("Terre");
        planetes.add("Mars");
        planetes.add("Jupiter");
        planetes.add("Saturne");
        planetes.add("Uranus");
        planetes.add("Neptune");
        planetes.add("Pluton");
    }*/
}