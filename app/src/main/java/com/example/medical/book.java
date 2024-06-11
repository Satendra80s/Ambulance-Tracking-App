package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class book extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://hospital-47151-default-rtdb.firebaseio.com");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);


        final EditText pick= findViewById(R.id.editText);
        final EditText Destination = findViewById(R.id.editText2);
        final RadioButton als = findViewById(R.id.radioButton3);
        final RadioButton bls = findViewById(R.id.radioButton4);
        final RadioButton trasport = findViewById(R.id.radioButton5);
        final  EditText mobile = findViewById(R.id.MobileNo);
        final Button sumbit = findViewById(R.id.submit);


        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final  String phonetxt = mobile.getText().toString();
                final  String pickloc =pick.getText().toString();

                if(phonetxt.isEmpty()|| pickloc.isEmpty()){
                    Toast.makeText(book.this, "Enter the deatils", Toast.LENGTH_SHORT).show();
                }
                else{
                    databaseReference.child("User").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if(snapshot.hasChild(phonetxt)){
                                Toast.makeText(book.this, "old user ", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                databaseReference.child("user").child(phonetxt).child("pickloc").setValue(pickloc);
                                Toast.makeText(book.this, "done", Toast.LENGTH_SHORT).show();
                                finish();

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }
            }
        });

        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(book.this, "Ambulance is arriving", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}