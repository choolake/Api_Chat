package com.choolake.apichat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signInExistingUser(View view) {
    }

    public void registerNewUser(View view) {
        Intent intent = new Intent(this, com.choolake.apichat.RegisterActivity.class);
        finish();
        startActivity(intent);
    }
}