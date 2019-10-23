package com.example.recipevideo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.res.Configuration;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String url = getIntent().getStringExtra("url");
        FragmentManager fragmentManager = getSupportFragmentManager();
        VideoFragment videoFragment = VideoFragment.newInstance(url);
        fragmentManager.beginTransaction().add(R.id.detailSteps_container, videoFragment).commit();
    }
}

