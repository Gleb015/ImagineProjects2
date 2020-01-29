package com.example.venesuela.ui.login.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.venesuela.MainActivity;
import imagineprojects.R;
import com.example.venesuela.Settings;


public class DashboardFragment extends Fragment {
    private DashboardViewModel dashboardViewModel;
    private ImageView settings_profile;
    private EditText passwordEditText, usernameEditText;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

     /*   ImageButton settings_profile = view.findViewById(R.id.settings_profile);


        settings_profile.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.settings_profile:
                  //      Intent a = new Intent(DashboardFragment.this.getActivity(), Settings.class);
                    //    startActivity(a);
                        break;
                    default:
                        break;
                }
            }
        });

      */

        //    dashboardViewModel.getText().observe(this, new Observer<String>() {
        //        @Override
        //         public void onChanged(@Nullable String s) {
        //   textView.setText(s);
        //          }
        //      });
        return root;
    }
       @Override
        public void onViewCreated(View view, Bundle savedInstanceState){
            super.onViewCreated(view, savedInstanceState);
           settings_profile =(ImageView) view.findViewById(R.id.settings_profile);

           Button btn_code_editor=(Button) view.findViewById(R.id.btn_code_editor);

           passwordEditText = (EditText) view.findViewById(R.id.password);
           usernameEditText = (EditText) view.findViewById(R.id.username);

           settings_profile.setOnClickListener(new View.OnClickListener() {
                @Override // HomeFragment   |   MainScreen
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.settings_profile:
                            Intent h = new Intent(DashboardFragment.this.getActivity(), Settings.class);
                        //    h.putExtra("", usernameEditText.getText().toString());
                        //    h.putExtra("", passwordEditText.getText().toString());
                            startActivity(h);
                            break;

                        default:
                            break;
                    }
                }
            });
           btn_code_editor.setOnClickListener(new View.OnClickListener() {
               @Override // HomeFragment   |   MainScreen
               public void onClick(View v) {
                   switch (v.getId()) {
                       case R.id.btn_code_editor:
                           Intent h = new Intent(DashboardFragment.this.getActivity(), MainActivity.class);
                           //    h.putExtra("", usernameEditText.getText().toString());
                           //    h.putExtra("", passwordEditText.getText().toString());
                           startActivity(h);
                           break;

                       default:
                           break;
                   }
               }
           });

        }
    }




