package com.example.venesuela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.venesuela.ui.login.LoginActivity;
import com.example.venesuela.ui.login.LoginWithGoogle;

import imagineprojects.R;

public class Registration extends AppCompatActivity {
private EditText username1, password1;
private static final String MY_SETTINGS = "my_settings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

       username1=(EditText)findViewById(R.id.username1);
        password1=(EditText)findViewById(R.id.password1);
        final TextView btn_registration2 = findViewById(R.id.btn_reg2);
        final TextView btn_registration = findViewById(R.id.btn_reg1);
        // Принимаем имя
        String e = getIntent().getStringExtra("Логин:");

// Принимаем фамилию
        String e2 = getIntent().getStringExtra("Пароль:");

// выводим принятое имя
        username1.setText(username1.getText().toString()+ " " +e );

// Выводим принятую фамилию

        password1.setText(password1.getText().toString() + " " + e2);

        btn_registration.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            //Создаем обратный переход по нажатию на кнопку "Назад":
            Intent intent = new Intent((Registration.this), LoginActivity.class);

            startActivity(intent);
            SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                    Context.MODE_PRIVATE);
            // проверяем, первый ли раз открывается программа
            boolean hasVisited = sp.getBoolean("hasVisited", false);
            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", false);
            e.commit();
        }
        });

        btn_registration2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this, LoginWithGoogle.class);
                startActivity(intent);

            }
        });

}
}
