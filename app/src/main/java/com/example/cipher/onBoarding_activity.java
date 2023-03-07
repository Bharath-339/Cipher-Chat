package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class onBoarding_activity extends AppCompatActivity {

    Button create_account;
    TextView restore;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);


        mAuth = FirebaseAuth.getInstance();

        create_account = findViewById(R.id.signup);
        restore = findViewById(R.id.login);

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(onBoarding_activity.this,signup_activity.class);
                startActivity(i);
                finish();
            }
        });

        restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(onBoarding_activity.this,login_activity.class);
                startActivity(i);
                finish();
            }
        });

        if(mAuth.getCurrentUser()!= null){
            Intent i = new Intent(onBoarding_activity.this,MainActivity.class);
            startActivity(i);
            finish();
        }




    }
}