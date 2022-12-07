package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
Button Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button = (Button) findViewById(R.id.Button);
        Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openLogInActivity();
            }
        });
    }

    public void openLogInActivity(){
        Intent intent = new Intent(this,LogIn.class);
        startActivity(intent);
    }

}