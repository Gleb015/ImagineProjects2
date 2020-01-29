package com.example.venesuela.comments;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.comments.ui.main.SectionsPagerAdapter_comments;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


public class comments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
          SectionsPagerAdapter_comments sectionsPagerAdapter_comments = new SectionsPagerAdapter_comments(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_comments);
        viewPager.setAdapter(sectionsPagerAdapter_comments);
        TabLayout tabs = findViewById(R.id.tabs_comments);
        tabs.setupWithViewPager(viewPager);


    }
}