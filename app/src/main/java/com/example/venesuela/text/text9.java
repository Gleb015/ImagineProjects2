package com.example.venesuela.text;


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
public class text9 extends Fragment {
    private TextView txt_prg_text9;
    private EditText editText_text9_1, editText_text9_2,  editText_text9_3,   editText_text9_4,  editText_text9_5, editText_text9_6,editText_text9_7,editText_text9_8;
    private Button btn_text9;

    public text9() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text9,

                container, false);
         txt_prg_text9 = (TextView) view.findViewById(R.id.txt_prg_text9);

       btn_text9= (Button) view.findViewById(R.id.btn_text9);
        //       editText_text9 = (EditText) view.findViewById(R.id.editText_text9);
        // String a1 ="<font color='#234234'>Хочешь</font>";
        String a2 = "<font color=";
        String a3 = "'#000000'></font>";
        String a4 = "'#FFD700'>Золото</font>";

        //   String a4 ="<font color='#234234'> цвет</font>";
        //  String a5 ="<font color='#234234'> текста?</font>";

        // txt_text9.setText(Html.fromHtml(text1));
        String text1 = "<html>"
                + "\n" + "<body>" +
                "\n" + "Носороги подразделяются на"+"     несколько видов"+"     , но я приведу лишь 3 примера:"+
                "\n" +  "<p><b>Носорог</b> -"+"<i>     Яванский     "+"носорог</i>"+"</p>"+
                "\n" + "<p><b>Носорог</b> - "+"     <i>"+ "     Индийский     "+"носорог</i>"+"</p>"+
                "\n" + "<p><b>Носорог</b> - "+"<i>     Суматранский     " + "\n" +
                "носорог</i>/" + "<p>"
                + "\n" + "</body>" +
                "\n" + "</html>";

        txt_prg_text9.setText(text1);



        editText_text9_1 = (EditText) view.findViewById(R.id.editText_text9_1);
        editText_text9_2 = (EditText) view.findViewById(R.id.editText_text9_2);
        editText_text9_3 = (EditText) view.findViewById(R.id.editText_text9_3);
        editText_text9_4 = (EditText) view.findViewById(R.id.editText_text9_4);

        editText_text9_5 = (EditText) view.findViewById(R.id.editText_text9_5);
        editText_text9_6 = (EditText) view.findViewById(R.id.editText_text9_6);
        editText_text9_7 = (EditText) view.findViewById(R.id.editText_text9_7);
        editText_text9_8 = (EditText) view.findViewById(R.id.editText_text9_8);


        btn_text9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if ((editText_text9_1.getText().toString().equals("<u>")) &
                        ((editText_text9_2.getText().toString().equals("</u>"))

                                & (editText_text9_3.getText().toString().equals("<font color='#2A66E1'>")) &
                                (editText_text9_4.getText().toString().equals("</font>")) &
                                (editText_text9_5.getText().toString().equals("<font color='#2A66E1'>")) &
                (editText_text9_6.getText().toString().equals("</font>")) &
                        (editText_text9_7.getText().toString().equals("</font>"))
                                & (editText_text9_8.getText().toString().equals("<font color='#2A66E1'>")))) {
                    Snackbar snackbar = Snackbar.make(v, "Замечательно, теперь мы можем именять цвет текста, настало время изменить изучить как изменять задний фон" +
                            " (background)!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                }
                else{
                    Snackbar snackbar = Snackbar.make(v, "Хммм, кажется ошибка", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorRedError);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();
                }
            }

        });
        /*btn_text8 = (Button) view.findViewById(R.id.btn_text8);


        btn_text8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_text8_2.setVisibility(View.VISIBLE);
                txt_text8_2.setTextColor(Color.rgb(255, 215, 0));
                // txt_text8_2.setText("Золото");
            }
        });

         */
        return view;
    }
}
