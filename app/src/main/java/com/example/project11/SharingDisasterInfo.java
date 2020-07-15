package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SharingDisasterInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharing_disaster_info);
    }

    public void goToLink3(View view) {
        Intent toLink3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.city.kyoto.lg.jp/ukyo/index.html"));

        startActivity(toLink3);
    }
}
