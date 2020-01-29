package com.example.venesuela.table;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import imagineprojects.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class table3 extends Fragment {
private TextView txt_table3_1;
private ImageButton txt_table3_2;
    private Button btn_table3;
    public table3() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_table3,

                container, false);
       btn_table3 =(Button) view.findViewById(R.id.btn_table3);
        txt_table3_2 = (ImageButton) view.findViewById(R.id.txt_table3_2);
        txt_table3_1 = (TextView) view.findViewById(R.id.txt_table3_1);
       String k = "<!DOCTYPE>" +"\n"
               +"<html>"+"\n" +
               "<body>" +"\n"
               +"<table>"+"\n"
               +"<tr><th>Заголовок 1</th><th>Заголовок 2</th></tr>"+"\n"
               +"<tr><td>текст 1</td><td>текст 2</td></tr>"+"\n"
               +"</table>"+"\n"
               +"</body>"+"\n"
               + "</html>";

        txt_table3_1.setText(k);

        String k1 ="<table>"+"\n"
                +"<tr><th>Заголовок 1</th><th>Заголовок 2</th></tr>"+"\n"
                +"<tr><td>текст 1</td><td>текст 2</td></tr>"+"\n"
                +"</table>"+"\n";
      // txt_table3_2.setText(Html.fromHtml(k1));
        btn_table3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                txt_table3_2.setVisibility(View.VISIBLE);
            }
        });


        return view;
    }

}

