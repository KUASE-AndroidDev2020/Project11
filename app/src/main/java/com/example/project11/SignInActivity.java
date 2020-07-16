package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void goToMainMenuActivity(View view) {
        Intent toMainMenu = new Intent(this, MainMenuActivity.class);
        startActivity(toMainMenu);
    }
}