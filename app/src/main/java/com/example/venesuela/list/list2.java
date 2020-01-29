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
public class list2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list2,

                container, false);
        TextView txt_list2_1 = (TextView) view.findViewById(R.id.txt_list2_1);
        Button btn_list2 = (Button) view.findViewById(R.id.btn_list2);
        TextView txt_list2 = (TextView) view.findViewById(R.id.txt_list2);
        final EditText editText_list2 = (EditText) view.findViewById(R.id.editText_list2);
        String k2 ="<span style='background-color: #D8E8F9;'>dl</span>";
        String k3 ="<span style='background-color: #D8E8F9;'>dt</span>";
        String k4 ="<span style='background-color: #D8E8F9;'>dd</span>";

/*      getActivity();
    //  view.findViewById(R.id.reset_lists);
      Button reset_lists = (Button) view.findViewById(R.id.reset_lists);
        reset_lists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent b = new Intent(list2.this.getActivity(), list2.class);
                startActivity(b);

            }
               });


 */
        String k1 ="Предлагаю составить список, где будет отображена информация об актерах, режиссерых и т. п. " +
                "в фильме \"Война бесконечности\". " +
                "Что для этого нужно? Во-первых, весь этот список должен быть заключен между парными тегами "+k2+". " +
                "Чтобы выделить строки в главных ролях/режиссер/продюсера/оператора и т. п. " +
                "необходимо использовать тег "+k3+". Для отображения имен используй тег "+k4+". Не забывай закрывть теги!";
        editText_list2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // обрабатываем нажатие кнопки DONE

                }
                return true;
            }



        });

        txt_list2.setText(Html.fromHtml(k1));

        String e="Так должен выглядеть твой сайт:" + "\n" +
                "!DOCTYPE" + "\n" +
                "<html>"+ "\n" +
                "<dl>"+ "\n" +
                "<dt>Режиссер:</dt>"+ "\n" +
                "<dd>Энтони Руссо</dd>"+ "\n" +
                "<dd>Джо Руссо</dd>"+
                "<dt>Продюсер:</dt>"+ "\n" +
                "<dd>Кевин Файги</dd>"+ "\n" +

                "<dt>В главных ролях:</dt>"+ "\n" +
                "<dd>Роберт Дауни младший</dd>"+ "\n" +
                "<dd>Крис Хемсворт</dd>"+ "\n" +
                "<dd>Марк Руффало</dd>"+ "\n" +
                "<dd>Крис Эванс</dd>"+ "\n" +

                "<dd>Том Холланд</dd>"+ "\n" +
                "<dd>Элизабет Олсен</dd>"+ "\n" +
                "<dd>Энтони Маки</dd>"+ "\n" +
                "<dd>Крис Прэтт</dd>"+ "\n" +
                "<dd>Себастиан Стэн</dd>"+ "\n" +
                "<dd>Мария Кожевникова</dd>"+ "\n" +
                "<dt>Оператор:</dt>"+ "\n" +
                "<dd>Трент Опалок</dd>"+ "\n" +
                "<dt>Композитор:</dt>"+ "\n" +
                "<dd>Алан Сильвестри</dd>"+ "\n" +
                "</dl>"+ "\n" +
                "</body>" +
                "\n" + "</html>";

    //    txt_list2_1.setText(Html.fromHtml(e));



        btn_list2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (editText_list2.getText().toString().equals("!DOCTYPE" + "\n" +
                        "<html>"+ "\n" +
                        "<dl>"+ "\n" +
                        "<dt>Режиссер:</dt>"+ "\n" +
            "<dd>Энтони Руссо</dd>"+ "\n" +
                        "<dd>Джо Руссо</dd>"+
                        "<dt>Продюсер:</dt>"+ "\n" +
                        "<dd>Кевин Файги</dd>"+ "\n" +

          "<dt>В главных ролях:</dt>"+ "\n" +
           "<dd>Роберт Дауни младший</dd>"+ "\n" +
           "<dd>Крис Хемсворт</dd>"+ "\n" +
          "<dd>Марк Руффало</dd>"+ "\n" +
                        "<dd>Крис Эванс</dd>"+ "\n" +

                        "<dd>Том Холланд</dd>"+ "\n" +
                        "<dd>Элизабет Олсен</dd>"+ "\n" +
                        "<dd>Энтони Маки</dd>"+ "\n" +
                        "<dd>Крис Прэтт</dd>"+ "\n" +
                        "<dd>Себастиан Стэн</dd>"+ "\n" +
                "<dd>Мария Кожевникова</dd>"+ "\n" +
                        "<dt>Оператор:</dt>"+ "\n" +
                        "<dd>Трент Опалок</dd>"+ "\n" +
                        "<dt>Композитор:</dt>"+ "\n" +
                        "<dd>Алан Сильвестри</dd>"+ "\n" +
          "</dl>"+ "\n" +
                        "</body>" +
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
