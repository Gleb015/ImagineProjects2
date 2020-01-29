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
public class css3 extends Fragment {
//    private EditText editText_css3;

    public css3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_css3,
                container, false);

        final EditText editText_css3 = (EditText) view.findViewById(R.id.editText_css3);
        Button btn_css3 = (Button) view.findViewById(R.id.btn_css3);
        TextView txt_css3 = (TextView) view.findViewById(R.id.txt_css3);
        txt_css3.setText("Добавь основу CSS!");
        TextView txt_css3_1 = (TextView) view.findViewById(R.id.txt_css3_1);
        txt_css3_1.setText("id нашего объекта - id");
        btn_css3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ((editText_css3.getText().toString().equals(".id{}"))) {

                    Snackbar snackbar = Snackbar.make(v, "Превоходно, теперь давай добавим немного информации!", Snackbar.LENGTH_LONG)

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
        editText_css3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
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
