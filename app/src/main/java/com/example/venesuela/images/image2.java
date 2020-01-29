package com.example.venesuela.images;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import imagineprojects.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class image2 extends Fragment {
    private TextView txt_prg_img2, panel, txt_img2_1;
    private Button btn_ans1_base4, btn;
    private FloatingActionButton transition_base1;
    private String e;
    AlertDialog.Builder ad;
    Context context;

    public image2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image2,
                container, false);

        txt_prg_img2 = (TextView) view.findViewById(R.id.txt_prg_img2);

        String h = "<"+"<font color='#C62C62'>html</font>>";
        String hc = "</<font color='#C62C62'>html</font>>";
        String b = "<<font color='#C62C62'>body</font>>";
        String bc = "</<font color='#C62C62'>body</font>>";
        String i = "<<font color='#C62C62'>img src=</font>>";
        String ot = "<";
        String ct = ">";
        String et = "</";
        String txt_img2_1 ="Мы пишем в теге ";
        String b2 = "\"<body>\"";
        String k1 ="<img src=\"...\"";
        String k =" <img src=";
        String e = "\"lamborghini.jpg\">";
        //String text = ot +h + ct +"\n" +ot + b  + ct + "\n"+  e + "\n" + et + h + ct+"\n" +et + b  + ct ;
         String text = h + "\n" + b + "\n" + k +e +"\n"+ bc +"\n"+ hc;
       String text3 = "<html>"
                + "\n" + "<body>" +
                "\n" + "<img src=\"lamborghini.jpg\">"
                + "\n" + "</body>" +
                "\n" + "</html>";



        txt_prg_img2.setText(text3);

     /*   transition_base1 = (FloatingActionButton) view.findViewById(R.id.transition_base1);
        final SpannableStringBuilder text = new SpannableStringBuilder(
                "<html>" + "\n" + k + "\n" + " <img src=\"lamborghini.jpg\">" + "\n" + "</body>" + "\n" + "</html>");
        txt_prg_img2.setText(text + k);
        String title = "Выбор есть всегда";
        String message = "Выбери пищу";
        String button1String = "Вкусная пища";
        String button2String = "Здоровая пища";

      */
        return view;

   /*     public SpannableStringBuilder makeSpannable (String text){
            SpannableStringBuilder spannable = new SpannableStringBuilder(text);
            Pattern pattern = Pattern.compile("\\((.*?)\\)");//<-- поиск текста в круглых скобках
            Matcher matcher = pattern.matcher(spannable.toString());
            while (matcher.find()) {
                ForegroundColorSpan spanGreen = new ForegroundColorSpan(Color.GREEN);
                spannable.setSpan(spanGreen, matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            return spannable;
        }
        String text = "text (find1) or (find2)";
        text.setText(makeSpannable(text));

    */


/*
     //   ad = new AlertDialog.Builder(context);
     //   ad.setTitle(title);  // заголовок
      //  ad.setMessage(message); // сообщение
       ad.setPositiveButton(button1String, new OnClickListener() {
          public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Вы сделали правильный выбор",
                        Toast.LENGTH_LONG).show();
            }
        });
        ad.setNegativeButton(button2String, new OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Возможно вы правы", Toast.LENGTH_LONG)
                        .show();
            }
        });
        ad.setCancelable(true);
        ad.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(context, "Вы ничего не выбрали",
                        Toast.LENGTH_LONG).show();
            }
        });



    btn.setOnClickListener(new View.OnClickListener() {

        public void onClick (View v){
        ad.show();
    }
    });
*/


    }
}






