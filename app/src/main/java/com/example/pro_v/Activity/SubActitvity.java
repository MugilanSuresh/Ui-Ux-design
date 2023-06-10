package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pro_v.Adapter.Adapter1;
import com.example.pro_v.Object.Model1;
import com.example.pro_v.R;

import java.util.ArrayList;
import java.util.List;

public class SubActitvity extends AppCompatActivity {

    RecyclerView recyclerview;
    LinearLayoutManager layoutManager;
    List<Model1> viewList4;
    Adapter1 adapter1;

    ImageView button, imageView, imageView1;
    TextView textView;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_actitvity);
        getSupportActionBar().hide();

        button = findViewById(R.id.back_service1);
        imageView = findViewById(R.id.fan1);
        textView = findViewById(R.id.textview_1);
        imageView1=findViewById(R.id.img_2);

        textView.setText(getIntent().getExtras().getString("key"));
//        imageView.setImageResource(getIntent().getExtras().getString("key1"));
        int resId= getIntent().getIntExtra("key1",0);
        imageView1.setImageResource(resId);
//        int resId= getIntent().getIntExtra("key1",0);
//        System.out.println(resId);
//        imageView.setImageResource(resId);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });
        initData();
    }

    private void getText(String text_1) {
    }

    private void initRecyclerView() {
        recyclerview=findViewById(R.id.recyclerviewfan);
        recyclerview.setLayoutManager(new GridLayoutManager(SubActitvity.this,3 ,LinearLayoutManager.VERTICAL,false));
        adapter1= new Adapter1(SubActitvity.this,viewList4);
        recyclerview.setAdapter(adapter1);
    }

    private void initData() {
        viewList4 = new ArrayList<>();

        viewList4.add(new Model1(R.drawable.fan,"Fan"));
        viewList4.add(new Model1(R.drawable.switch1,"Switch & Socket"));
        viewList4.add(new Model1(R.drawable.light,"Lights"));
        viewList4.add(new Model1(R.drawable.mcb,"MCB & Fuse"));
        viewList4.add(new Model1(R.drawable.heater,"Water Heater"));
        viewList4.add(new Model1(R.drawable.electrician_1,"General Work"));

        initRecyclerView();


    }
}
