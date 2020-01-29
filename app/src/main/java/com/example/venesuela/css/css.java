package com.example.venesuela.css;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.ui.main.SectionsPagerAdapter_css;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class css extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css);

        SectionsPagerAdapter_css sectionsPagerAdapter_css = new SectionsPagerAdapter_css(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_css);
        viewPager.setAdapter(sectionsPagerAdapter_css);
        TabLayout tabs = findViewById(R.id.tabs_css);
        tabs.setupWithViewPager(viewPager);
    }
}