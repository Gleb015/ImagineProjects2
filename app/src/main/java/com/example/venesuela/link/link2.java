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

public class link2 extends Fragment {

private EditText editText_link2;
private Button btn_link2;
    public link2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_link2,

                container, false);
        btn_link2 =(Button) view.findViewById(R.id.btn_link2);

        editText_link2 =(EditText) view.findViewById(R.id.editText_link2);

        editText_link2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // обрабатываем нажатие кнопки DONE

                }
                return true;
            }

        });


        btn_link2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                if (editText_link2.getText().toString().equals("!DOCTYPE"+"\n"+
                        "<html>"
                        + "\n" + "<body>"
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


        return view;
    }

}
