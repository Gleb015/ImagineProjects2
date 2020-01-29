package com.example.venesuela.link;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.ui.main.SectionsPagerAdapter_links;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class links extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        SectionsPagerAdapter_links sectionsPagerAdapter_links = new SectionsPagerAdapter_links(this, getSupportFragmentManager());
     ViewPager viewPager = findViewById(R.id.view_pager_links);
     viewPager.setAdapter(sectionsPagerAdapter_links);
        TabLayout tabs = findViewById(R.id.tabs_links);
        tabs.setupWithViewPager(viewPager);
    }
}