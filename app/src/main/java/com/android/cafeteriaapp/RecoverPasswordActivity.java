package com.android.cafeteriaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecoverPasswordActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button btn_confirmEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_password);

        initializeComponents();
    }

    private void initializeComponents() {
        toolbar = findViewById(R.id.toolbar_recoverpassword);
        toolbar.setTitle("Recuperar Senha");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimaryDark));

        btn_confirmEmail = findViewById(R.id.button_confirmEmail);
        btn_confirmEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RecoverEmailCodeActivity.class));
            }
        });
    }
}