package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pro_v.R;

public class LogIn extends AppCompatActivity {
    EditText editText;
    Button button;
    ImageView imageView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        getSupportActionBar().hide();
        editText = findViewById(R.id.mobile_num);
        button = findViewById(R.id.login1);
       imageView = findViewById(R.id.back_home);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(LogIn.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(LogIn.this,Verify_OTP.class);
                    startActivity(intent);
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(LogIn.this,MainActivity.class);
//                startActivity(intent);
                onBackPressed();
            }
        });
    }


}