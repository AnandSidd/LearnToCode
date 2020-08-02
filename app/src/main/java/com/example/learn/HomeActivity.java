package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView flutter, gcp, firebase, google, androiddev, tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        firebase = findViewById(R.id.firebase);
        flutter = findViewById(R.id.flutter);
        tf = findViewById(R.id.tf);
        google = findViewById(R.id.gdev);
        androiddev = findViewById(R.id.androiddev);
        gcp = findViewById(R.id.gcp);

        flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flutterintent = new Intent(HomeActivity.this, FlutterActivity.class);
                startActivity(flutterintent);
            }
        });

        firebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firebaseintent = new Intent(HomeActivity.this, FirebaseActivity.class);
                startActivity(firebaseintent);
            }
        });

        tf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tfintent = new Intent(HomeActivity.this, tfActivity.class);
                startActivity(tfintent);
            }
        });

        androiddev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adevintent = new Intent(HomeActivity.this, AndroiddevActivity.class);
                startActivity(adevintent);
            }
        });

        gcp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gcpintent = new Intent(HomeActivity.this, gcpActivity.class);
                startActivity(gcpintent);
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent googleintent = new Intent(HomeActivity.this, googleActivity.class);
                startActivity(googleintent);
            }
        });
    }
}
