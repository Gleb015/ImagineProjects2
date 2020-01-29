package com.example.venesuela.table;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class table4 extends Fragment {
    private TextView txt_table4, txt_table3_2;
    private Button btn_table4;
    public table4() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_table4,

                container, false);
     //  btn_table3 =(Button) view.findViewById(R.id.btn_table3);
       // txt_table3_2 = (TextView) view.findViewById(R.id.txt_table3_2);
        txt_table4 = (TextView) view.findViewById(R.id.txt_table6);
        btn_table4 = (Button) view.findViewById(R.id.btn_table4);
        String b2 = "<span style='background-color: #D8E8F9;'>table</span>";
        String k ="<span style='background-color: #D8E8F9;'>body</span>";
        String w ="<span style='background-color: #D8E8F9;'>td</span>";

        String q ="<span style='background-color: #D8E8F9;'>tr</span>";

        String e ="<span style='background-color: #D8E8F9;'>th</span>";
        String k1 ="Давай поговорим о предыдущем коде. Тег " +b2 +"- это как " + k+" для нашего сайта. " +
                "В этом теге мы должны написать все содержимое таблицы! Элемент "+w+" создает ячейки таблицы, " +
                "внутрь которых помещаются" +
                " какие-либо данные! Строки в таблице создаются благодаря тегу " +q+". Этот тег определяет количество" +
                " горизонтальных рядов в таблице! Элемент "+e+" создает заголовок столбца," +
                " в этой ячейке текст выделяется " +
               "<strong>пошлужирным</strong>! Представь, что тебе нужно заказать на весь класс канцтовары, давай напишем таблицу,\n" +
                " в которой будут показны основные данные (количество, общая стоимость и т. п.) таблицы. Нажми на кнопку ниже, и ты увидишь как будет выглядеть таблица, которую мы сделаем по окончанию этого урока!";
        txt_table4.setText(Html.fromHtml(k1));


        btn_table4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(v, "", Snackbar.LENGTH_LONG)

                        .setAction("Продолжить...",null);
                //android.support.design.
                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();
                btn_table4.setTextColor(Color.WHITE);
                sbView.setBackgroundResource(R.drawable.table2);
                // sbView.setMaximumHeight(30);

                sbView.getLayoutParams().height = 500;
                snackbar.show();
            }
        });






        return view;
    }

}
