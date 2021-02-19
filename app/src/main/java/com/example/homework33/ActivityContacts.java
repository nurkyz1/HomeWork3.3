package com.example.homework33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class ActivityContacts extends AppCompatActivity {
    Toolbar toolbar1;
    Button contacts;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar1= findViewById(R.id.toolbar1);
        setTitle("Введите номер телефона");
        setContentView(R.layout.activity_contacts);
        contacts = findViewById(R.id.button3);

editText = findViewById(R.id.edit_txt1);
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number="tel:"+ editText.getText().toString();
                Intent intent = new Intent( Intent.ACTION_DIAL, Uri.parse(number));
                startActivity(intent);
            }

        });
    }
}