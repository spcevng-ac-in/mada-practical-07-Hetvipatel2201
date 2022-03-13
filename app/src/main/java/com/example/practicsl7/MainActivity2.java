package com.example.practicsl7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        Log.d("display", String.valueOf(id));
        ImageButton image = findViewById(R.id.temp);
        if(id == R.id.pinkwatch)
            image.setImageResource(R.drawable.watch_1);
        if(id == R.id.brownwatch)
            image.setImageResource(R.drawable.watch_2);
    }
}