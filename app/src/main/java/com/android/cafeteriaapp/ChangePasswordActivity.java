package com.android.cafeteriaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ChangePasswordActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        initializeComponents();
    }

    private void initializeComponents() {
        toolbar = findViewById(R.id.tollbar_changePassword);
        toolbar.setTitle("Recuperar Senha");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimaryDark));
    }
}