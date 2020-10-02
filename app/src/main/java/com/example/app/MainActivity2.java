package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseUser;

public class MainActivity2 extends AppCompatActivity {
private Button learn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      learn = findViewById(R.id.buttonLearn);
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent i = new Intent(MainActivity2.this, Learn.class);
                    startActivity(i);
            }
        });

    }


    public void browser1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vaishnavi5183.github.io/"));
        startActivity(browserIntent);
    }
    public void goHome(View view){
        ParseUser.logOut();
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);
    }


}