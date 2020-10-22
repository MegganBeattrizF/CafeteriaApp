package com.android.cafeteriaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressWarnings("ALL")
public class ApresentationActivity extends AppCompatActivity {

    Button btnSignIn, btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentation);

        initializeComponents();
        callbacksToActivity();

    }

    @SuppressLint("InlinedApi")
    private void initializeComponents() {
        btnSignIn = findViewById(R.id.button_sign_in);
        btnSignUp = findViewById(R.id.button_sign_up);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


    }

    private void callbacksToActivity(){

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finish();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class));
                finish();
            }
        });
    }
}