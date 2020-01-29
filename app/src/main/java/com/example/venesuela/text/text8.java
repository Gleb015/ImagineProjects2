package com.example.venesuela.text;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import imagineprojects.R;


public class text8 extends Fragment {

    private TextView txt_text8_1, txt_prg_text8, txt_text8_2;
  private Button btn_text8;

    public text8() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text8,

                container, false);

        txt_text8_1 = (TextView) view.findViewById(R.id.txt_text8_1);
        txt_prg_text8 = (TextView) view.findViewById(R.id.txt_prg_text8);
        txt_text8_2= (TextView) view.findViewById(R.id.txt_text8_2);
       // String a1 ="<font color='#234234'>Хочешь</font>";
        String a2 ="<span style='background-color: #D8E8F9;'>font</span>";
        String a1 ="<span 'background-color: #D8E8F9;'> color=</span> ";
        String a3 ="<span 'background-color: #D8E8F9;'>'#000000'>/font</span>";
        String a4 ="'#FFD700'>Золото</font>";
     //   String a4 ="<font color='#234234'> цвет</font>";
      //  String a5 ="<font color='#234234'> текста?</font>";
        String text1 = "Для того, чтобы изменить цвет текста, необходимо прописать тег: "+a2+a1+"и зкарыть его этим тегом:"+a3+". А вместо шести нулей, " +
                "необходимо прописать цвет (#000000 - черный цвет)";
        txt_text8_1.setText(Html.fromHtml(text1));
String text2 ="<html>"
        + "\n" + "<body>" +
        "\n" + a2+a4 +
        "\n" + "</body>" +
        "\n" + "</html>";

        txt_prg_text8.setText(text2);

        btn_text8 = (Button) view.findViewById(R.id.btn_text8);


        btn_text8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_text8_2.setVisibility(View.VISIBLE);
                txt_text8_2.setTextColor(Color.rgb(255, 215, 0));
               txt_text8_2.setText("Золото");
            }
        });

        return view;
    }
}
