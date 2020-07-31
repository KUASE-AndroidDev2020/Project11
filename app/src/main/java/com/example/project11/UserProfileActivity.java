package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }

    public void goToChangeLanguageActivity(View view) {
        Intent toChangeLanguage = new Intent(this, LanguageChangeActivity.class);
        startActivity(toChangeLanguage);
    }
}