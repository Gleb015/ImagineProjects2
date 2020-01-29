package com.example.venesuela.text;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import imagineprojects.R;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class text5 extends Fragment {

    private EditText editText_doc, editText_html1, editText_html2, editText_body1, editText_body2;
    private Button btn_text5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text5,

                container, false);

       editText_doc = (EditText) view.findViewById(R.id.editText_doc);
        editText_html1 = (EditText) view.findViewById(R.id.editText_html1);
        editText_html2 = (EditText) view.findViewById(R.id.editText_html2);
        editText_body1 = (EditText) view.findViewById(R.id.editText_body1);
        editText_body2 = (EditText) view.findViewById(R.id.editText_body2);

        btn_text5 = (Button) view.findViewById(R.id.btn_text5);
        String a ="!DOCTYPE";
        String b ="!DOCTYPE";
        String c ="!DOCTYPE";
        String d ="!DOCTYPE";
        String e ="!DOCTYPE";


        //  editText_body2.setOnClickListener(new View.OnClickListener() {
        //      public void onClick(View v) {

      btn_text5.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

            if ((editText_doc.getText().toString().equals("<!DOCTYPE>"))
                    & (editText_html1.getText().toString().equals("<html>")) &
                    (editText_html2.getText().toString().equals("</html>")) &
                    (editText_body1.getText().toString().equals("<body>")) &
                    (editText_body2.getText().toString().equals("</body>"))) {
                Snackbar snackbar = Snackbar.make(v, "Молодец, теперь давай добавим текст!", Snackbar.LENGTH_LONG)

                        .setAction("Продолжить...", null);

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();

                sbView.setBackgroundResource(R.color.colorDarkBlue);
                //   sbView.setMinimumHeight(550);

                snackbar.show();

            }
            else{
                Snackbar snackbar = Snackbar.make(v, "Неверно!", Snackbar.LENGTH_LONG)

                        .setAction("Продолжить...", null);

                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();

                sbView.setBackgroundResource(R.color.colorDarkBlue);
                //   sbView.setMinimumHeight(550);

                snackbar.show();
            }
            }

            });


        return view;

}
    }