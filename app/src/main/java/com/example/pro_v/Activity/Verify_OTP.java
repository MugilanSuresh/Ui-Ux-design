package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pro_v.R;

public class Verify_OTP extends AppCompatActivity {
    ImageView imageView;
    Button button;
    EditText otp1,otp2,otp3,otp4,otp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);
        getSupportActionBar().hide();
        imageView=findViewById(R.id.back_login);
        button=findViewById(R.id.verify_otp);
        otp1=findViewById(R.id.otp1);
        otp2=findViewById(R.id.otp2);
        otp3=findViewById(R.id.otp3);
        otp4=findViewById(R.id.otp4);
        otp5=findViewById(R.id.otp5);


        otp1.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int textlength1 = otp1.getText().length();
                if (textlength1 >= 1) {
                    otp2.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });

        otp2.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int textlength2 = otp2.getText().length();
                if (textlength2 >= 1) {
                    otp3.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }});

        otp3.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int textlength2 = otp3.getText().length();

                if (textlength2 >= 1) {
                    otp4.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }});

        otp4.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int textlength2 = otp4.getText().length();
                if (textlength2 >= 1) {
                    otp5.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }});
//        otp5.addTextChangedListener(new TextWatcher() {
//
//            public void onTextChanged(CharSequence s, int start, int before,
//                                      int count) {
//                int textlength2 = otp5.getText().length();
//
//                if (textlength2 >= 1) {
//                    otp6.requestFocus();
//                }
//            }
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count,
//                                          int after) {
//
//
//            }});

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Verify_OTP.this,Update_profile.class);
                startActivity(intent);
            }
        });
    }
}