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
import com.google.android.material.snackbar.Snackbar;


public class text4 extends Fragment {



    private TextView txt_text4_1, txt_prg_text4, txt_text4_2;
    private Button btn_text4;
    public text4() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text4,

                container, false);

        txt_text4_1 = (TextView) view.findViewById(R.id.txt_text4_1);
        txt_text4_2 = (TextView) view.findViewById(R.id.txt_text4_2);
        txt_prg_text4 = (TextView) view.findViewById(R.id.txt_prg_text4);

        String y2 ="<span style='background-color: #D8E8F9;'>p</span>";

        String text =   "Чтобы текст начинался с новой строки, нужно использовать тeг " + y2 +". Давай используем его:";
        txt_text4_1.setText(Html.fromHtml(text));


        String text2 = "<html>"
                + "\n" + "<body>" +
                "\n" +  "<p><b>Носорог</b> -<i> Яванский носорог</i></p>"+
                "\n" + "<p><b>Носорог</b> - <i> Индийский носорог</i></p>"+
                "\n" + "<p><b>Носорог</b> - <i> Суматранский  " + "\n" +
                "носорог</i>/" + "<p>"
                + "\n" + "</body>" +
                "\n" + "</html>";

        txt_prg_text4.setText(text2);




        btn_text4 = (Button) view.findViewById(R.id.btn_text4);


        btn_text4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_text4_2.setVisibility(View.VISIBLE);
                Snackbar snackbar = Snackbar.make(v, "Супер, теперь наш текст выглядит как надо!", Snackbar.LENGTH_LONG)

                        .setAction("Продолжить...", null);
                //android.support.design.
                View snackbarView = snackbar.getView();
                TextView textView = (TextView) snackbarView.findViewById(R.id.snackbar_text);
                //   textView.setMaxLines(8);  // show multiple line

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();

                sbView.setBackgroundResource(R.color.colorDarkBlue);
                //   sbView.setMinimumHeight(550);

                snackbar.show();
            }
        });

        return view;
    }

}
