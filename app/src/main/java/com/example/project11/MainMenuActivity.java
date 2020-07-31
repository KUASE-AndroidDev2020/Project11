package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void goToSharingDisasterInfoActivity(View view) {
        Intent toShare = new Intent(this, SharingDisasterInfo.class);
        startActivity(toShare);
    }

    public void goToHazardMapActivity(View view) {
        Intent toHazard = new Intent(this, HazardMap.class);
        startActivity(toHazard);
    }

    public void goToCheckListActivity(View view) {
        Intent toCheckList = new Intent(this, check_list.class);
        startActivity(toCheckList);
    }

    public void goToQuizMenuActivity(View view) {
        Intent toQuizMenu = new Intent(this, QuizMenuActivity.class);
        startActivity(toQuizMenu);
    }

    public void goToNewsActivity(View view) {
        Intent toNews = new Intent(this, news.class);
        startActivity(toNews);
    }

    public void goToOptionActivity(View view) {
        Intent toOption = new Intent(this, OptionActivity.class);
        startActivity(toOption);
    }
}