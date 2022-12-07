package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
Button button;
Button buttonn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        button = (Button) findViewById(R.id.button44);
        buttonn = (Button) findViewById(R.id.button_appointment);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openDoctorsActivity();
            }

        });
        buttonn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openAppointmentActivity();
            }

        });
    }
        public void openDoctorsActivity(){
            Intent intent = new Intent(this,Doctors.class);
            startActivity(intent);

    }
    public void openAppointmentActivity(){
        Intent i = new Intent(this,Appointment.class);
        startActivity(i);
    }
}