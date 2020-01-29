package com.example.venesuela.text;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import imagineprojects.R;


public class text7 extends Fragment {
private TextView txt_text7_1, txt_prg_text7,txt_text7_2;
private Button btn_text7;
    public text7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text7,

                container, false);

        txt_text7_1 = (TextView) view.findViewById(R.id.txt_text7_1);
        txt_text7_2= (TextView) view.findViewById(R.id.txt_text7_2);
        txt_prg_text7 = (TextView) view.findViewById(R.id.txt_prg_text7);
        String a1 ="<span style='background-color: #D8E8F9;'>b</span>";
        String a2 ="<span style='background-color: #D8E8F9;'>i</span>";
        String a3 ="<span style='background-color: #D8E8F9;'>u</span>";
        String text1 =     "Мы рассмотрели 2 способа выделение текста: с помощью тега " + a1+ " и с тега " +a2+
                ". Сейчас мы рассмотрим новый тег: "+a3+". Этот тег подчеркивает символы, находящиеся в нем!" ;
        txt_text7_1.setText(Html.fromHtml(text1));


        String prg_text = "<html>"
                + "\n" + "<body>" +
                "\n" + "<u>Тег u подчеркивает слова!</u>" +
                "\n" + "</body>" +
                "\n" + "</html>";

        txt_prg_text7.setText(prg_text);
        btn_text7 = (Button) view.findViewById(R.id.btn_text7);


        btn_text7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_text7_2.setVisibility(View.VISIBLE);
            }
            });



        return view;

    }

}