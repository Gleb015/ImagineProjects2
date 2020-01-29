package com.example.venesuela.table;

import android.os.Bundle;

import imagineprojects.R;
import com.example.venesuela.ui.main.SectionsPagerAdapter_tables;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class tables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);


        SectionsPagerAdapter_tables sectionsPagerAdapter_tables = new SectionsPagerAdapter_tables(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_tables);
        viewPager.setAdapter(sectionsPagerAdapter_tables);
        TabLayout tab = findViewById(R.id.tab_tables);
        tab.setupWithViewPager(viewPager);

        //FloatingActionButton fab = findViewById(R.id.fab);

     /*   fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

      */
    }
}