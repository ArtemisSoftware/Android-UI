package com.ArtemisSoftware.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ArtemisSoftware.androidui.coollayouts.CompanyLayoutActivity;
import com.ArtemisSoftware.androidui.coollayouts.CoolLayoutsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btn_ctr_lyt)).setOnClickListener(btn_ctr_lyt_OnClickListener);
        ((Button) findViewById(R.id.btn_ctr_lyt_const_sets)).setOnClickListener(btn_ctr_lyt_const_sets_OnClickListener);
        ((Button) findViewById(R.id.btn_col_tool_lyt)).setOnClickListener(btn_col_tool_lyt_OnClickListener);
        ((Button) findViewById(R.id.btn_grid_menu)).setOnClickListener(btn_grid_menu_OnClickListener);
        ((Button) findViewById(R.id.btn_cool_layout)).setOnClickListener(btn_cool_layout_OnClickListener);
    }

    Button.OnClickListener btn_ctr_lyt_OnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent browserIntent = new Intent(getApplicationContext(), PlaceHolderActivity.class);
            startActivity(browserIntent);
        }
    };

    Button.OnClickListener btn_ctr_lyt_const_sets_OnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent browserIntent = new Intent(getApplicationContext(), ConstraintSetsActivity.class);
            startActivity(browserIntent);
        }
    };

    Button.OnClickListener btn_col_tool_lyt_OnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent browserIntent = new Intent(getApplicationContext(), CollapsingToolbarLayoutActivity.class);
            startActivity(browserIntent);
        }
    };


    Button.OnClickListener btn_grid_menu_OnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent browserIntent = new Intent(getApplicationContext(), GridMenuActivity.class);
            startActivity(browserIntent);
        }
    };

    Button.OnClickListener btn_cool_layout_OnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent browserIntent = new Intent(getApplicationContext(), CoolLayoutsActivity.class);
            startActivity(browserIntent);
        }
    };
}
