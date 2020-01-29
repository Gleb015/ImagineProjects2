package com.example.venesuela.css;


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
public class css5 extends Fragment {


    public css5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_css5,
                container, false);
        TextView txt_css5 = (TextView) view.findViewById(R.id.txt_css5);
      final  EditText editText_css5 = (EditText) view.findViewById(R.id.editText_css5);

        Button btn_css5 = (Button) view.findViewById(R.id.btn_css5);
        btn_css5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((editText_css5.getText().toString().equals("color:#FFFFFF;\n" +
                        "    background-color: #151619; \n" +
                        "    border: 1px solid black;\n" +
                        " margin-left: 20%; \n" +
                        "    padding: 35px; \n" +
                        "margin-right: 20%;"))) {

                    Snackbar snackbar = Snackbar.make(v, "Молодчина!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                } else {
                    Snackbar snackbar = Snackbar.make(v, "Попытаяйся еще раз", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorRedError);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();
                }
            }
        });
        editText_css5.setOnEditorActionListener(new TextView.OnEditorActionListener() {
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
