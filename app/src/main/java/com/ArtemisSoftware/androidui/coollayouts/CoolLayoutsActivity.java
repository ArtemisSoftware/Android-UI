package com.ArtemisSoftware.androidui.coollayouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ArtemisSoftware.androidui.R;

import net.wujingchao.android.view.MultiCardMenu;

public class CoolLayoutsActivity extends AppCompatActivity implements View.OnClickListener {

    MultiCardMenu mc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_layouts);

        initView();
    }


    private void initView() {

        mc = (MultiCardMenu) findViewById(R.id.multi_card_menu);

        mc.setOnDisplayOrHideListener(new MultiCardMenu.OnDisplayOrHideListener() {
            @Override
            public void onDisplay(int which) {
                //Log.d(TAG,"onDisplay:" + which);
            }

            @Override
            public void onHide(int which) {
                mc.hide(mc.getDisplayingCard());
            }

            @Override
            public void onTouchCard(int which) {
                //Log.d(TAG,"onTouchCard:" + which);
                mc.show(which);
            }
        });


        ((ImageView)  findViewById(R.id.img1)).setOnClickListener(this);
        ((ImageView)  findViewById(R.id.img2)).setOnClickListener(this);


//        int [] imgRes = {R.drawable.ent,R.drawable.qa};
        final int [] imgRes = {R.drawable.camerabutton,R.drawable.favoritebutton,R.drawable.ic_launcher};

        final ViewPager mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setOffscreenPageLimit(imgRes.length);

        mViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return imgRes.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                mViewPager.removeView((View) object);
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(imgRes[position]);
                container.addView(imageView);
                container.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                return imageView;
            }
        });



    }

    @Override
    public void onClick(View v) {


        Intent browserIntent;

        switch (v.getId()){

            case R.id.img1:

                browserIntent = new Intent(getApplicationContext(), CompanyLayoutActivity.class);
                startActivity(browserIntent);
                break;


            case R.id.img2:

                browserIntent = new Intent(getApplicationContext(), CompanyLayoutActivity.class);
                startActivity(browserIntent);
                break;

            default:
                break;

        }


    }
}
