package com.example.venesuela.text;

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


public class text11 extends Fragment {
    private TextView txt_text11_2;
    private Button btn_text11;
    private EditText editText_text11;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_text11,

                container, false);


        txt_text11_2 = (TextView) view.findViewById(R.id.txt_text11_2);
        editText_text11 =(EditText) view.findViewById(R.id.editText_text11);
        String text =  "<span style='background-color: #000ff; color: #FFFFFFF'>Фр</span>" +
                "<span style='background-color: #ffffff; color: #000000'>ан</span>" +
                "<span style='background-color: #ff0000; color: #000000'>ция</span>";
        txt_text11_2.setText(Html.fromHtml(text));
        btn_text11= (Button) view.findViewById(R.id.btn_text11);

        btn_text11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                if (editText_text11.getText().toString().equals("!DOCTYPE"+"\n"+
                        "<html>"
                        + "\n" + "<body>" +
                        "\n"  + "<b style='background-color: #000ff; color: #FFFFFFF'>Фр</b>" +
                        "<b style='background-color: #ffffff; color: #FFFFFFF'>ан</b>" +
                        "<b style='background-color: #ff0000; color: #000000'>ция</b>"
                        + "\n"+ "</body>" +
                        "\n" + "</html>")) {
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


        editText_text11.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // обрабатываем нажатие кнопки DONE

                }
                return true;
            }



        });


        return view;
    }



}