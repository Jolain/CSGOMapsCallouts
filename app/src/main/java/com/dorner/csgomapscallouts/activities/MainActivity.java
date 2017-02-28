package com.dorner.csgomapscallouts.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dorner.csgomapscallouts.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.de_mirage: {
                Intent intent = new Intent(getApplicationContext(), MirageActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_dust2: {
                Intent intent = new Intent(getApplicationContext(), Dust2Activity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.cs_italy: {
                Intent intent = new Intent(getApplicationContext(), ItalyActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_cache: {
                Intent intent = new Intent(getApplicationContext(), CacheActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_cobblestone: {
                Intent intent = new Intent(getApplicationContext(), CobbleActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_dust: {
                Intent intent = new Intent(getApplicationContext(), DustActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_inferno: {
                Intent intent = new Intent(getApplicationContext(), InfernoActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_nuke: {
                Intent intent = new Intent(getApplicationContext(), NukeActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_overpass: {
                Intent intent = new Intent(getApplicationContext(), OverpassActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_season: {
                Intent intent = new Intent(getApplicationContext(), SeasonActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            case R.id.de_train: {
                Intent intent = new Intent(getApplicationContext(), TrainActivity.class);
                startActivityForResult(intent, 0);
                break;
            }
            default:
                break;
        }
    }


}
