package com.example.venesuela.ui.main.txt;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import imagineprojects.R;
import com.example.venesuela.html;
import com.example.venesuela.js;
import com.example.venesuela.styleCss;
import com.example.venesuela.web_editor;

public class SectionsPagerAdapter_editor extends FragmentPagerAdapter {
    private TextView textView17, textView18;
    private EditText resA1;
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter_editor(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                html fragment_html = new html();
                return fragment_html;
            case 1:
                styleCss fragment_style_css = new styleCss();
                return fragment_style_css;
            case 2:
                js fragment_js = new js();
                return fragment_js;
            case 3:
                web_editor fragment_web_editor2 = new web_editor();
                return fragment_web_editor2;

            default:
            return null;

        }

    }


    public int getCount() {
        // Show 5 total pages.
        return 4;

    }

    }




  /*  final SpannableStringBuilder text = new SpannableStringBuilder(
            "<html>" + "\n" + "<body>" + "\n" + "\n" + "</body>" + "\n" + "</html>");

        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 1, 5, 0);
                text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 8, 12, 0);
                // text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 28, 33, 0);
                //        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 36, 41, 0);
                text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 15, 18, 0);
                text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 20, 24, 0);
                textView.setText(text);//spannable/text





                return view;
                }

//View.OnClickListener myButtonClickListener = new View.OnClickListener() {
//      @Override
public void onClick(View v) {

        // textView.setText(null);
        textView.setText("<html>" + "\n" + "<body>" + "\n" + "Hello World!" + "\n" + "</body>" + "\n" + "</html>");


        }


        };


   /* public void onClick(View view){
        Button btn = (Button) view.findViewById(R.id.btn_ans_base4);
        TextView textView = (TextView) view.findViewById(R.id.txt5);
        if (view.getId() != btn.getId()) {
            // textView.setText("<html>" + "\n" + "<body>" + "\n" + "\n" + "</body>" + "\n" + "</html>");
            textView.setText(null);

        }
        //if (v.getId() == btn.getId())
        else{
            // textView.setText(null);
            textView.setText("<html>" + "\n" + "<body>" + "\n" + "Hello World!"+ "\n" + "</body>"
                    + "\n" + "</html>");
        }
    }

    */
   /* public void myClickMethod(View v){
        Button btn = (Button) v.findViewById(R.id.btn_ans_base4);
        TextView textView = (TextView) v.findViewById(R.id.txt5);
        if (v.getId() != btn.getId()) {
            textView.setText("<html>" + "\n" + "<body>" + "\n" + "\n" + "</body>" + "\n" + "</html>");
        }
        //if (v.getId() == btn.getId())
        else{
           // textView.setText(null);
            textView.setText("<html>" + "\n" + "<body>" + "\n" + "Hello World!"+ "\n" + "</body>"
                    + "\n" + "</html>");
        }
    }
    */

 /*public void onClick(View view){


          Button btn = (Button) view.findViewById(R.id.btn_ans_base4);
            if (btn == null) {

                TextView text= (TextView) view.findViewById(R.id.txt5);
                    final SpannableStringBuilder text = new SpannableStringBuilder(
                            "<html>" + "\n" + "<body>" + "\n" + "\n" + "</body>" + "\n" + "</html>");

                    text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 1, 5, 0);
                    text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 8, 12, 0);
                    text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 28, 33, 0);
                           text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 36, 41, 0);
                    text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 15, 18, 0);
                    text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 20, 24, 0);


                   textView.setText( "<html>" + "\n" + "<body>" + "\n" + "\n" + "</body>" + "\n" + "</html>");

                    return view;
                }

                 final SpannableStringBuilder text = new SpannableStringBuilder(
                  "<html>" + "\n" +  "<body>" + "\n" +"Hello World!"+"\n" +"</body>" + "\n"+ "</html>");

          text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 1, 5, 0);
          text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 8, 12, 0);
          text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 28, 33, 0);
          text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 36, 41, 0);
          textView.setText(text);//spannable/text
      }



            }
            */


