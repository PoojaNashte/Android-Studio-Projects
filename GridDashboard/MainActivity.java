package com.example.griddashboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button exp1, exp2, exp3, exp4, exp5, exp6, exp7, exp8, exp9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exp1 = findViewById(R.id.exp1);
        exp2 = findViewById(R.id.exp2);
        exp3 = findViewById(R.id.exp3);
        exp4 = findViewById(R.id.exp4);
        exp5 = findViewById(R.id.exp5);
        exp6 = findViewById(R.id.exp6);
        exp7 = findViewById(R.id.exp7);
        exp8 = findViewById(R.id.exp8);
        exp9 = findViewById(R.id.exp9);

        exp1.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp1linearlayout",
                    "com.example.exp1linearlayout.MainActivity");
            startActivity(intent);
        });

        exp2.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp2relativelayout",
                    "com.example.exp2relativelayout.MainActivity");
            startActivity(intent);
        });

        exp3.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp3framelayout",
                    "com.example.exp3framelayout.MainActivity");
            startActivity(intent);
        });

        exp4.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp4tablelayout",
                    "com.example.exp4tablelayout.MainActivity");
            startActivity(intent);
        });

        exp5.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp5gridlayout",
                    "com.example.exp5gridlayout.MainActivity");
            startActivity(intent);
        });

        exp6.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp6constraintlayout",
                    "com.example.exp6constraintlayout.MainActivity");
            startActivity(intent);
        });

        exp7.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp7absolutelayout",
                    "com.example.exp7absolutelayout.MainActivity");
            startActivity(intent);
        });

        exp8.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp8loginlayout",
                    "com.example.exp8loginlayout.MainActivity");
            startActivity(intent);
        });

        exp9.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.exp9profile",
                    "com.example.exp9profile.ProfileActivity");
            startActivity(intent);
        });

    }
}