package com.e.strokeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Predict extends AppCompatActivity {
private EditText editTextbmi,editTexthypert,editTextgluco,editTexth_disease,editTextage;
Spinner spinnergender;
Button button;
private List<String>  params;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict);
        editTextbmi = findViewById(R.id.bmi);
        editTexthypert = findViewById(R.id.hypertention);
        editTextgluco = findViewById(R.id.glucose);
        spinnergender = findViewById(R.id.gender);
        editTextage = findViewById(R.id.age);
        editTexth_disease = findViewById(R.id.h_disease);
        button = findViewById(R.id.button);
        params = new ArrayList<>();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String bmi = editTextbmi.getText().toString();
                String hypertention = editTexthypert.getText().toString();
                String glucose = editTextgluco.getText().toString();
                String age = editTextage.getText().toString();
                String h_disease = editTexth_disease.getText().toString();
                String gender =spinnergender.getSelectedItem().toString();
                if(!bmi.isEmpty() && !hypertention.isEmpty()&& !glucose.isEmpty()
                        && !age.isEmpty() && !h_disease.isEmpty()&&!gender.isEmpty()){
                    JSONArray jsonArray = new JSONArray();
                    jsonArray.put(bmi);
                    jsonArray.put(hypertention);
                    jsonArray.put(glucose);
                    jsonArray.put(age);
                    jsonArray.put(h_disease);
                    jsonArray.put(gender);
                    Toast.makeText(getApplicationContext()," JSON: "+jsonArray.toString(),Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
