package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class classlist extends AppCompatActivity {

    Button btn6,btn7,btn8,btn9,btn10,btn11,btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classlist);

        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classlist.this, subjectlist.class);
                intent.putExtra("classvalue","6/");
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classlist.this, subjectlist.class);
                intent.putExtra("classvalue","7/");
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classlist.this, subjectlist.class);
                intent.putExtra("classvalue","8/");
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classlist.this, subjectlist.class);
                intent.putExtra("classvalue","9/");
                startActivity(intent);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classlist.this, subjectlist.class);
                intent.putExtra("classvalue","10/");
                startActivity(intent);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classlist.this, subjectlist.class);
                intent.putExtra("classvalue","11/");
                startActivity(intent);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classlist.this, subjectlist.class);
                intent.putExtra("classvalue","12/");
                startActivity(intent);
            }
        });

    }
}