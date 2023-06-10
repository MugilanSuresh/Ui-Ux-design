package com.example.pro_v.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pro_v.Activity.CategoryList;
import com.example.pro_v.Object.Model2;
import com.example.pro_v.R;

import java.util.List;
import java.util.Locale;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {
    private Context context;
    private List<Model2> view1;
    CategoryList categoryList;

    public Adapter2(Context context, List<Model2> view1, CategoryList categoryList) {
        this.context = context;
        this.view1=view1;
        this.categoryList=categoryList;
    }

    @NonNull
    @Override
    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list5,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        String text1 =view1.get(position).getTextviewfan();
        String text2 =view1.get(position).getAmount();
        String text3 =view1.get(position).getAdd();
        int img1 =view1.get(position).getImageview();
        int img2 =view1.get(position).getAddbutton();

        holder.setdata(text1,text2,text3,img1,img2);
        holder.imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pos = holder.getAdapterPosition();
                holder.textView3.setText(view1.get(pos).getAdd());
                holder.imageView2.setImageResource(view1.get(pos).getAddbutton());
//                System.out.println(pos);
                int isvisibility = holder.linearLayout1.getVisibility();
                if (isvisibility==View.VISIBLE){
                    holder.linearLayout1.setVisibility(View.GONE);
                    holder.linearLayout2.setVisibility(View.VISIBLE);
                    categoryList.calculate(1);
                    categoryList.calculate(2);


                }
            }
        });
        holder.plusbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text4 =holder.textView4.getText().toString();
                int pos = holder.getAdapterPosition();
                holder.textView4.setText(view1.get(pos).getAmt());
                System.out.println("value "+text4);
                int value = Integer.parseInt(text4);
                value++;
                holder.textView4.setText(String.valueOf(value));
                categoryList.calculate(2);
            }
        });
        holder.minusbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text4 =holder.textView4.getText().toString();
                int pos = holder.getAdapterPosition();
                holder.textView4.setText(view1.get(pos).getAmt());
                int value = Integer.parseInt(text4);
                if(value>=2){
                    value--;
                    holder.linearLayout1.setVisibility(View.GONE);
                    holder.linearLayout2.setVisibility(View.VISIBLE);
                    categoryList.calculate(0);
                }
                else {
                    holder.linearLayout1.setVisibility(View.VISIBLE);
                    holder.linearLayout2.setVisibility(View.GONE);
                }
                holder.textView4.setText(String.valueOf(value));
                categoryList.calculate(3);



            }
        });
    }
    @Override
    public int getItemCount() {
        return view1.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        private ImageView imageView1;
        private ImageView imageView2;
        private TextView textView4;
        private ImageView plusbut;
        private ImageView minusbut;
        private LinearLayout linearLayout1,linearLayout2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout1=itemView.findViewById(R.id.linearlayout1);
            linearLayout2=itemView.findViewById(R.id.linearlayout2);
            textView1=itemView.findViewById(R.id.textviewfan);
            textView2=itemView.findViewById(R.id.amount);
            imageView1=itemView.findViewById(R.id.imageview);
            textView3=itemView.findViewById(R.id.add);
            imageView2=itemView.findViewById(R.id.addbutton);
            textView4=itemView.findViewById(R.id.amt);
            plusbut=itemView.findViewById(R.id.plusbutton);
            minusbut=itemView.findViewById(R.id.minusbutton);
        }

        public void setdata(String text1, String text2, String text3, int img1, int img2) {
            textView1.setText(text1);
            textView2.setText(text2);
            textView3.setText(text3);
//            textView4.setText(text4);
            imageView1.setImageResource(img1);
            imageView2.setImageResource(img2);
        }
    }
}































































//    Context context;
//    private List<Model2> view1;
//
//    public Adapter2(Context context,List<Model2> view1){
//        this.view1 = view1;
//        this.context = context;
//    }
//
//    public Adapter2(List<Model2> view1) {
//    }
//
//    @NonNull
//    @Override
//    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list5, parent, false);
//        return new Adapter2.ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull Adapter2.ViewHolder holder, int position) {
//        int image1=view1.get(position).getImageview();
//        int addbutton=view1.get(position).getAddbutton();
//        int minusbutton=view1.get(position).getMinusbutton();
//        int plusbutton=view1.get(position).getPlusbutton();
//
//        String text1=view1.get(position).getTextviewfan();
//        String text2=view1.get(position).getAmount();
//        String text3=view1.get(position).getAdd();
//        String text4=view1.get(position).getAmt();
//
//        holder.setData(image1,addbutton,minusbutton,plusbutton,text1,text2,text3,text4);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return view1.size();
//    }
//    public static class ViewHolder extends RecyclerView.ViewHolder{
//
//        private TextView textView1,textView2,textView3,textView4;
//        private ImageView imageView1,imageView2,imageView3,imageView4;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            textView1=itemView.findViewById(R.id.textviewfan);
//            textView2=itemView.findViewById(R.id.amount);
//            textView3=itemView.findViewById(R.id.add);
//            textView4=itemView.findViewById(R.id.amt);
//
//            imageView1=itemView.findViewById(R.id.imageview);
//            imageView2=itemView.findViewById(R.id.addbutton);
//            imageView3=itemView.findViewById(R.id.minusbutton);
//            imageView4=itemView.findViewById(R.id.plusbutton);
//        }
//
//        public void setData(int image1, int addbutton, int minusbutton, int plusbutton, String text1, String text2, String text3, String text4) {
//            textView1.setText(text1);
//            textView2.setText(text2);
//            textView3.setText(text3);
//            textView4.setText(text4);
//
//            imageView1.setImageResource(image1);
//            imageView2.setImageResource(addbutton);
//            imageView3.setImageResource(minusbutton);
//            imageView4.setImageResource(plusbutton);
//        }
//    }
//}



























   