package com.example.venesuela.comments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import imagineprojects.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class comment1 extends Fragment {


    public comment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comment1,
                container, false);
        return view;
    }

}
