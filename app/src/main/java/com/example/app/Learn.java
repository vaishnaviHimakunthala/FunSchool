package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Learn extends AppCompatActivity {
    Button ad, eh, il, mp, qt, ux, yz, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        ad = findViewById(R.id.buttonAD);
        eh = findViewById(R.id.buttonEH);
        il = findViewById(R.id.buttonIL);
        mp = findViewById(R.id.buttonMP);
        qt = findViewById(R.id.buttonQT);
        ux = findViewById(R.id.buttonQT);
        yz = findViewById(R.id.buttonYZ);
        p = findViewById(R.id.button);

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Learn.this, AD.class);
                startActivity(i);
            }
        });

        eh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Learn.this, EH.class);
                startActivity(j);
            }
        });

        il.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Learn.this, IL.class);
                startActivity(j);
            }
        });

        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Learn.this, MP.class);
                startActivity(k);
            }
        });

        qt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Learn.this, QT.class);
                startActivity(a);
            }
        });

        ux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Learn.this, UX.class);
                startActivity(b);
            }
        });

        yz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Learn.this, YZ.class);
                startActivity(c);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Learn.this, picture.class);
                startActivity(d);
            }
        });

    }



}