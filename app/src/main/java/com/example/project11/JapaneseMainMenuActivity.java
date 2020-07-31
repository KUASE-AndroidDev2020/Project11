package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JapaneseMainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese_main_menu);
    }

    public void goToJapaneseHazardMapActivity(View view) {
        Intent toJapaneseHazardMap = new Intent(this, JapaneseHazardMapActivity.class);
        startActivity(toJapaneseHazardMap);
    }

    public void goToJapaneseNewsActivity(View view) {
        Intent toJapaneseNews = new Intent(this, JapaneseNewsActivity.class);
        startActivity(toJapaneseNews);
    }

    public void goToJapaneseChecklistActivity(View view) {
        Intent toJapaneseChecklist = new Intent(this, JapaneseChecklistActivity.class);
        startActivity(toJapaneseChecklist);
    }

    public void goToJapaneseQuizMenuActivity(View view) {
        Intent toJapaneseQuizMenu = new Intent(this, JapaneseQuizActivity.class);
        startActivity(toJapaneseQuizMenu);
    }

    public void goToJapaneseUserActivity(View view) {
        Intent toJapaneseUser = new Intent(this, UserProfileActivity.class);
        startActivity(toJapaneseUser);
    }

    public void goToJapaneseInformationActivity(View view) {
        Intent toJapaneseInformation = new Intent(this, JapaneseInformationActivity.class);
        startActivity(toJapaneseInformation);
    }
}