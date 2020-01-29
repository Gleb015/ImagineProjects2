package com.example.venesuela;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import imagineprojects.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class web extends Fragment {


    public web() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_html,

                container, false);
       WebView webView = (WebView) view.findViewById(R.id.mybrowser);
       return view;
    }

}
