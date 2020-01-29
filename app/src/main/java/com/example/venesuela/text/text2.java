package com.example.venesuela.text;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;


public class text2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView txt_prg_text2, txt_text2_2, txt_text2_1;
    private Button btn_text2;

    public text2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text2,

                container, false);

        txt_text2_1= (TextView) view.findViewById(R.id.txt_text2_1);
        String e = "<span style='background-color: #D8E8F9;'>b</span>";
        String e2 = "<span ='background-color: #D8E8F9;'>i</span>";
        String k = "Давай напишем название животного и его вид, используя 2 тега: " +e +e2+". Тег " +e+" " +
                "делает текст <strong>жирным</strong>, а тег " +e2+"<i>делает текст наклонным</i>!";
        txt_text2_1.setText(Html.fromHtml(k));
        txt_prg_text2 = (TextView) view.findViewById(R.id.txt_prg_text2);

        txt_text2_2 = (TextView) view.findViewById(R.id.txt_text2_2);

        btn_text2 = (Button) view.findViewById(R.id.btn_text2);
      //  Давай напишем название животного и его вид, используя 2 тега
        String text3 = "<html>"
                + "\n" + "<body>" +
                "\n" +  "<b>Носорог</b> -<i> Яванский носорог</i>"
                + "\n" + "</body>" +
                "\n" + "</html>";
        txt_prg_text2.setText(text3);

        btn_text2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt_text2_2.setVisibility(View.VISIBLE);
               Snackbar snackbar = Snackbar.make(v, "Поздравляю, теперь текст на твоих" +
                       " сайтах будет красивее!", Snackbar.LENGTH_LONG)

                        .setAction("Продолжить...", null);
                //android.support.design.
                View snackbarView = snackbar.getView();
                TextView textView = (TextView) snackbarView.findViewById(R.id.snackbar_text);
             //   textView.setMaxLines(8);  // show multiple line

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();

                sbView.setBackgroundResource(R.color.colorDarkBlue);
             //   sbView.setMinimumHeight(550);

                snackbar.show();
            }
        });



        return view;
    }
}

