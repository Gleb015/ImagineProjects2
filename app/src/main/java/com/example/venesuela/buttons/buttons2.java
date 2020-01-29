package com.example.venesuela.buttons;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class buttons2 extends Fragment {


    public buttons2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons2,
                container, false);

      final  EditText editText_buttons2 = (EditText) view.findViewById(R.id.editText_buttons2);
        editText_buttons2.setText("<!DOCTYPE>\n<html>\n<body>\n\n</body>\n</html>");
        Button btn_buttons2 = (Button) view.findViewById(R.id.btn_buttons2);



        btn_buttons2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editText_buttons2.getText().toString().equals(("<!DOCTYPE>\n<html>\n<body>\n<button></button>\n</body>\n</html>")))  {
                    Snackbar snackbar = Snackbar.make(v, "Отлично, давай теперь давай создадим " +
                            "\nнастоящую кнопку\n!", Snackbar.LENGTH_LONG)

                            .setAction("Продолжить...", null);

                    snackbar.setActionTextColor(Color.CYAN);
                    View sbView = snackbar.getView();

                    sbView.setBackgroundResource(R.color.colorGreenRight);
                    //   sbView.setMinimumHeight(550);

                    snackbar.show();

                }
                else{
                    Snackbar snackbar = Snackbar.make(v,"Проверь еще раз! Не забывай закрывать тег <button>", Snackbar.LENGTH_LONG)

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
