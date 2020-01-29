package com.example.venesuela.ui.login.ui.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.venesuela.link.links;
import com.example.venesuela.table.tables;
import com.example.venesuela.images.Images;
import imagineprojects.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button design= (Button) view.findViewById(R.id.design);
        Button list = (Button) view.findViewById(R.id.list);
        Button css = (Button) view.findViewById(R.id.css);
        Button base = (Button) view.findViewById(R.id.base);
        Button images = (Button) view.findViewById(R.id.images);
        Button text = (Button) view.findViewById(R.id.text);
        Button link = (Button) view.findViewById(R.id.link);
        Button table = (Button) view.findViewById(R.id.tables);
        Button comments = (Button) view.findViewById(R.id.comments);
        Button buttons = (Button) view.findViewById(R.id.buttons);

        SharedPreferences pref = this.getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);
   //     SharedPreferences pref = PreferencesManager.getDefaultSharedPreferences(context);
        String colorString = pref.getString("key", "#FFFFFF");
        int color = Color.parseColor(colorString);

 //       base.setBackgroundColor(color);

        base.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.base:
                        Intent a = new Intent(HomeFragment.this.getActivity(), com.example.venesuela.base.base.class);
                        startActivity(a);
                       // HashMap<string, string> contacts = YourActivityName.getContacts();
                        break;
                    default:
                        break;
                }
            }
        });
        images.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.images:
                        Intent b = new Intent(HomeFragment.this.getActivity(), Images.class);
                        startActivity(b);
                        break;
                    default:
                        break;

                }
            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.text:
                        Intent c = new Intent(HomeFragment.this.getActivity(), com.example.venesuela.text.text.class);
                        startActivity(c);
                        break;
                    default:
                        break;

                }
            }
        });
        table.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.tables:
                        Intent e = new Intent(HomeFragment.this.getActivity(), tables.class);
                        startActivity(e);
                        break;
                    default:
                        break;

                }
            }
        });

        link.setOnClickListener(new View.OnClickListener() {
@Override // HomeFragment   |   MainScreen
public void onClick(View v) {
        switch (v.getId()) {
        case R.id.link:
        Intent c = new Intent(HomeFragment.this.getActivity(), links.class);
        startActivity(c);
        break;
default:
        break;

        }
        }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.list:
                        Intent c = new Intent(HomeFragment.this.getActivity(), com.example.venesuela.list.list.class);
                        startActivity(c);
                        break;
                    default:
                        break;

                }
            }
        });

        css.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.css:
                        Intent c = new Intent(HomeFragment.this.getActivity(), com.example.venesuela.css.css.class);
                        startActivity(c);
                        break;
                    default:
                        break;

                }
            }
        });
        design.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.design:
                        Intent c = new Intent(HomeFragment.this.getActivity(), com.example.venesuela.design.design.class);
                        startActivity(c);
                        break;
                    default:
                        break;

                }
            }
        });
        comments.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.comments:
                        Intent c = new Intent(HomeFragment.this.getActivity(), com.example.venesuela.comments.comments.class);
                        startActivity(c);
                        break;
                    default:
                        break;

                }
            }
        });
        buttons.setOnClickListener(new View.OnClickListener() {
            @Override // HomeFragment   |   MainScreen
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttons:
                        Intent c = new Intent(HomeFragment.this.getActivity(), com.example.venesuela.buttons.buttons.class);
                        startActivity(c);
                        break;
                    default:
                        break;

                }
            }
        });

    }
   /* @Override
    public void onBackPressed(){
    //эмулируем нажатие на HOME, сворачивая приложение
    Intent i = new Intent(Intent.ACTION_MAIN);
    i.addCategory(Intent.CATEGORY_HOME);
    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(i);
}

    */

 /*   private static long back_pressed;

    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis())


           super.onBackPressed();


        else
            Toast.makeText(getContext(), "Press once again to exit!",
                    Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
    }



  */

}