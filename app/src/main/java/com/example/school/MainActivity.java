package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView txtregister,txterror;
    Button btnlogin;
    EditText edtuserid, edtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtregister = findViewById(R.id.txtregister);
        txterror = findViewById(R.id.txterror);
        btnlogin = findViewById(R.id.btnlogin);
        edtuserid = findViewById(R.id.edtuserid);
        edtpassword = findViewById(R.id.edtpassword);
        Intent intent= new Intent(MainActivity.this,Registration.class);
        txtregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference dataRef = FirebaseDatabase.getInstance().getReference("Students");
                dataRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot snapshot) {
                        Object data = snapshot.getValue();
                        int flag=0;
                        for(DataSnapshot snapshot1: snapshot.getChildren()){
                            registation_details registation_detail = snapshot1.getValue(registation_details.class);
                            Log.d("trie","r: "+registation_detail.getEdtpassword());
                            String a=""+registation_detail.getEdtemailid();
                            String b=""+registation_detail.getEdtpassword();
                            if( a.equals(edtuserid.getText().toString()) && b.equals(edtpassword.getText().toString()) ){
                                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_LONG).show();
//                                txterror.setText("Right Credentials");
                                Intent intent1= new Intent(MainActivity.this, classlist.class);
                                startActivity(intent1);
                                flag=1;
                            }
                        }
                        if(flag==0){
                            Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_LONG).show();
                            txterror.setText("Wrong Credentials");
                        }
                        // Do something with the data
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // If there is an error, log the error message
                        Log.e("Error", error.getMessage());
                    }
                });

            }
        });
    }
}