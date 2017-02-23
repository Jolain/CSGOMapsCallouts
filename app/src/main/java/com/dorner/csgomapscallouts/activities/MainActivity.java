package com.dorner.csgomapscallouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.dorner.csgomapscallouts.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_mirage = (Button) findViewById(R.id.de_mirage);
        Button button_dust2 = (Button) findViewById(R.id.de_dust2);
        Button button_italy = (Button) findViewById(R.id.cs_italy);
        Button button_cache = (Button) findViewById(R.id.de_cache);
        Button button_cobble = (Button) findViewById(R.id.de_cobblestone);
        Button button_dust = (Button) findViewById(R.id.de_dust);
        Button button_inferno = (Button) findViewById(R.id.de_inferno);
        Button button_nuke = (Button) findViewById(R.id.de_nuke);
        Button button_overpass = (Button) findViewById(R.id.de_overpass);
        Button button_season = (Button) findViewById(R.id.de_season);
        Button button_train = (Button) findViewById(R.id.de_train);
    }
}
