package com.example.venesuela.comments.ui.main;

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
public class PlaceholderFragment extends Fragment {

    public class PlaceholderFragment_css extends Fragment {


        @Override
        public View onCreateView(
                @NonNull LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.fragment_comment1, container, false);

            return root;
        }
    }
}