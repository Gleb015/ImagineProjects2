package com.example.venesuela.list;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.ui.main.SectionsPagerAdapter_list;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ProgressBar;
import android.widget.TextView;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        SectionsPagerAdapter_list sectionsPagerAdapter_list = new SectionsPagerAdapter_list(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_lists);
        viewPager.setAdapter(sectionsPagerAdapter_list);
        TabLayout tabs = findViewById(R.id.tabs_list);
        tabs.setupWithViewPager(viewPager);

        TextView textView = findViewById(R.id.panel_lists);
        ProgressBar progressBar = findViewById(R.id.progressBar_lists);
    }
}