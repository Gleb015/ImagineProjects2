package com.example.venesuela.base;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class base4 extends Fragment {
    private TextView textView, panel;
    private Button btn_ans1_base4;
    private FloatingActionButton transition_base1;

    public base4() {
        // Required empty public constructor
    }
    public void onTouch()
    {
        panel.setVisibility(View.GONE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_base4,
                container, false);

        panel = (TextView) view.findViewById(R.id.panel_base);


final EditText editText_base4= (EditText) view.findViewById(R.id.editText_base4);
        textView = (TextView) view.findViewById(R.id.txt4_1);
        btn_ans1_base4 = (Button) view.findViewById(R.id.btn_ans1_base4);

        final SpannableStringBuilder text = new SpannableStringBuilder(
                "<html>" + "\n" + "<body>" + "\n" + "\n" + "</body>" + "\n" + "</html>");

        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 1, 5, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 8, 12, 0);

        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 16, 21, 0);
        text.setSpan(new ForegroundColorSpan(Color.rgb(198, 44, 99)), 24, 29, 0);
        textView.setText(text);//spannable/text



        btn_ans1_base4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                editText_base4.setText("Hello World!");
                Snackbar snackbar = Snackbar.make(v, "Превосходно, теперь ты можешь выводить любые сообщения! ", Snackbar.LENGTH_INDEFINITE)

                        .setAction("Продолжить...", null);
                //android.support.design.
                View snackbarView = snackbar.getView();
                TextView textView = (TextView) snackbarView.findViewById(R.id.snackbar_text);
                textView.setMaxLines(3);  // show multiple line

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();
                sbView.setBackgroundResource(R.color.colorGreenTab);
                sbView.setMinimumHeight(180);

                snackbar.show();
            }

        });
        return view;
    }
}



