package com.example.venesuela.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import imagineprojects.R;


public class base1 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_base1,container, false);



        return view;

    }
}