package com.ArtemisSoftware.androidui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class CompanyLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_layout);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.devslopesprofilelogo);
        RoundedBitmapDrawable rounded = RoundedBitmapDrawableFactory.create(getResources(), bitmap);

        rounded.setCornerRadius(15f);
        ImageView logo = findViewById(R.id.logo);

        logo.setImageDrawable(rounded);
    }
}
