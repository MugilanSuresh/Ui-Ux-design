package com.example.pro_v.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pro_v.Activity.CategoryList;
import com.example.pro_v.Activity.HomeService;
import com.example.pro_v.Activity.SubActitvity;
import com.example.pro_v.Object.Model1;
import com.example.pro_v.R;

import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.ViewHolder> {
    Context context;
    private List<Model1> viewList4;
    ImageView imageView;

    public Adapter1(Context context, List<Model1> viewList4) {
        this.viewList4 = viewList4;
        this.context = context;



    }

    @NonNull
    @Override
    public Adapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list4, parent, false);
        return new Adapter1.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter1.ViewHolder holder, int position) {

        int img1 = viewList4.get(position).getFan1();
        String text1 = viewList4.get(position).getFan();

        holder.setData(img1, text1);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, CategoryList.class);
                context.startActivity(intent);
            }
        });


        }

    @Override
    public int getItemCount() {
        return viewList4.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView1;
        private ImageView imageView1;
        private LinearLayout linearLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.fan);
            imageView1 = itemView.findViewById(R.id.fan1);
            linearLayout = itemView.findViewById(R.id.linear2);
        }

        public void setData(int img1, String text1) {
            textView1.setText(text1);
            imageView1.setImageResource(img1);
        }
    }
}
