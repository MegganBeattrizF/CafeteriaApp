package com.android.cafeteriaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecoverEmailCodeActivity extends AppCompatActivity {

    Button btn_verifyCode;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_email_code);

        initializeComponents();
    }

    private void initializeComponents() {
        toolbar = findViewById(R.id.toolbar_recover_email_code);
        toolbar.setTitle("Recuperar Senha");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimaryDark));

        btn_verifyCode = findViewById(R.id.button_verifyCode);
        btn_verifyCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ChangePasswordActivity.class));
            }
        });
    }
}