package com.example.venesuela.css;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class css4 extends Fragment {


    public css4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_css4,
                container, false);
        TextView txt_css4 = (TextView) view.findViewById(R.id.txt_css4);

        String k1 = "<span style='background-color: #D8E8F9;'>body</span>";
        String k2 = "<span style='background-color: #D8E8F9;'><body background=\"\"></span>";

        String k3 = "<span style='background-color: #D8E8F9;'>d</span>";
        String k3s = "<span style='background-color: #D8E8F9;'>iv </span>";
        String k3a= "<span style='background-color: #D8E8F9;'>cla</span>";
        String k3_1_1 = "<span style='background-color: #D8E8F9;'>ss=\"id\"></span>";

        String k3_1 = "<span 'background-color: #D8E8F9;'>/d</span>";
        String k3_1_2= "<span ='background-color: #D8E8F9;'>iv></span>";

        String k4 = "<span style='background-color: #D8E8F9;'>color:#FFFFFF;</span>";
        String k5 = "<span style='background-color: #D8E8F9;'>background-color:</span>";
        String k6 = "<span style='background-color: #D8E8F9;'>border: 1px solid black</span>";


        String k7 = "<span style='background-color: #D8E8F9;'>margin-left: 20%;</span>";

        String k8 = "<span style='background-color: #D8E8F9;'>padding: 35px;</span>";

        String k9 = "<span style='background-color: #D8E8F9;'>margin-right: 20%;</span>";

        String k10 = "<span style='background-color: #D8E8F9;'>:</span>";
        String k11 = "<span style='background-color: #D8E8F9;'>;</span>";
        String k="Давай выровним всю информацию по центру, а слева и справа будет картинка! Для этого, вместо тега "
                +k1+" следует объявить этот тег " +k2+" (нужно указать путь к картинке!). " +
                "Давай добавим парный тег (в html) "+ k3+k3s+k3a+k3_1_1+", который следует зыкрыть  тегом  "
                +k3_1+k3_1_2+". Давай обратимся к классу css, для этого, в нашем классе пропиши следующие теги: "
                +"\n"+k4
                +"\n"+k5
                +"\n"+k6
                +"\n"+k7
                +"\n"+k8
                +"\n"+k9
                +"\n"+"Обрати вниманние, что после объявления какого-либо свойства, " +
                "ставится " +k10+", а после того, как мы закончили писать строку, " +
                "то нужно добавить "+k11+". Давай поговорим о каждом свойстве:"
                +  "\n"+ "Свойство "+k4+" определяет цвет текста"   +  "\n"
                +  "\n"+ "Свойство "+k5+" определяет цвет фона"  +  "\n"
                +  "\n"+ "Свойство "+k6+" определяет цвет и стиль полоски"  +  "\n"
                +  "\n"+ "Свойство "+k7+" определяет отступ слева"  +  "\n"
                +  "\n"+ "Свойство "+k8+" определяет поля вокруг текста(расстояние от крайней левой точки, " +
                "до инфомации (например: текста, картинок)"  +  "\n"
                +  "\n"+ "Свойство "+k9+" определяет отступ справа";
        txt_css4.setText(Html.fromHtml(k));
        return view;
    }
    }


