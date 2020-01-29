package com.example.venesuela.images;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class image4 extends Fragment {
    RelativeLayout rl;
private TextView txt_prg_img4;
private Button btn_img4;
    public image4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image4,
                container, false);
       // rl = (RelativeLayout) view.findViewById(R.id.svRL);
        txt_prg_img4= (TextView) view.findViewById(R.id.txt_prg_img4);
        btn_img4= (Button) view.findViewById(R.id.btn_img4);
// покажи этот код, тип фичу хотел добавить, добавил, не получилось, начал исправлять  в 1,исправил все :)
        String text = "<html>"
                + "\n" + "<body>" +
                "\n"
                + "\n" + "</body>" +
                "\n" + "</html>";


        txt_prg_img4.setText(text);

        btn_img4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {




                        Snackbar snackbar = Snackbar.make(v, "", Snackbar.LENGTH_LONG)

                                .setAction("Продолжить...",null);
                        //android.support.design.
                        snackbar.setActionTextColor(Color.CYAN);
                        View sbView = snackbar.getView();

                        sbView.setBackgroundResource(R.drawable.lamborghini_yellow);
                       // sbView.setMaximumHeight(30);

                sbView.getLayoutParams().height = 600;
                        snackbar.show();

                String text = "<html>"
                        + "\n" + "<body>" +
                        "\n" + "<img src=\"lamborghini.jpg\">"
                        + "\n" + "</body>" +
                        "\n" + "</html>";


                txt_prg_img4.setText(text);


            }
        });
        return view;
    }

}
