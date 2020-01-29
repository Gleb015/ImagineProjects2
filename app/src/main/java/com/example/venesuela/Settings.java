package com.example.venesuela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.example.venesuela.ui.login.LoginActivity;

import imagineprojects.R;

public class Settings extends AppCompatActivity implements View.OnClickListener{
    private TextView txt_settings1, txt_settings2;
    private Button log_out;
    //private Button ;
    private static final int SHORT_DELAY = 2000;
    private static final String MY_SETTINGS = "my_settings";
    private TextView txt_settings_vers1, version, txt_name_company;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        log_out = (Button) findViewById(R.id.log_out);

       // txt_settings1= (TextView) findViewById(R.id.txt_settings1);
       // txt_settings2= (TextView) findViewById(R.id.txt_settings2);
        log_out.setOnClickListener(this);
      String k = getIntent().getStringExtra("Логин:");

// Принимаем фамилию
     String k2 = getIntent().getStringExtra("Пароль:");

// выводим принятое имя
    // txt_settings1.setText(txt_settings1.getText().toString()+ " " +k );

// Выводим принятую фамилию

     //  txt_settings2.setText(txt_settings2.getText().toString() + " " + k2);
final Switch switch_notification=(Switch) findViewById(R.id.switch_notification);
     /*   switch_notification.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              if(switch_notification != null){
                  Toast toast = Toast.makeText(getApplicationContext(),
                          "Уведолмления включены",
                          Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show(); }
              else{
                  Toast toast = Toast.makeText(getApplicationContext(),
                          "Уведолмления выключены",
                          Toast.LENGTH_SHORT);

                  toast.setGravity(Gravity.CENTER, 0, 0);
                  toast.show();
              }
            }
            });

      */
        String s = getString(R.string.Version);
        String e1 = "<font color='#00FF00'>M</font>";
        String e2 = "<font color='#FFD700'>I</font>";
        String e3 = "<font color='#FF0000'>G</font>";
        String e4 = "<font color='#00A1EB'>L</font>";
        String e5 = "<font color='#FF00FF'>A</font>";
        String e6 = "<font color='#00FFFF'>N</font>";
        String e7 = "<font color='#0000FF'>D</font>";
        String e = e1+e2+e3+e4+e5+e6+e7;
       // txt_name_company = (TextView) findViewById(R.id.txt_name_company);
    txt_settings_vers1 = (TextView) findViewById(R.id.txt_settings_vers1);
  //  version = (TextView) findViewById(R.id.Version);
      //  txt_name_company.setText(Html.fromHtml(e));
        txt_settings_vers1.setText(
                 "Версия приложения: "+ s
        );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.log_out:
                Intent intent = new Intent((Settings.this), LoginActivity.class);

                startActivity(intent);
                SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                        Context.MODE_PRIVATE);
                // проверяем, первый ли раз открывается программа
                boolean hasVisited = sp.getBoolean("hasVisited", false);
           SharedPreferences.Editor e = sp.edit();
              e.putBoolean("hasVisited", false);
                e.clear();
                e.commit();
        //        SharedPreferences preferences = getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE);
           //     SharedPreferences.Editor editor = preferences.edit();

                break;
            default:
                break;

        }
    }


}
