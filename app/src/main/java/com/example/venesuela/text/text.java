package com.example.venesuela.text;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.ui.main.txt.SectionsPagerAdapter_txt;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class text extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

       //  SectionsPagerAdapter_txt !!!!!!
        SectionsPagerAdapter_txt sectionsPagerAdapter_txt = new SectionsPagerAdapter_txt(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_text);
        viewPager.setAdapter(sectionsPagerAdapter_txt);
        TabLayout tabs = findViewById(R.id.tabs_text);
        tabs.setupWithViewPager(viewPager);
    }
}