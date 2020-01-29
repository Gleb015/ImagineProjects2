package com.example.venesuela.design;


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
public class design1 extends Fragment {


    public design1() {
        // Required empty public constructor
    }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_design1,
                    container, false);
            TextView txt_design1 = (TextView) view.findViewById(R.id.txt_design1);
            String e = "После того, как мы можем создавать простенький сайт, необходимо" +
                    " разобраться, в чем различие хорошего и плохого сайта? Лично я считаю, " +
                    "что огромную роль играет интерфейс, " +
                    "ведь если пользователь зайдет на сайт и не поймет что где, то " +
                    "он уйдет через несколько секунд после загрузки " +
                    "сайта. Преположим у нас прекрасно работает " +
                    "сайт и отличный интерфейс, но на сайте слишком много рекламы," +
                    " какого-то неопнятного и ненужного контента.. все это будет приведет к тому, " +
                    "что пользователи будут уходить.";
            txt_design1.setText(Html.fromHtml(e));
            return view;

        }

}
