package com.example.venesuela.images;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.ui.main.SectionsPagerAdapter2;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;




public class Images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);


        SectionsPagerAdapter2 sectionsPagerAdapter2 = new SectionsPagerAdapter2(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager2);
        viewPager.setAdapter(sectionsPagerAdapter2);
        TabLayout tabs = findViewById(R.id.tabs2);
        tabs.setupWithViewPager(viewPager);

    }
}