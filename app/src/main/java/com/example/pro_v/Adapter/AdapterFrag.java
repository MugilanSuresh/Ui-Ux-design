package com.example.pro_v.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pro_v.BookFrag1;
import com.example.pro_v.HomeFrag1;
import com.example.pro_v.NextFrag;
import com.example.pro_v.ProfileFrag1;
import com.example.pro_v.R;
import com.example.pro_v.ShopFrag1;

public class AdapterFrag extends FragmentPagerAdapter {
    private Context context;

    public AdapterFrag(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFrag1();
            case 1:
                return new BookFrag1();
            case 2:
                return new ShopFrag1();
            case 3:
                return new ProfileFrag1();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

}





























//package com.example.pro_v.Adapter;

//
//import android.content.Context;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentPagerAdapter;
//
//import com.example.pro_v.Activity.BookingFragment;
//import com.example.pro_v.Activity.HomeFragment;
//import com.example.pro_v.Activity.Homepage;
//import com.example.pro_v.Activity.ProfileFragment;
//import com.example.pro_v.Activity.ShopFragment;
//
//public class AdapterFrag extends FragmentPagerAdapter {
//
//    private Context context;
//    int totalTabs;
//
//    public AdapterFrag(@NonNull FragmentManager fm, Context context, int totalTabs) {
//        super(fm);
//        this.context = context;
//        this.totalTabs = totalTabs;
//    }
//    @Override
//    public int getCount() {
//        return totalTabs;
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        switch (position) {
//            case 0:
//                HomeFragment fragment1 = new HomeFragment();
//                return fragment1;
//            case 1:
//                BookingFragment fragment2 = new BookingFragment();
//                return fragment2;
//            case 2:
//                ShopFragment fragment3 = new ShopFragment();
//                return fragment3;
//            case 3:
//                ProfileFragment fragment4 = new ProfileFragment();
//                return fragment4;
//            default:
//                return null;
//        }
//
//
//    }
//}
