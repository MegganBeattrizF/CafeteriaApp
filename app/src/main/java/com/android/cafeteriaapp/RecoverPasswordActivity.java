package com.android.cafeteriaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.os.Bundle;

public class RecoverPasswordActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_password);

        initializeComponents();
    }

    private void initializeComponents() {
        toolbar = findViewById(R.id.toolbar_recoverpassword);
        toolbar.setTitle("Recuperar Senha");
    }
}