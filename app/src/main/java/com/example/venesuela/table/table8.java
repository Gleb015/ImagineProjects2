package com.example.venesuela.table;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import imagineprojects.R;
import com.example.venesuela.ui.login.MainScreen;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class table8 extends Fragment {

    private TextView txt_table6, txt_table3_2;
    private Button btn_table8;

    public table8() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_table8,

                container, false);
        //  btn_table3 =(Button) view.findViewById(R.id.btn_table3);
         /*  txt_table6 = (TextView) view.findViewById(R.id.txt_table6);

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
        btn_table8 = (Button) view.findViewById(R.id.btn_table8);
        btn_table8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(v, "Ты просто лучший, теперь, после того как ты знаешь как создавать сложные" +
                        "таблицы, стоит изучить как создавать списки! ", Snackbar.LENGTH_INDEFINITE)

                        .setAction("Продолжить...", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(getActivity(), MainScreen.class);
                                startActivity(intent);

                            }
                        });
                //android.support.design.
                View snackbarView = snackbar.getView();
                TextView textView = (TextView) snackbarView.findViewById(R.id.snackbar_text);
                textView.setMaxLines(8);  // show multiple line

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();
                sbView.setBackgroundResource(R.color.colorDarkBlue);
                sbView.setMinimumHeight(550);

                snackbar.show();
            }
        });


        return view;
    }
}
