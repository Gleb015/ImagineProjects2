package com.example.venesuela.comments;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class comment2 extends Fragment {


    public comment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comment2,
                container, false);
        TextView txt_comment2 = (TextView) view.findViewById(R.id.txt_comment2);
        TextView txt_prg_comment2_1 = (TextView) view.findViewById(R.id.txt_prg_comment2_1);
        TextView txt_prg_comment2_2 = (TextView) view.findViewById(R.id.txt_prg_comment2_2);
        Button btn_comment2 = (Button) view.findViewById(R.id.btn_comment2);
     final   EditText editText_comment2 = (EditText) view.findViewById(R.id.editText_comment2);


        /*String q1 = "<span style='background-color: #D8E8F9;'><!--</span>";
        String q2 = "<span style='background-color: #D8E8F9;'>--></span>";
        */

        String q1 = "<!--";
        String q2 = "-->";
        String q = "Чтобы написать комментарий, необходимо использовать следующий символы: <!--. " +
                "В этом символе мы должны написать комментарий, после того как мы написали комментарий, необходимо закрыть его этими " +
                "символами: -->. Напиши ниже любой комментарий.";
        //txt_comment2.setText((q));

        String e1="<!DOCTYPE>"+"\n"+"<html>"+"\n"+"<body>";
        String e2="</body>"+"\n"+"</html>";
        txt_prg_comment2_1.setText(e1);
        txt_prg_comment2_2.setText(e2);



        //   colorLightBlue
        //#D8E8F9
    /*SpannableString text = new SpannableString(q);
        text.setSpan(new BackgroundColorSpan(getResources().getColor(R.color.colorLightBlue)), 71, 75, 0);
        text.setSpan(new BackgroundColorSpan(getResources().getColor(R.color.colorLightBlue)), 204, 207, 0);




        txt_comment2.setText(q, TextView.BufferType.SPANNABLE);

     */

        SpannableString spannableString = new SpannableString(q);

        BackgroundColorSpan backgroundSpan = new BackgroundColorSpan(getResources().getColor(R.color.colorLightBlue));
     //   BackgroundColorSpan backgroundSpan = new BackgroundColorSpan(Color.YELLOW);
        spannableString.setSpan(backgroundSpan, 71, 75, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(backgroundSpan, 204, 207, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
       // spannableString.setSpan(backgroundSpan, 3, spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
       // txt_comment2.setText(spannableString);
        txt_comment2.setText(spannableString, TextView.BufferType.SPANNABLE);

        SpannableString text = new SpannableString(q);
        text.setSpan(new BackgroundColorSpan((getResources().getColor(R.color.colorLightBlue))), 71, 75, 0);
        text.setSpan(new BackgroundColorSpan((getResources().getColor(R.color.colorLightBlue))), 204, 207, 0);

        txt_comment2.setText(text, TextView.BufferType.SPANNABLE);



        btn_comment2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                int c = Integer.parseInt(editText_comment2.getText().toString());

                if ((editText_comment2.getText().toString().equals("<!-- ")
            &    (editText_comment2.getText().toString().equals(c)
                &(editText_comment2.getText().toString().equals("-->")))) ) {

                    Snackbar snackbar = Snackbar.make(v, "Замечательно!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                } else {
                    Snackbar snackbar = Snackbar.make(v, "Попробуй еще раз", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorRedError);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                }
            }
        });


        return view;
    }

}
