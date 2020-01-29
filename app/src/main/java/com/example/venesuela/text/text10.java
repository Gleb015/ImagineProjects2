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


public class text10 extends Fragment {
    private TextView txt_prg_text10, txt_text10_1;
    private Button btn_text10;

    public text10() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text10,

                container, false);

        txt_text10_1 = (TextView) view.findViewById(R.id.txt_text10_1);
        txt_prg_text10 = (TextView) view.findViewById(R.id.txt_prg_text10);




        String a1 =    "<b style='background-color: #ff0000; color: #FFFFFFF'>Ро</b>";
        String a2 =    "<b style='background-color: #0000ff; color: #FFFFFFF'>сс</b>";
        String a3 =    "<b style='background-color: #ffffff; color: #000000'>ия</b>";



        String text1 = "!DOCTYPE"+"\n"+
                "<html>"
                + "\n" + "<body>" +
                "\n" +a1+a2+a3
              + "\n"+ "</body>" +
                "\n" + "</html>";

        txt_prg_text10.setText(text1);
        String b1 =    "<span style='background-color: #ff0000; color: #FFFFFFF'>Ро</span>";
        String b2 =    "<span style='background-color: #0000ff; color: #FFFFFFF'>сс</span>";
        String b3 =    "<span style='background-color: #ffffff; color: #000000'>ия</span>";

        String text2 = b1+b2+b3;
        txt_text10_1.setText(Html.fromHtml(text2));




    /*    btn_text10 = (Button) view.findViewById(R.id.btn_text10);


        btn_text10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_text10_1.setVisibility(View.VISIBLE);
                txt_text10_1.setTextColor(Color.rgb(255, 215, 0));
            }
        });

*/
        return view;
    }
}