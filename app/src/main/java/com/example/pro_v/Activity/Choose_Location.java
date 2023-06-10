package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.pro_v.R;

public class Choose_Location extends AppCompatActivity {
    Button confirms,add;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location);
        getSupportActionBar().hide();

        confirms =findViewById(R.id.confrim);
        add=findViewById(R.id.add_details);
        linearLayout=findViewById(R.id.details);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add.setVisibility(View.GONE);
                linearLayout.setVisibility(View.VISIBLE);


            }
        });

        confirms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Choose_Location.this, Homepage.class);
                startActivity(intent);
            }
        });
    }
}