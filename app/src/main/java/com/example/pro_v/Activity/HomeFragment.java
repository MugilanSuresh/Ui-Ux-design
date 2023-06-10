package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pro_v.Adapter.Adapter;
import com.example.pro_v.Adapter.AdapterHome;
import com.example.pro_v.Adapter.ImageAdapter1;
import com.example.pro_v.NextFrag;
import com.example.pro_v.Object.Model;
import com.example.pro_v.Object.ModelHome;
import com.example.pro_v.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeFragment extends Fragment {
    ViewPager viewPager;
    RecyclerView recyclerView,recyclerviewcat;
    LinearLayoutManager layoutManager;
    List<ModelHome> viewList;
    ImageAdapter1 adapter;

    RecyclerView recyclerView1;
    LinearLayoutManager layoutManager1;
    ArrayList<Model> models = new ArrayList<>();
    Adapter adapter1,adapter2;

    Button servicebut;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_home_fragment, container, false);
        viewPager= (ViewPager) root.findViewById(R.id.ViewPager);
        adapter = new ImageAdapter1(this.getActivity());
        viewPager.setAdapter(adapter);

        recyclerView=(RecyclerView) root.findViewById(R.id.recyclerview);
        AdapterHome recyclerviewAdapter1 = new AdapterHome(getContext(),viewList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerviewAdapter1);

        recyclerviewcat=(RecyclerView) root.findViewById(R.id.recyclerview1);
        Adapter recyclerAdapter = new Adapter(getContext(),models);
        recyclerviewcat.setLayoutManager(new GridLayoutManager(getActivity(),3,LinearLayoutManager.VERTICAL,false));
        recyclerviewcat.setAdapter(recyclerAdapter);

        servicebut=root.findViewById(R.id.servicebut);
        servicebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), NextFrag.class);
                startActivity(intent);
            }
        });
        return root;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRecyclerView();
        getCategorydata();
    }
    private void getCategorydata() {
        models=new ArrayList<>();
        models.add(new Model(R.drawable.ic_baseline_cable_24,"Electrician"));
        models.add(new Model(R.drawable.ic_baseline_tap_24,"Plumber"));
        models.add(new Model(R.drawable.ic_baseline_carpenter_24,"Carpenter"));
        models.add(new Model(R.drawable.ic_baseline_ac_24,"AC Repair"));
        models.add(new Model(R.drawable.ic_baseline_machine_24,"Washing Machine"));
        models.add(new Model(R.drawable.ic_baseline_cam_24,"CCTV"));
    }
    private void initRecyclerView() {
        viewList = new ArrayList<>();
        viewList.add(new ModelHome(R.drawable.electrician,R.drawable.ic_baseline_arrow_circle_right_24,"General Home Services","Electrician|Plumber|Carpender"));
        viewList.add(new ModelHome(R.drawable.cleaning,R.drawable.ic_baseline_arrow_circle_right_24,"Home Cleaning Services","Deep Clean|Bathroom|Kitchen"));
        viewList.add(new ModelHome(R.drawable.electrician_1,R.drawable.ic_baseline_arrow_circle_right_24,"Electrician Services","AC|Television|Refrigerator"));
    }

//    private void initData() {
//        recyclerView= recyclerView.findViewById(R.id.recyclerview);
//        layoutManager=new LinearLayoutManager(requireContext());
//        layoutManager.setOrientation(RecyclerView.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter=new AdapterHome(getActivity(),viewList);
//        recyclerView.setAdapter(adapter1);
//        adapter.notifyDataSetChanged();
//    }



//    initRecyclerView();
//        getCategorydata();
//        initData();
//    }
//    private void  getcatrecycler(){
//        recyclerviewcat=findViewById(R.id.recyclerview1);
//        recyclerviewcat.setLayoutManager(new GridLayoutManager(Homepage.this,3,LinearLayoutManager.VERTICAL,false));
//        catadapter=new Adapter(Homepage.this,models);
//        recyclerviewcat.setAdapter(catadapter);
//    }
//    private void getCategorydata(){
//        models=new ArrayList<>();
//
//        models.add(new Model(R.drawable.ic_baseline_cable_24,"Electrician"));
//        models.add(new Model(R.drawable.ic_baseline_tap_24,"Plumber"));
//        models.add(new Model(R.drawable.ic_baseline_carpenter_24,"Carpenter"));
//        models.add(new Model(R.drawable.ic_baseline_ac_24,"AC Repair"));
//        models.add(new Model(R.drawable.ic_baseline_machine_24,"Washing Machine"));
//        models.add(new Model(R.drawable.ic_baseline_cam_24,"CCTV"));
//
//        getcatrecycler();
//    }
//
//    private void initRecyclerView() {
//        viewList = new ArrayList<>();
//
//        viewList.add(new ModelHome(R.drawable.electrician,R.drawable.ic_baseline_arrow_circle_right_24,"General Home Services","Electrician|Plumber|Carpender"));
//        viewList.add(new ModelHome(R.drawable.cleaning,R.drawable.ic_baseline_arrow_circle_right_24,"Home Cleaning Services","Deep Clean|Bathroom|Kitchen"));
//        viewList.add(new ModelHome(R.drawable.electrician_1,R.drawable.ic_baseline_arrow_circle_right_24,"Electrician Services","AC|Television|Refrigerator"));
//    }
//    private void initData() {
//        recyclerView=findViewById(R.id.recyclerview);
//        layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter=new AdapterHome(Homepage.this,viewList);
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//
//        ImageAdapter1 adapterView = new ImageAdapter1(this);
//        ViewPager.setAdapter(adapterView);
////
//        initRecyclerView();
//        getCategorydata();
//        initData();
//    }
//    private void  getcatrecycler(){
//        recyclerviewcat (recyclerviewcat) =findViewById(R.id.recyclerview1);
//        recyclerviewcat.setLayoutManager(new GridLayoutManager(HomeFragment.this,3,LinearLayoutManager.VERTICAL,false));
//        catadapter=new Adapter(HomeFragment.this,models);
//        recyclerviewcat.setAdapter(catadapter);
    }

