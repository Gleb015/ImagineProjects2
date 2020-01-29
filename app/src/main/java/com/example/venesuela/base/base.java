package com.example.venesuela.base;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.venesuela.ui.main.SectionsPagerAdapter;

import imagineprojects.R;

public class base extends AppCompatActivity {

private ProgressBar progressBar;
    private Button btn;
    private TextView txt, panel_base;
  private int progress = 0;
    private int position = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
       TabLayout tabs = findViewById(R.id.tabs);
       tabs.setupWithViewPager(viewPager);

        TextView textView = findViewById(R.id.panel_base);
        ProgressBar progressBar = findViewById(R.id.progressBar);


      /*  progressBar.setOnClickListener(new View.OnClickListener() {
         @Override
   public void onClick(View view){
             progress = progress + 10;
             postProgress(progress);


        }
    });


       */

     /*   viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
           public void onPageScrollStateChanged(int arg0) {

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageSelected(int pos) {
                //This is because progress is 0 at the start of the program
                progress++;
                ProgressBar progress = (ProgressBar) findViewById(R.id.progressBar);
                progress.setProgress(position++);
              //  progressBar.setForeground(Color.YELLOW);
            }

        });

      */
    }
}

      /*  FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }

        });
        */
  /*    FloatingActionButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
               // this.activityCode = activityCode;
                switch (v.getId()) {
                    case 0:
                        base1 fragment_base1 = new base1();
                        Intent intent = new Intent((base.this),base1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        base2 fragment_base2 = new base2();
                        break;
                    default:
                        break;
                }
            }
        });

   */



/* public void onClick(View view) {

        textView.setText(null);

        final SpannableStringBuilder text = new SpannableStringBuilder(
                "<html>" + "\n" + "<body>" + "\n" + "Hello World!" + "\n" + "</body>" + "\n" + "</html>");

        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 1, 5, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 8, 12, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 28, 33, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 36, 41, 0);
        textView.setText(text);
    }

    */
 /*   public static void main(String[] args) {
        String s="";
        Scanner in = new Scanner(new File("файлстекстом.txt"));

        String regex = "(круто|класс|Круто|Класс)";
        Pattern p = Pattern.compile(regex);


        while(in.hasNext())
        {s += in.nextLine() ;}

        StringTokenizer token = new StringTokenizer(s,".");
        while (token.hasMoreTokens())
        {
            String st=token.nextToken();
            st.trim();
            Matcher m = p.matcher(st);
            if (m.find()) System.out.println(st);
        }
    }
    }
  */

