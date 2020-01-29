package com.example.venesuela.buttons;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class buttons3 extends Fragment {


    public buttons3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons3,
                container, false);

        TextView txt_buttons3 = (TextView) view.findViewById(R.id.txt_buttons3);

                String e1 ="<span style='background-color: #D8E8F9;'>input value=" +
                        "\"Кнопка\" type=\"button\" onclick=\"location.href='ССЛЫКА_НА_СТРАНИЦУ' \" </span>";
        String e ="Давай сделаем переход на другой сайт (google.com), по образцу (не забывай закрывать теги!): "+e1+".";
        txt_buttons3.setText(Html.fromHtml(e));

        final EditText editText_buttons3 = (EditText) view.findViewById(R.id.editText_buttons3);
        editText_buttons3.setText("<!DOCTYPE>\n<html>\n<body>\n<button>\n</button>\n</body>\n</html>");

        Button btn_buttons3 =(Button) view.findViewById(R.id.btn_buttons3);


        btn_buttons3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editText_buttons3.getText().toString().equals(("<!DOCTYPE>\n<html>\n<body>\n<button><input value=\"Кнопка\" type=\"button\" onclick=\"location.href='google.com'\" /></button>\n</body>\n</html>")))  {
                    Snackbar snackbar = Snackbar.make(v, "Отлично, давай теперь давай создадим " +
                            "\nнастоящую кнопку\n!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                }
                else{
                    Snackbar snackbar = Snackbar.make(v,"Попробуй еще раз! ", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorRedError);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();
                }
            }

        });

        return view;
    }

}
