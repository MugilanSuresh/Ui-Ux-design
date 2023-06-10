package com.example.pro_v;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pro_v.Adapter.AdapterFrag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NextFrag extends AppCompatActivity {

    ViewPager viewpager1;
    BottomNavigationView bottomNavigationView;

    HomeFrag1 homeFrag1;
    BookFrag1 bookFrag1;
    ShopFrag1 shopFrag1;
    ProfileFrag1 profileFrag1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_frag);
        getSupportActionBar().hide();

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavigationView1);
        viewpager1 = (ViewPager) findViewById(R.id.ViewPager1);

//        final AdapterFrag adapterFrag = new AdapterFrag(getSupportFragmentManager(),this,bottomNavigationView.setSelectedItemId(R.id.homebut1));
//        viewpager1.setAdapter(adapterFrag);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id:homeFrag1;
//                }
//                return false;
//            }
//        });

    }
}