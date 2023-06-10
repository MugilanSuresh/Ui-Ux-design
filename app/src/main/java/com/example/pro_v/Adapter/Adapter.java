package com.example.pro_v.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pro_v.Activity.HomeFragment;
import com.example.pro_v.Activity.Homepage;
import com.example.pro_v.Object.Model;
import com.example.pro_v.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    private List<Model> viewList1;

    public Adapter(Context context, List<Model> viewList1) {
        this.context = context;
        this.viewList1 = viewList1;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list2, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int img1 = viewList1.get(position).getImg1();
        String text1 = viewList1.get(position).getText1();

        holder.setData(img1, text1);



    }

    @Override
    public int getItemCount() {
        return viewList1.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView1;
        private ImageView imageView1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1=itemView.findViewById(R.id.text1);
            imageView1=itemView.findViewById(R.id.img_1);

        }

        public void setData(int img1, String text1) {
            textView1.setText(text1);
            imageView1.setImageResource(img1);
        }
    }
}
