package com.example.venesuela.link;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class link3 extends Fragment {
private TextView txt_link3, txt_link3_1, txt_prg_link3;
    private Button btn_link3;
    public link3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_link3,

                container, false);
        txt_prg_link3 = (TextView) view.findViewById(R.id.txt_prg_link3);
        txt_link3 = (TextView) view.findViewById(R.id.txt_link3);
        txt_link3_1 = (TextView) view.findViewById(R.id.txt_link3_1);
        btn_link3 = (Button) view.findViewById(R.id.btn_link3);
//
        String k ="<span style='background-color: #D8E8F9;'><a href =</span>";
        String k2 ="<span 'background-color: #D8E8F9;'>\"https://www.yandex.ru\"></span>";
        String k3 ="<span 'background-color: #D8E8F9;'>Яндекс/a></span>";

        String text = "Чтобы сделать ссылку, необходмо использовать тег: " +k+k2+k3 +". А вместо "+k2;
                String text2 = text+ " необходимо использовать адресс страницы, а вместо \"Яндекс\" - любое слово, к которому мы хотим привязать ссылку" +
                ", давай напишем эту ссылку!: ";
     //   txt_link3.setText((text);
        txt_link3.setText(Html.fromHtml(text));
        btn_link3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_link3_1.setVisibility(View.VISIBLE);

            }
        });
        String text3 = "<a href = \"https://www.yandex.ru\">Яндекс</a>";
          txt_link3_1.setText(Html.fromHtml(text3));


        String text4 =   "<html>"
                + "\n" + "<body>" +
                "\n"  + "<a href = \"https://www.yandex.ru\">Яндекс</a>"
                + "\n"+ "</body>" +
                "\n" + "</html>";

        txt_prg_link3.setText(text4);


        return view;
    }

}