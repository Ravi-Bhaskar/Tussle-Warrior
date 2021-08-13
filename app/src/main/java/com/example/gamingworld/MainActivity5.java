package com.example.gamingworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity5 extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser mUser;
    Button logoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        logoutbtn = findViewById(R.id.logoutBtn);

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(intent);
                Toast.makeText(MainActivity5.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}