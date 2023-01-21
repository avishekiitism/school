package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity {

    EditText edtfullname, edtguardianname, edtclass, edtsection, edtmobilenumber, edtemailid, edtpassword;
    Button btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edtfullname=findViewById(R.id.edtstudentname);
        edtguardianname=findViewById(R.id.edtguardianname);
        edtclass=findViewById(R.id.edtclass);
        edtsection=findViewById(R.id.edtsection);
        edtmobilenumber=findViewById(R.id.edtmobilenumber);
        edtemailid=findViewById(R.id.edtemailid);
        edtpassword=findViewById(R.id.edtpassword);
        btnsignup=findViewById(R.id.btnsignup);


        DatabaseReference firebaseDatabase= FirebaseDatabase.getInstance().getReference("Students");

        Intent intent=new Intent(Registration.this, MainActivity.class);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registation_details cdf= new registation_details(""+edtfullname.getText().toString(),""+edtguardianname.getText().toString(),
                        ""+edtclass.getText().toString(),""+edtsection.getText().toString(),""+edtmobilenumber.getText().toString(),""+edtemailid.getText().toString(),""+edtpassword.getText().toString());

                firebaseDatabase.child(edtemailid.getText().toString()).setValue(cdf);
                Toast.makeText(getApplicationContext(), ""+edtfullname.getText().toString()+"Registered Successfully", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

    }
}