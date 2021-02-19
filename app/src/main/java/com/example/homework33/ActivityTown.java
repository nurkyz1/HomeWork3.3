package com.example.homework33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

public class ActivityTown extends AppCompatActivity {
    Toolbar toolbar;
    ImageView icon1;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Введите город");
        icon1 = findViewById(R.id.icon);
button=findViewById(R.id.button1);
editText= findViewById(R.id.edit_txt);


button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name",editText.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
});
    }

}