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
public class text6 extends Fragment {
  // private  EditText editText_doctype, editText_html1, editText_html2, editText_body1, editText_body2;
    private Button btn_text6;
    private TextView txt_prg_text6_1, txt_prg_text6_2, txt_prg_text6_3, txt_prg_text6_4,txt_prg_text6_5;
    private EditText editText_text6_txt1,  editText_text6_txt2,   editText_text6_txt3,  editText_text6_txt4;
    public text6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text6,

                container, false);
        editText_text6_txt1 = (EditText) view.findViewById(R.id.editText_text6_txt1);
        editText_text6_txt2 = (EditText) view.findViewById(R.id.editText_text6_txt2);
        editText_text6_txt3 = (EditText) view.findViewById(R.id.editText_text6_txt3);
        editText_text6_txt4 = (EditText) view.findViewById(R.id.editText_text6_txt4);


        txt_prg_text6_1 = (TextView) view.findViewById(R.id.txt_prg_text6_1);
        txt_prg_text6_2 = (TextView) view.findViewById(R.id.txt_prg_text6_2);
        txt_prg_text6_3 = (TextView) view.findViewById(R.id.txt_prg_text6_3);
        txt_prg_text6_4 = (TextView) view.findViewById(R.id.txt_prg_text6_4);
        txt_prg_text6_5 = (TextView) view.findViewById(R.id.txt_prg_text6_5);

       btn_text6 = (Button) view.findViewById(R.id.btn_text6);

        String text1 = "<!DOCTYPE>";
        txt_prg_text6_1.setText(text1);

        String text2 = "<html>";
        txt_prg_text6_2.setText(text2);

        String text3 = "<body>";
        txt_prg_text6_3.setText(text3);

        String text4 = "</body>";
        txt_prg_text6_4.setText(text4);

        String text5 = "</html>";
        txt_prg_text6_5.setText(text5);




      btn_text6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if ((editText_text6_txt1.getText().toString().equals("Носороги подразделяются на несколько видов, но я приведу лишь 3 примера:")) ||
                        ((editText_text6_txt1.getText().toString().equals("Носороги подразделяются на несколько видов, но я приведу лишь 3 примера"))
                        & (editText_text6_txt2.getText().toString().equals("<p><b>Носорог</b>-<i> Яванский носорог</i></p>")) &
                        (editText_text6_txt3.getText().toString().equals("<p><b>Носорог</b>-<i> Индийский носорог</i></p>")) &
                        (editText_text6_txt4.getText().toString().equals("<p><b>Носорог</b>-<i> Суматранский носорог</i><p>")))) {
                    Snackbar snackbar = Snackbar.make(v, "Отлично, теперь давай сделаем наш текст ярче!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                }
                else{
                    Snackbar snackbar = Snackbar.make(v, "Попробуй снова!", Snackbar.LENGTH_LONG)

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

