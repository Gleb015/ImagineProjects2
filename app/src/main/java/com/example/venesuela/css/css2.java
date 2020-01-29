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
public class css2 extends Fragment {


    public css2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_css2,
                container, false);

        TextView a =(TextView) view.findViewById(R.id.txt_css2);

        String e1 = "<span style='background-color: #D8E8F9;'><p class=\"your_id\"></span>";
        String e2 = "<span style='background-color: #D8E8F9;'>*.css</span>";
        String e3 = "<span style='background-color: #D8E8F9;'>body</span>";
        String e4 = "<span style='background-color: #D8E8F9;'>div</span>";
        String e5 = "<span style='background-color: #D8E8F9;'>link href=\"style.css\" </span>";
        String e5_1 ="rel=\"stylesheet\" type=\"text/css\"";
        String e6 = "<span style='background-color: #D8E8F9;'>.</span>";
        String e7 = "<span style='background-color: #D8E8F9;'>{}</span>";
        String e = "Для начала стоит объявить новый тег "+e5 +
                //"для этого, используй тег "
               // +e1 +" (выбери любое id). " +
                "После того, как ты напишешь этот тег в html," +
                " то переходи к " +
                "созданию файла " +e2 +". Теперь настало время выровнить всю информацию " +
                "сайта по центру! Для этого после тега " +
                "" +e3+ " Объяви парный тег " +e4+". Внутри этого тега пропиши следующее " + e5 +e5_1+". " +
                "Теперь необходимо поработать с самим CSS, для этого необходимо перейти в файл " +e2+", написать "+e6
                +", id нашего класса и  "+e7+". Между этими скобками мы будем писать всю информацию!";
        //дописать текст, закончить !уроки! по css, обновить меню настроек

        a.setText(Html.fromHtml(e));

        return view;
    }

}
