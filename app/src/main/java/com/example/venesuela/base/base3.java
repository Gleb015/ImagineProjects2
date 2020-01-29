package com.example.venesuela.base;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import imagineprojects.R;


public class base3 extends Fragment
{
    private TextView textView;
    private ImageView btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_base3,

                container, false);



        TextView textView = (TextView) view.findViewById(R.id.txt_prg_base3_1);

        //   Button btnOk = (Button) view.findViewById(R.id.base3_base4);
        // Button btn = (Button) view.findViewById(R.id.base3_base4);

        final SpannableStringBuilder text = new SpannableStringBuilder(
                "<html>" + "\n" + "<body>" + "\n" + "Hello World!" + "\n" + "</body>" + "\n" + "</html>");

        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 1, 5, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 8, 12, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 28, 33, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 36, 41, 0);
        textView.setText(text);//spannable/text
//создаем листенер
  /*  btn.setOnClickListener(new View.OnClickListener() {
    View.OnClickListener onClickListener = new View.OnClickListener()

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(), base4_activity.class);
                startActivity(intent);
                //startActivity(new Intent(getActivity(), base4_activity.class));
            }

        });

   */
      //  btn.setOnClickListener(new OnClickListener(){
      /*  btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(), base4_activity.class);
                startActivity(intent);
            }

        });

       */
        return view;
    }
}
