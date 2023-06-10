package com.example.pro_v.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pro_v.Object.Model1;
import com.example.pro_v.Object.ModelService;
import com.example.pro_v.R;
import com.example.pro_v.Activity.SubActitvity;

import java.util.List;

public class AdapterService extends RecyclerView.Adapter<AdapterService.ViewHolder> {
    Context context;
    TextView text;
    private List<ModelService> viewList3;
    public AdapterService( Context context,List<ModelService> viewList3) {
        this.viewList3 = viewList3;
        this.context = context;

    }

    public AdapterService(List<Model1> viewList4) {
    }

    @NonNull
    @Override
    public AdapterService.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list3,parent,false);
        return new ViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        int image_1 =viewList3.get(position).getImage_1();
        String text_1 = viewList3.get(position).getText_1();




        holder.setData(image_1,text_1);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, SubActitvity.class);
                intent.putExtra("key",text_1.toString());
                intent.putExtra("key1",viewList3.get(position).getImage_1());
                context.startActivity(intent);

                int pos = holder.getAdapterPosition();
                holder.Text_1.setText(viewList3.get(pos).getText_1());
                holder.Image_1.setImageResource(viewList3.get(pos).getImage_1());
//                System.out.println(pos);
            }
        });
    }
    @Override
    public int getItemCount() {

        return viewList3.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView Text_1;
        private ImageView Image_1;
        private LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.l2);

            Text_1=itemView.findViewById(R.id.text_1);
            Image_1=itemView.findViewById(R.id.image_1);
        }
        public void setData(int image_1, String text_1) {

            Text_1.setText(text_1);
            Image_1.setImageResource(image_1);
        }
    }
}
