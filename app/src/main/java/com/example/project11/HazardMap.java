package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HazardMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazard_map);
    }

    public void goToLink1(View view) {
        Intent toLink1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bousai-kyoto-city.jp/bousai/pdf/dismap/jishin/09jishin-2.pdf"));

        startActivity(toLink1);
    }

    public void goToLink2(View view) {
        Intent toLink2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bousai-kyoto-city.jp/bousai/pdf/dismap/mizu/07mizu_l.pdf"));

        startActivity(toLink2);
    }
}
