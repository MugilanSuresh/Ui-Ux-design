package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.pro_v.R;

public class ChooseAddress extends AppCompatActivity {
    ImageView button;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_address);
        getSupportActionBar().hide();

        button=findViewById(R.id.back_service1);
        linearLayout=findViewById(R.id.linearbook1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChooseAddress.this, ChooseDateTime.class);
                startActivity(intent);
            }
        });
    }
}