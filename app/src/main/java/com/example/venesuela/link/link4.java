package com.example.venesuela.link;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
public class link4 extends Fragment {

    private TextView txt_prg_link4_1, txt_prg_link4_2, txt_prg_link4_3, txt_prg_link4_4, txt_prg_link4_5;
    private Button btn_link4;
    private EditText editText_link4;
    public link4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_link4,

                container, false);
        txt_prg_link4_1 = (TextView) view.findViewById(R.id.txt_prg_link4_1);
        txt_prg_link4_1.setText("<!DOCTYPE>");

        txt_prg_link4_2 = (TextView) view.findViewById(R.id.txt_prg_link4_2);
        txt_prg_link4_2.setText("<html>");

        txt_prg_link4_3 = (TextView) view.findViewById(R.id.txt_prg_link4_3);
        txt_prg_link4_3.setText("<body>");

        txt_prg_link4_4 = (TextView) view.findViewById(R.id.txt_prg_link4_4);
        txt_prg_link4_4.setText("</body>");

        txt_prg_link4_5 = (TextView) view.findViewById(R.id.txt_prg_link4_5);
        txt_prg_link4_5.setText("</html>");


        btn_link4 = (Button) view.findViewById(R.id.btn_link4);
        editText_link4 = (EditText) view.findViewById(R.id.editText_link4);
        String k ="<span style='background-color: #D8E8F9;'>a href = \"AAA\">BBB/a</span>";
        String text = "Чтобы сделать ссылку, необходмо использовать тег: " +k +". А вместо 'AAA' " +
                "необходимо использовать адресс страницы" +
                ", например: ";
        //   txt_link3.setText((text);
     //   txt_link3.setText(Html.fromHtml(text));


        btn_link4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editText_link4.getText().toString().equals(("<p><a href=\"https://www.google.ru\">Google</a></p>"+ " <p><a href=\"https://yandex.ru\">Яндекс</a></p>")) ||
                        editText_link4.getText().toString().equals(("<p><a href=\"https://www.google.ru\">Google</a></p>"+
                        "\n" +" <p><a href=\"https://yandex.ru\">Яндекс</a></p>")) ||
                        editText_link4.getText().toString().equals((" <p><a href=\"https://yandex.ru\">Яндекс</a></p>" + "<p><a href=\"https://www.google.ru\">Google</a></p>")) ||
                        editText_link4.getText().toString().equals((" <p><a href=\"https://yandex.ru\">Яндекс</a></p>" +"\n" + "<p><a href=\"https://www.google.ru\">Google</a></p>")))  {
                    Snackbar snackbar = Snackbar.make(v, "Молодец! Так держать!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                }
                else{
                    Snackbar snackbar = Snackbar.make(v,"Проверь еще раз! возможно " +
                            "ты не правильно написал Google или Яндекс! Адрес страницы Google: " +
                            "https://www.google.ru, адрес страницы Яндекса: https://yandex.ru!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorRedError);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();
                }
            }

        });




        String text2 = "<a href = \"https://www.yandex.ru\">Яндекс</a>";
        //   txt_link3.setText((text);
     //   txt_prg_link3.setText(Html.fromHtml(text2));

        editText_link4.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {


                }
                return true;
            }
        });
        return view;
    }


}
