package com.ArtemisSoftware.androidui.coollayouts.adapters;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ArtemisSoftware.androidui.R;

import java.util.ArrayList;
import java.util.List;

public class ParallaxViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    private final List<Integer> mFragmentIconList = new ArrayList<>();

    public ParallaxViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFrag(Fragment fragment, String title, int icon) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
        mFragmentIconList.add(icon);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }




    public View getTabView(int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.parallax_tab, null);

        TextView tabTextView = view.findViewById(R.id.tabTextView);
        tabTextView.setText(mFragmentTitleList.get(position));

        ImageView tabImageView = view.findViewById(R.id.tabImageView);
        tabImageView.setImageResource(mFragmentIconList.get(position));
        return view;
    }

    public View getSelectedTabView(int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.parallax_tab, null);

        TextView tabTextView = view.findViewById(R.id.tabTextView);
        tabTextView.setText(mFragmentTitleList.get(position));
        tabTextView.setTextColor(ContextCompat.getColor(context, R.color.yellow));

        ImageView tabImageView = view.findViewById(R.id.tabImageView);
        tabImageView.setImageResource(mFragmentIconList.get(position));
        tabImageView.setColorFilter(ContextCompat.getColor(context, R.color.yellow), PorterDuff.Mode.SRC_ATOP);
        return view;
    }

}