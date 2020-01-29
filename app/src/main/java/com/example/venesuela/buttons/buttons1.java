package com.example.venesuela.buttons;


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
public class buttons1 extends Fragment {


    public buttons1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons1,
                container, false);

        TextView txt_buttons1 = (TextView) view.findViewById(R.id.txt_buttons1);
        String e1 ="<span style='background-color: #D8E8F9;'>button</span>";
        String e = "На всех хороших сайтах есть кнопки, давай попробуем их создать с помощью парного тега "+e1+". " +
                "Создай свою первую кнопку прямо сейчас!";
        txt_buttons1.setText(Html.fromHtml(e));
        return view;
    }

}
