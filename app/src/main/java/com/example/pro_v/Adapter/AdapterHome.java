package com.example.pro_v.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pro_v.Activity.HomeService;
import com.example.pro_v.Object.ModelHome;
import com.example.pro_v.R;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {
    Context context;
    private List<ModelHome> viewList;
    public AdapterHome(Context context,List<ModelHome> viewList){
        this.viewList=viewList;
        this.context = context;
    }

    public AdapterHome(FragmentActivity activity) {
    }


    @NonNull
    @Override
    public AdapterHome.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHome.ViewHolder holder, int position) {
        int image1 =viewList.get(position).getImage1();
        String textview1 = viewList.get(position).getTextview1();
        String textview2 = viewList.get(position).getTextview2();
        int image2 = viewList.get(position).getImage2();

        holder.setData(image1,image2,textview1,textview2);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, HomeService.class);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return viewList.size();

    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textView1;
        private TextView textView2;
        private ImageView imageView1;
        private ImageView imageView2;
        private LinearLayout linearLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout=itemView.findViewById(R.id.linear1);
            textView1=itemView.findViewById(R.id.textview);
            textView2=itemView.findViewById(R.id.textview1);
            imageView1=itemView.findViewById(R.id.image1);
            imageView2=itemView.findViewById(R.id.image2);


        }

        public void setData(int image1, int image2, String textview1, String textview2) {
            textView1.setText(textview1);
            textView2.setText(textview2);
            imageView1.setImageResource(image1);
            imageView2.setImageResource(image2);

        }
    }
}
