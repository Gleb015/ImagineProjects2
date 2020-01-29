package com.example.venesuela.images;

import android.content.Intent;
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


public class image5 extends Fragment {
private Button btn_img5;

    public image5() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image5,

                container, false);


        btn_img5 = (Button) view.findViewById(R.id.btn_img5);


        btn_img5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(v, "Ого, теперь ты можешь вставить" +
                        " картинку на свой сайт!" +
                    "Запомни, одна из самых главных вещей на сайте - " +
                        "дизайн, без картинок он будет скучным " +
                        "и неинтересным!", Snackbar.LENGTH_INDEFINITE)

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

        return  view;
    }
}