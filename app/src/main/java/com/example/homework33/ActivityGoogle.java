package com.example.homework33;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class ActivityGoogle extends AppCompatActivity {
    Toolbar toolbar2;
    Button search;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar2=findViewById(R.id.toolbar2);
        toolbar2.setTitle("Введите запрос ");
        setContentView(R.layout.activity_google);
        search=findViewById(R.id.button2);
        editText= findViewById(R.id.edit_txt2);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String text = editText.getText().toString();
                intent.putExtra(SearchManager.QUERY,text);
                startActivity(intent);
            }
        });
    }
}