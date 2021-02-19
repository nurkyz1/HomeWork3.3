package com.example.homework33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class ActivityCamera extends AppCompatActivity {
Toolbar toolbar3;
Button camera;
Button video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        toolbar3= findViewById(R.id.toolbar3);
        toolbar3.setTitle(" Фото и видио");
        camera=findViewById(R.id.photo);
        video = findViewById(R.id.video);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(intent);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                startActivity(intent);
            }
        });
    }
}