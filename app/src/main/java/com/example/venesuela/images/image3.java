package com.example.venesuela.images;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import imagineprojects.R;


public class image3 extends Fragment {

    // TODO: Rename and change types of parameters
    private TextView txt_img3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image3,
                container, false);
        txt_img3= (TextView) view.findViewById(R.id.txt_img3);

// покажи этот код, тип фичу хотел добавить, добавил, не получилось, начал исправлять  в 1,исправил все :)
        String b2 = "<span style='background-color: #D8E8F9;'>body</span>";
        String k ="<span style='background-color: #D8E8F9;'><img</span>";
        // "<span style='background-color: #D8E8F9;'>src= </span>";
        String k2 = "<span 'background-color:#D8E8F9;'>src= </span>";
        String k3 = "<span style='background-color: #D8E8F9;'>\"lamborghini.jpg\"></span>";
        String y2 ="<span style='background-color: #D8E8F9;'>lamborghini.jpg</span>";

        String text ="Мы пишем в теге "+ b2 +". Там мы пишем " + k+""+k2+""+k3+"" +", а вместо "+ y2+"" + "- путь к картинке и ее имя." ;
        txt_img3.setText(Html.fromHtml(text));
        return view;

    }

}
