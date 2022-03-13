package com.example.practicsl7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton pinkwatch, brownwatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pinkwatch = findViewById(R.id.pinkwatch);
        brownwatch = findViewById(R.id.brownwatch);

        pinkwatch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2 .class);
                intent.putExtra("id", R.id.pinkwatch);

                startActivity(intent);
            }
        });

        brownwatch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2 .class);
                intent.putExtra("id", R.id.brownwatch);

                startActivity(intent);
            }
        });

    }
}