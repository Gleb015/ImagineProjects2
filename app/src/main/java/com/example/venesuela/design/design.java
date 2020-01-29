package com.example.venesuela.design;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.ui.main.txt.SectionsPagerAdapter_design;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class design extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        SectionsPagerAdapter_design sectionsPagerAdapter_design = new SectionsPagerAdapter_design(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_design);
        viewPager.setAdapter(sectionsPagerAdapter_design);
        TabLayout tabs = findViewById(R.id.tabs_design);
        tabs.setupWithViewPager(viewPager);
    }
}