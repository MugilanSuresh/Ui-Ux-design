package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pro_v.Adapter.AdapterService;
import com.example.pro_v.Object.ModelService;
import com.example.pro_v.R;

import java.util.ArrayList;
import java.util.List;

public class HomeService extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelService> viewlist3;
    AdapterService adapter;

    ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_service);
        getSupportActionBar().hide();

        button=findViewById(R.id.back_service);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        initdata();
        initRecyclerView();

//        String name = TextView.gettext().to



//        ModelService Electrician = new ModelService();
//        Electrician.setImage_1(R.drawable.electrician);
//        Electrician.setText_1("Electrician");
//
//        viewlist3.add(Electrician);
//
//        ModelService Plumber = new ModelService();
//        Plumber.setImage_1(R.drawable.plumber);
//        Plumber.setText_1("Plumber");
//
//        viewlist3.add(Plumber);
//
//        ModelService Painter = new ModelService();
//        Painter.setImage_1(R.drawable.painter);
//        Painter.setText_1("Painter");
//
//        viewlist3.add(Painter);



    }

    private void initdata() {
        viewlist3 = new ArrayList<>();
        viewlist3.add(new ModelService(R.drawable.electrician,"Electrician"));
        viewlist3.add(new ModelService(R.drawable.plumber,"Plumber"));
        viewlist3.add(new ModelService(R.drawable.carpenter,"Carpenter"));
        viewlist3.add(new ModelService(R.drawable.painter,"Painter"));
        viewlist3.add(new ModelService(R.drawable.welder,"Welder"));
        viewlist3.add(new ModelService(R.drawable.mason,"Mason"));


        }


    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerview2);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new AdapterService(HomeService.this,viewlist3);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}