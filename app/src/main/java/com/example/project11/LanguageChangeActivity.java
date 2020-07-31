package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LanguageChangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_change);
    }

    public void goToJapaneseMainMenuActivity(View view) {
        Intent toJapaneseMainMenu = new Intent(this, JapaneseMainMenuActivity.class);
        startActivity(toJapaneseMainMenu);
    }

    public void goToMainMenuActivity(View view) {
        Intent toMainMenu = new Intent(this, MainMenuActivity.class);
        startActivity(toMainMenu);
    }
}