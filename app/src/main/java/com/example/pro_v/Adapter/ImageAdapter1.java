package com.example.pro_v.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.pro_v.Activity.HomeFragment;
import com.example.pro_v.R;

public class ImageAdapter1 extends PagerAdapter {
    Context Context;

    public ImageAdapter1(FragmentActivity context){this.Context= context;}

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ImageView) object);
    }
    public int[] sliderImageId = new int[]{
            R.drawable.banner2,R.drawable.banner1,R.drawable.banner3
    };

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(Context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
    @Override
    public int getCount() {
        return sliderImageId.length;
    }
}


