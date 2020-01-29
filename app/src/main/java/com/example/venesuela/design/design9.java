package com.example.venesuela.design;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class design9 extends Fragment {


    public design9() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_design9,
                container, false);
        Button btn_design9 = (Button) view.findViewById(R.id.btn_design9);


        btn_design9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(v, "Замечательно, теперь я уверен, что  " +
                        "на твои сайты люди будут приходить чаще и " +
                        "оставаться дольше!", Snackbar.LENGTH_INDEFINITE)

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
                textView.setMaxLines(5);  // show multiple line

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();
                sbView.setBackgroundResource(R.color.colorDarkBlue);
                sbView.setMinimumHeight(550);

                snackbar.show();
            }
        });
        return view;
    }

}
