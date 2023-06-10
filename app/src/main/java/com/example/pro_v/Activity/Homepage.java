package com.example.pro_v.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pro_v.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Homepage<FirebaseAuth> extends AppCompatActivity {
//    ViewPager ViewPager;
//    TabLayout taplayout;
//    RecyclerView recyclerView,recyclerviewcat;
//    LinearLayoutManager layoutManager;
//    List<ModelHome> viewList;
//    AdapterHome adapter;
//    Adapter catadapter;
//
//
//    RecyclerView recyclerView1;
//    LinearLayoutManager layoutManager1;
//    ArrayList<Model> models = new ArrayList<>();
//    Adapter adapter1;

    ActionBar actionBar;
    BottomNavigationView bottomNavigationView;

    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        getSupportActionBar().hide();
//        actionBar.setTitle("activity");


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(selectedListener);

        HomeFragment fragment = new HomeFragment();
        FragmentTransaction fragmentTransactionHome = getSupportFragmentManager().beginTransaction();
        fragmentTransactionHome.replace(R.id.flFragment,fragment,"");
        fragmentTransactionHome.commit();

    }

    HomeFragment fm1 = new HomeFragment();
    BookingFragment fm2 = new BookingFragment();
    ShopFragment fm3 = new ShopFragment();
    ProfileFragment fm4 = new ProfileFragment();



    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.homebut:
                    HomeFragment fragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.flFragment, fragment, "");
                    fragmentTransaction.commit();
                    return true;

                case R.id.bookbut:
                    BookingFragment fragment1 = new BookingFragment();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.flFragment, fragment1, "");
                    fragmentTransaction1.commit();
                    return true;

                case R.id.shopbut:
                    ShopFragment fragment2 = new ShopFragment();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.flFragment, fragment2, "");
                    fragmentTransaction2.commit();
                    return true;

                case R.id.profilebut:
                    ProfileFragment fragment3 = new ProfileFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.flFragment, fragment3, "");
                    fragmentTransaction3.commit();
                    return true;
            }
            return false;
        }

    };
}
