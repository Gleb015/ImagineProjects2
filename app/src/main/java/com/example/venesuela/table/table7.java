package com.example.venesuela.table;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class table7 extends Fragment {
    private TextView txt_table7_1_1, txt_table7_1_2, txt_table7_1_3, txt_table7_1_4, txt_table7_1_5, txt_table7_1;

    private TextView txt_table6, txt_table3_2;
    private Button btn_table3;

    public table7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_table7,

                container, false);
        //  btn_table3 =(Button) view.findViewById(R.id.btn_table3);
    /*      txt_table6 = (TextView) view.findViewById(R.id.txt_table7);

        String b2 = "<span style='background-color: #D8E8F9;'>table</span>";
        String k = "<span style='background-color: #D8E8F9;'>caption</span>";
        String k2 = "<span style='background-color: #D8E8F9;'>/caption</span>";
        String w = "   <td colspan=\"4\" style=\"text-align:right\">ИТОГО:</td><td>1168,80</td>";

        String q = "<span style='background-color: #D8E8F9;'><td colspan=\"4\"</span>";
        String q2 = "<span style='background-color: #D8E8F9;'>style=\"text-align:right\"></span>";
        String e = "<span style='background-color: #D8E8F9;'>th</span>";
        String k1 = "Теперь давай улучшим нашу таблицу, \n" +
                "        предлагаю добавить название нашей таблице, ну и конечно же итоговую строчку)" +
                ". Для того чтобы добавить название нашей страницы, необходимо прописать тег " +k+
                " (не забудь его закрыть) сразу же послее тега"+b2+". Название таблицы следует прописать так: "
                +k+"навазние твоей таблицы"+k2+". Теперь давай поговорим об \"Итоге\". Для того чтобы " +
                "добавить последнюю строчку, неободимо использовать тег "+q+q2+", где \"цифра(4)\" определяет, " +
                "какое расстояние нужно отступить " +
                "от начала таблицы (цифра - количество столбцов),"+q2+" показывает, что текст выравнивается по " +
                "правому краю, теперь давай посмотрим, как выглядит этот код (Итого) полностью: " +w+". 4'300.00 - сумма нашего заказа, ну что ж, теперь когда ты знаешь как все это сделать" +
                " настало время добавить в нашу таблицу!";
        txt_table6.setText(Html.fromHtml(k1));
       btn_table3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                txt_table3_2.setVisibility(View.VISIBLE);
            }
        });

        */
      /*  txt_table7_1_1 = (TextView) view.findViewById(R.id.txt_table7_1_1);
        txt_table7_1_1.setText("<!DOCTYPE>");

        txt_table7_1_2 = (TextView) view.findViewById(R.id.txt_table7_1_2);
        txt_table7_1_2.setText("<html>");

        txt_table7_1_3 = (TextView) view.findViewById(R.id.txt_table7_1_3);
        txt_table7_1_3.setText("<body>");






        txt_table7_1_4 = (TextView) view.findViewById(R.id.txt_table7_1_4);
        txt_table7_1_4.setText("</body>");

        txt_table7_1_5 = (TextView) view.findViewById(R.id.txt_table7_1_5);
        txt_table7_1_5.setText("</html>");
*/


   txt_table7_1 = (TextView) view.findViewById(R.id.txt_table7_1);
        txt_table7_1.setText("<!DOCTYPE>" +"\n"+
                "<html>" +"\n"+
                "<body>"+ "\n"+

                        "<table>\n" +
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
                        "</table>"+"\n"+
                "</body>" + "\n"+
                "</html>");

        return view;
    }
}