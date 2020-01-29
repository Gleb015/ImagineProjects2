package com.example.venesuela.base;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class base5 extends Fragment {

    private TextView textView;
    private Button btn_ans1_base4_2_1, btn_ans1_base4_2_2, btn_ans1_base4_2_3, btn_ans1_base4_2_4;

    public base5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_base5,

                container, false);

        textView = (TextView) view.findViewById(R.id.txt_prg_base4_2);
        btn_ans1_base4_2_1 = (Button) view.findViewById(R.id.btn_ans1_base4_2_1);
        btn_ans1_base4_2_2 = (Button) view.findViewById(R.id.btn_ans1_base4_2_2);
        btn_ans1_base4_2_3 = (Button) view.findViewById(R.id.btn_ans1_base4_2_3);
        btn_ans1_base4_2_4 = (Button) view.findViewById(R.id.btn_ans1_base4_2_4);

        final SpannableStringBuilder text = new SpannableStringBuilder(
                "<body>" + "\n" + "<html>" + "\n" + "Hello World!" + "\n" + "</body>" + "\n" + "</html>");

        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 1, 5, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 8, 12, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 28, 33, 0);

        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 36, 41, 0);
        textView.setText(text);//spannable/text



        btn_ans1_base4_2_1.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {



            v.setBackgroundResource(R.color.colorRedError);
            //   Snackbar.make(v, "Попытайся еще!", Snackbar.LENGTH_LONG)
            //   .setAction("Action", null).show();

            Snackbar snackbar = Snackbar.make(v, "Попытайся еще!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null);
            View sbView = snackbar.getView();
            sbView.setBackgroundResource(R.color.colorRedError);

            snackbar.show();

        }
         });
                    btn_ans1_base4_2_2.setOnClickListener(new OnClickListener() {
                        public void onClick(View v) {
                        v.setBackgroundResource(R.color.colorRedError);
                     //   Snackbar.make(v, "Кажется ты ошибся", Snackbar.LENGTH_LONG)
                        //        .setAction("Action", null).show();

                            Snackbar snackbar = Snackbar.make(v, "Кажется ты ошибся", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null);
                            View sbView = snackbar.getView();
                            sbView.setBackgroundResource(R.color.colorRedError);

                            snackbar.show();

                    }
    });
        btn_ans1_base4_2_3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
               v.setBackgroundResource(R.color.colorGreenTab);

              //  Snackbar.make(v, "Молодец! Продолжай в том же духе", Snackbar.LENGTH_LONG)
              //          .setAction("Action", null).show();

                Snackbar snackbar = Snackbar.make(v, "Молодец! Продолжай в том же духе", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View sbView = snackbar.getView();
                sbView.setBackgroundResource(R.color.colorGreenTab);

                snackbar.show();

            }
        });

        btn_ans1_base4_2_4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                v.setBackgroundResource(R.color.colorRedError);
              //  Snackbar.make(v, "Попробуй еще раз, приглядись", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();


                Snackbar snackbar = Snackbar.make(v, "Попробуй еще раз", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View sbView = snackbar.getView();
                sbView.setBackgroundResource(R.color.colorRedError);

                snackbar.show();

            }
        });

        return view;
    }
}




