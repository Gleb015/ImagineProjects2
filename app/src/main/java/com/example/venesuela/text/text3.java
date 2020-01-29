package com.example.venesuela.text;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;


public class text3 extends Fragment {

    private TextView txt_prg_text3, txt_text3_2;
    private Button btn_text3;
    public text3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text3,

                container, false);
        txt_prg_text3 = (TextView) view.findViewById(R.id.txt_prg_text3);
        btn_text3 = (Button) view.findViewById(R.id.btn_text10);
        txt_text3_2 = (TextView) view.findViewById(R.id.   txt_text3_2);

        String text3 = "<html>"
                + "\n" + "<body>" +
                "\n" +  "<b>Носорог</b> -<i> Яванский носорог</i>"+
                "\n" + "<b>Носорог</b> - <i> Индийский носорог</i>"+
                "\n" + "<b>Носорог</b> - <i> Суматранский  носорог</i>"
                + "\n" + "</body>" +
                "\n" + "</html>";
        txt_prg_text3.setText(text3);


        btn_text3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_text3_2.setVisibility(View.VISIBLE);
                Snackbar snackbar = Snackbar.make(v, "Хмм, выглядит не очень, давай исправим это!", Snackbar.LENGTH_LONG)

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

