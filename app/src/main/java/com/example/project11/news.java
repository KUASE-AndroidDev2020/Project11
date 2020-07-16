package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class news extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        TextView button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);

        TextView button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);

        TextView button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button5:
                Intent openWeatherLink = new Intent (Intent.ACTION_VIEW, Uri.parse("https://weather.yahoo.co.jp/weather/jp/26/6110/26108.html"));
                if(openWeatherLink.resolveActivity(getPackageManager()) !=null){
                    startActivity(openWeatherLink);
                }
                break;
            case R.id.button6:
                Intent openEarthquakeLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pref.kyoto.jp/kikiweb/quake/"));
                if(openEarthquakeLink.resolveActivity(getPackageManager()) !=null){
                    startActivity(openEarthquakeLink);
                }
                break;
            case R.id.button7:
                Intent openInfectionLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pref.kyoto.jp/idsc/"));
                if(openInfectionLink.resolveActivity(getPackageManager()) !=null){
                    startActivity(openInfectionLink);
                }
                break;
        }
    }
}