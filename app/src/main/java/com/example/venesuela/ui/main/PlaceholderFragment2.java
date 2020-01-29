package com.example.venesuela.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import imagineprojects.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment2 extends Fragment {


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_image1, container, false);

        return root;
    }
}