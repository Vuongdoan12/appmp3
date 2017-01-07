package com.example.hcd_fresher024.appmp3.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.hcd_fresher024.appmp3.R;

/**
 * Created by HCD-Fresher024 on 1/6/2017.
 */

public class ActivityPlaySong extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playsong);
        Intent intent = getIntent();

        Log.d("TAG",intent.getExtras().getString("ID"));
    }


}
