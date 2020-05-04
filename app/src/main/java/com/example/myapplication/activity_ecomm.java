package com.example.myapplication;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class activity_ecomm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecomm);

        VideoView cricket = findViewById(R.id.ecomm);
        cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ecomm);
        MediaController mediaController = new MediaController(this);
        cricket.setMediaController(mediaController);
        mediaController.setAnchorView(cricket);
        cricket.start();

    }
}