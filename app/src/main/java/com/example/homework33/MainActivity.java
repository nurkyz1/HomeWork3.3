package com.example.homework33;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView icon1;
ImageView camera;
ImageView contacts;
ImageView google;
Button toast;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon1=findViewById(R.id.icon);
        camera = findViewById(R.id.camera);
        contacts= findViewById(R.id.contacts);
        google= findViewById(R.id.google);
        toast= findViewById(R.id.button);
        textView=findViewById(R.id.text);
icon1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent= new Intent(MainActivity.this, ActivityTown.class);
        startActivityForResult(intent,101);
    }
});

camera.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,ActivityCamera.class);
        startActivity(intent);
    }
});
contacts.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent( MainActivity.this,ActivityContacts.class);
        startActivity(intent);
    }
});
google.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,ActivityGoogle.class);
        startActivity(intent);
    }
});
toast.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Будь на позитиве!!!", Toast.LENGTH_SHORT).show();
    }
});
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && resultCode == RESULT_OK){
            String valueEdit = data.getStringExtra("name");
            textView.setText(valueEdit);
        }
    }
}