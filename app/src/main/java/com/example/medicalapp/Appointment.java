package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Appointment extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        button = (Button) findViewById(R.id.Back_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openHomeScreenActivity();
            }
        });
    }

    public void openHomeScreenActivity(){
        Intent intent = new Intent(this,HomeScreen.class);
        startActivity(intent);
    }
}