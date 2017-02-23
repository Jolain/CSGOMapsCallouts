package com.dorner.csgomapscallouts.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dorner.csgomapscallouts.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_dust = (Button) findViewById(R.id.de_dust);
        Button button_inferno = (Button) findViewById(R.id.de_inferno);
        Button button_nuke = (Button) findViewById(R.id.de_nuke);
        Button button_overpass = (Button) findViewById(R.id.de_overpass);
        Button button_season = (Button) findViewById(R.id.de_season);
        Button button_train = (Button) findViewById(R.id.de_train);
    }

    public void onButtonClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.de_mirage: {
                Intent intent = new Intent(getApplicationContext(), MirageActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_dust2: {
                Intent intent = new Intent(getApplicationContext(), Dust2Activity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.cs_italy: {
                Intent intent = new Intent(getApplicationContext(), ItalyActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_cache: {
                Intent intent = new Intent(getApplicationContext(), CacheActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_cobblestone: {
                Intent intent = new Intent(getApplicationContext(), CobbleActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_dust: {
                Intent intent = new Intent(getApplicationContext(), DustActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_inferno: {
                Intent intent = new Intent(getApplicationContext(), InfernoActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_nuke: {
                Intent intent = new Intent(getApplicationContext(), NukeActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_overpass: {
                Intent intent = new Intent(getApplicationContext(), OverpassActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_season: {
                Intent intent = new Intent(getApplicationContext(), SeasonActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
            case R.id.de_train: {
                Intent intent = new Intent(getApplicationContext(), TrainActivity.class); //Application Context and Activity
                startActivityForResult(intent, 0);
            }
        }
    }


}
