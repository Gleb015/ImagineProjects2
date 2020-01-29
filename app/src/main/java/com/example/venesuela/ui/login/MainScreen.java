package com.example.venesuela.ui.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import imagineprojects.R;

public class MainScreen extends AppCompatActivity {
private Button btn_base6_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();

                btn_base6_1= (Button) findViewById(R.id.btn_base6_1);



      //  ((Button) findViewById(R.id.base)).setCompoundDrawablesWithIntrinsicBounds(
        //        AppCompatResources.getDrawable(this, R.drawable.html5), null, null, null);
     NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    //    NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
       NavigationUI.setupWithNavController(navView, navController);

    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            startActivity(new Intent((MainScreen.this), LoginActivity.class));
            return false;
        }
        return true;

    }
 /*   @Override
            public class onClick(View view){

                        if(keyCode == KeyEvent.KEYCODE_BACK)
                        {

                            return true;
                        }

                }

  */

    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        openQuitDialog();
    }

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                MainScreen.this);
        quitDialog.setTitle("Выход: Вы уверены?");

        quitDialog.setPositiveButton("Таки да!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                finish();
            }
        });

        quitDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
            }
        });

        quitDialog.show();
    }

    }

  /* public void onClick(View v) {
        switch (v.getId()) {
            case 0:
               if (btn_base6_1 == null){
                   TextView images = (TextView) findViewById(R.id.images);
                   images.setClickable(false);
               }
               else{
                   TextView images = (TextView) findViewById(R.id.images);
                   images.setClickable(true);
               }
                break;
            default:
                break;

        }

    }

   */



