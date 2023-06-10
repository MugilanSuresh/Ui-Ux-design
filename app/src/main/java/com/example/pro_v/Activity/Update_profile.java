package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pro_v.R;

public class Update_profile extends AppCompatActivity {
    ImageView back_otp;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        getSupportActionBar().hide();

        back_otp=findViewById(R.id.back_otp);
        update=findViewById(R.id.update);

        back_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Update_profile.this, Choose_Location.class);
                startActivity(intent);
            }
        });
    }
}