package com.example.venesuela.table;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 */
public class table5 extends Fragment {
    private EditText txt_table5_1_6;
    private Button btn_table5;
    private TextView txt_table5_1_1, txt_table5_1_2, txt_table5_1_3, txt_table5_1_4, txt_table5_1_5;
    public table5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_table5,

                 container, false);

       txt_table5_1_6 =(EditText) view.findViewById(R.id.txt_table5_1_6);
/*      // txt_table3_2 = (TextView) view.findViewById(R.id.txt_table3_2);
        txt_table4 = (TextView) view.findViewById(R.id.txt_table4);
        String b2 = "<span style='background-color: #D8E8F9;'>table</span>";
        String k = "<span style='background-color: #D8E8F9;'>body</span>";
        String w = "<span style='background-color: #D8E8F9;'>td</span>";

        String q = "<span style='background-color: #D8E8F9;'>tr</span>";

        String e = "<span style='background-color: #D8E8F9;'>th</span>";
        String k1 = "Давай поговорим о предыдущем коде. Тег " + b2 + "- это как " + k + " для нашего сайта. " +
                "В этом теге мы должны написать все содержимое таблицы! Элемент " + w + " создает ячейки таблицы, " +
                "внутрь которых помещаются" +
                " какие-либо данные! Строки в таблице создаются благодаря тегу " + q + ". Этот тег определяет количество" +
                " горизонтальных рядов в таблице! Элемент " + e + " создает заголовок столбца," +
                " в этой ячейке текст выделяется " +
                "<strong>пошлужирным</strong>!";
        txt_table4.setText(Html.fromHtml(k1));
       btn_table3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                txt_table3_2.setVisibility(View.VISIBLE);
            }
        });

        */
        btn_table5 =(Button) view.findViewById(R.id.btn_table5);

       txt_table5_1_1 = (TextView) view.findViewById(R.id.txt_table5_1_1);
        txt_table5_1_1.setText("<!DOCTYPE>");

        txt_table5_1_2 = (TextView) view.findViewById(R.id.txt_table5_1_2);
        txt_table5_1_2.setText("<html>");

        txt_table5_1_3 = (TextView) view.findViewById(R.id.txt_table5_1_3);
        txt_table5_1_3.setText("<body>");

        txt_table5_1_4 = (TextView) view.findViewById(R.id.txt_table5_1_4);
        txt_table5_1_4.setText("</body>");

        txt_table5_1_5 = (TextView) view.findViewById(R.id.txt_table5_1_5);
        txt_table5_1_5.setText("</html>");


        btn_table5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (txt_table5_1_6.getText().toString().equals(("<table>\n" +
                        "<tr>\n" +
                        "<th>№ товара</th>\n" +
                        "<th>Наименование товара</th>\n" +
                        "<th>Количество</th>\n" +
                        "<th>Цена за ед. шт., руб.</th>\n" +
                        "<th>Стоимость, руб.</th>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td>1.</td>\n" +
                        "<td>Линейка</td>\n" +
                        "<td>25</td>\n" +
                        "<td>14.00</td>\n" +
                        "<td>350.00</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td>2.</td>\n" +
                        "<td>Ручка</td>\n" +
                        "<td>25</td>\n" +
                        "<td>50.00</td>\n" +
                        "<td>1'250.00</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td>2.</td>\n" +
                        "<td>Карандаш</td>\n" +
                        "<td>25</td>\n" +
                        "<td>23.00</td>\n" +
                        "<td>575.00</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td>3.</td>\n" +
                        "<td>Ластик</td>\n" +
                        "<td>25</td>\n" +
                        "<td>6.00</td>\n" +
                        "<td>150.00</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td>4.</td>\n" +
                        "<td>Карандаши цветные</td>\n" +
                        "<td>25&nbsp;</td>\n" +
                        "<td>79.00</td>\n" +
                        "<td>1'975.00</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "</tr>\n" +
                        "</table>"))){
                    Snackbar snackbar = Snackbar.make(v, "Отличная работа!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                }
                else{
                    Snackbar snackbar = Snackbar.make(v,"", Snackbar.LENGTH_LONG)

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
