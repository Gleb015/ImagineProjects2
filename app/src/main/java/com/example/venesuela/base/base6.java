package com.example.venesuela.base;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import imagineprojects.R;
import com.example.venesuela.ui.login.MainScreen;
import com.google.android.material.snackbar.Snackbar;


public class base6 extends Fragment {
    private TextView panel, txt_base6;
    private Button btn_base6_1;
    private Fragment fragment_base6;

    public base6() {
        // Required empty public constructor
    }

   // int alpha = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_base6,


                container, false);
        btn_base6_1 = (Button) view.findViewById(R.id.btn_base6_1);


        btn_base6_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(v, "Поздравляю, ты освоил базу html," +
                        " теперь ты способен написать" +
                        " простенький сайт, заходи в приложение каждый день, и " +
                        "вскоре ты сможешь создать сайты любой сложности!", Snackbar.LENGTH_INDEFINITE)

                        .setAction("Продолжить...", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(getActivity(), MainScreen.class);
                                startActivity(intent);

                            }
                        });
                //android.support.design.
                View snackbarView = snackbar.getView();
                TextView textView = (TextView) snackbarView.findViewById(R.id.snackbar_text);
                textView.setMaxLines(8);  // show multiple line

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();
                sbView.setBackgroundResource(R.color.colorDarkBlue);
                sbView.setMinimumHeight(550);

                snackbar.show();
            }
        });

        SharedPreferences pref = this.getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);
       pref.edit().putString("key", "#ff0000").apply();
        return view;
    }

}
