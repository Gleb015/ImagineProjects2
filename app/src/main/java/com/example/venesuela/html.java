package com.example.venesuela;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class html extends Fragment {


    public html() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_html,

                container, false);

        EditText editText_html = (EditText) view.findViewById(R.id.editText_html);
     /*   ImageView btn_main_activity =(ImageView) view.findViewById(R.id.btn_main_activity);
        btn_main_activity.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_main_activity:
                        Intent c = new Intent(getActivity(), HomeFragment.class);
                        startActivity(c);
                        break;
                    default:
                        break;

                }
            }
        });

      */


        editText_html.setText("<!DOCTYPE>\\n" +
                "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<link href =\"style.css\"\n" +
                "</body>\n" +
                "</html>");

        return view;
    }






    }



