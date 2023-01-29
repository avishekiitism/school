package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subjectlist extends AppCompatActivity {

    Button hindi,english,maths,science,sst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjectlist);

        hindi= findViewById(R.id.hindi);
        english= findViewById(R.id.english);
        maths= findViewById(R.id.maths);
        science= findViewById(R.id.science);
        sst= findViewById(R.id.sst);

        Intent intent = getIntent();
        String classvalue= intent.getStringExtra("classvalue");

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(subjectlist.this, subjectpdflist.class);
                intent.putExtra("loc",classvalue+"Hindi/");
                startActivity(intent);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(subjectlist.this, subjectpdflist.class);
                intent.putExtra("loc",classvalue+"English/");
                startActivity(intent);
            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(subjectlist.this, subjectpdflist.class);
                intent.putExtra("loc",classvalue+"Maths/");
                startActivity(intent);
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(subjectlist.this, subjectpdflist.class);
                intent.putExtra("loc",classvalue+"Science/");
                startActivity(intent);
            }
        });

        sst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(subjectlist.this, subjectpdflist.class);
                intent.putExtra("loc",classvalue+"SST/");
                startActivity(intent);
            }
        });

    }
}