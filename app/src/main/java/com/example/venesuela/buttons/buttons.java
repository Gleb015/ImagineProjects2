package com.example.venesuela.buttons;

import android.os.Bundle;

import com.example.venesuela.ui.main.txt.SectionsPagerAdapter_buttons;
import com.google.android.material.tabs.TabLayout;


import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import imagineprojects.R;

public class buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        SectionsPagerAdapter_buttons sectionsPagerAdapter_buttons = new SectionsPagerAdapter_buttons(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_buttons);
        viewPager.setAdapter(sectionsPagerAdapter_buttons);
        TabLayout tabs = findViewById(R.id.tabs_buttons);
        tabs.setupWithViewPager(viewPager);

    }
}