package com.example.venesuela.list;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class list1 extends Fragment {


    public list1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list1,

                container, false);
        Button btn_list1 = (Button) view.findViewById(R.id.btn_list1);
        TextView txt_list1 = (TextView) view.findViewById(R.id.txt_list1);
       final EditText editText_list1 = (EditText) view.findViewById(R.id.editText_list1);
        String k2 ="<span style='background-color: #D8E8F9;'>ul</span>";
        String k3 ="<span style='background-color: #D8E8F9;'>li</span>";
        String k4 ="<span style='background-color: #D8E8F9;'>ol</span>";
        String k5 ="<span style='background-color: #D8E8F9;'>li</span>";

        String k1 ="Давай поговорим о списках. Списки бывают разные: бывают с закрашенными точками (образуется с помощью " +
                "парного тега: " +k2+",а пишем мы между парным тегом "+k3 +
                "), также бывают нумерованные списки. Они образуются с помощью парных тегов " +k4+" и "+k5+
                ". Это основные виды списков, давай ты напишешь сайт, в котором будет находится список покупок. " +
                "Так должен выглядеть твой сайт:" +
                "<ul>" +
                "<li>Хлеб</li>"+
                "<li>Яйца</li>"+
                "<li>Молоко</li>"+
                "<li>Сахар</li>"+
                "<li>Мука</li>"+
                "</ul>";
        editText_list1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // обрабатываем нажатие кнопки DONE

                }
                return true;
            }



        });

        txt_list1.setText(Html.fromHtml(k1));


        btn_list1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (editText_list1.getText().toString().equals("!DOCTYPE" + "\n" +
                        "<html>"
                        + "\n" + "<body>" +
                        "\n" +   "<li>Хлеб</li>"+  "\n" +
                        "<li>Яйца</li>"+  "\n" +
                        "<li>Молоко</li>"+  "\n" +
                        "<li>Сахар</li>"+  "\n" +
                        "<li>Мука</li>"      + "\n"
                   + "</body>" +
                        "\n" + "</html>")) {
                    Snackbar snackbar = Snackbar.make(v, "Молодец, теперь давай составим сложный список!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                } else {
                    Snackbar snackbar = Snackbar.make(v, "Попробуй еще раз!", Snackbar.LENGTH_LONG)

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
