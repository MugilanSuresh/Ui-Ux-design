package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pro_v.R;

import java.util.Calendar;

public class ChooseDateTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_date_time);
        getSupportActionBar().hide();
    }
}