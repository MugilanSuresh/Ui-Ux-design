package com.example.pro_v.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pro_v.Adapter.Adapter2;
import com.example.pro_v.Object.Model2;
import com.example.pro_v.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryList extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Model2> view1;
    Adapter2 adapter;
    LinearLayout ll1,ll2,linearBook;
    TextView amt2,no_of_serv,TotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        getSupportActionBar().hide();
        ll1=findViewById(R.id.ll1);
        linearBook=findViewById(R.id.linearbook);
        TotalAmount=findViewById(R.id.totalamount);
        no_of_serv=findViewById(R.id.no_of_serv);

//        no_of_serv.getText().toString();
//        TotalAmount.setText(no_of_serv.getText().toString());

        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryList.this, ChooseAddress.class);
                startActivity(intent);
            }
        });

        initData();
        initRecyclerView();

//        int num1 = Integer.parseInt(no_of_serv.getText().toString());
//        int num2 = 99;
//        int sum = num1 * num2;
//        System.out.println(sum);
//        TotalAmount.setText(String.valueOf(sum));

    }
    private void initData() {
        view1 = new ArrayList<>();

        view1.add(new Model2("Ceiling Fan(Repair)","Rs.99","Add",R.drawable.ic_baseline_report_24,R.drawable.ic_baseline_add_circle_outline_24));
        view1.add(new Model2("Ceiling Fan (Installation)","Rs. 99","Add",R.drawable.ic_baseline_report_24,R.drawable.ic_baseline_add_circle_outline_24));
        view1.add(new Model2("Wall Fan (Installation/Repair)","Rs. 99","Add",R.drawable.ic_baseline_report_24,R.drawable.ic_baseline_add_circle_outline_24));
        view1.add(new Model2("Exhaust Fan (Installation/Repair)","Rs. 99","Add",R.drawable.ic_baseline_report_24,R.drawable.ic_baseline_add_circle_outline_24));

    }
    public void calculate(int i){
        if(i==0){
            linearBook.setVisibility(View.GONE);
        }
        else {
            linearBook.setVisibility(View.VISIBLE);
        }
        if (i==2){
            no_of_serv.getText().toString();
            String currentValue = no_of_serv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            System.out.println(value);
            no_of_serv.setText(String.valueOf(value));
        }
        if (i==3){
            String currentValue = no_of_serv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value--;
            no_of_serv.setText(String.valueOf(value));
        }
        int num1 = Integer.parseInt(no_of_serv.getText().toString());
        int num2 = 99;
        int sum = num1 * num2;
        System.out.println(sum);
        TotalAmount.setText(String.valueOf(sum));

    }
//    public  void updateamount(String string1, int string2, TextView textView){
//        string1=no_of_serv.getText().toString();
//        string2=99;
//        textView=findViewById(R.id.totalamount);
//        solution=(int)(string1*string2);
//    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recycler1);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter2(CategoryList.this, view1,CategoryList.this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}










