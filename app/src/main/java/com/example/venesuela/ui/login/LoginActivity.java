package com.example.venesuela.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import imagineprojects.R;
import com.example.venesuela.Registration;
import com.example.venesuela.Settings;

public class LoginActivity extends AppCompatActivity // implements  View.OnClickListener
{
    private static final String MY_SETTINGS = "my_settings";
    private EditText passwordEditText, usernameEditText;
    public SharedPreferences sPref, sPref2;
    final String SAVED_TEXT = "saved_text";
    private LoginViewModel loginViewModel;
    //  private sharedPreferencesStatusNews news;
    //  private lateinit var = sharedPreferencesNews


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // private void checkFirstStart(){

         //   SharedPreferences sp = getSharedPreferences("hasVisited",
         //       Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа (Если вход первый то вернет false)
        //      boolean hasVisited = sp.getBoolean("hasVisited", false);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisited", false);
        boolean passwordEditText2 = sp.getBoolean("hasVisited", false);
        boolean usernameEditText2 = sp.getBoolean("hasVisited", false);
      //  Settings mainActivity = (Settings) this.activity_settings;
        TextView ed = (TextView) findViewById(R.id.log_out);
               // Settings.

        if (!hasVisited) {
            // Сработает если Вход первый

            //Ставим метку что вход уже был
            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit(); //После этого hasVisited будет уже true и будет означать, что вход уже был

            //Ниже запускаем активность которая нужна при первом входе

        } else if (ed != null){

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", false);
            e.commit();
        }

        else{
            startActivity(new Intent((LoginActivity.this), MainScreen.class));
        }


          /*  if (!hasVisited) {
                // Сработает если Вход первый

                //Ставим метку что вход уже был
                SharedPreferences.Editor e = sp.edit();
                e.putBoolean("hasVisited", true);
                e.commit(); //После этого hasVisited будет уже true и будет означать, что вход уже был

                //Ниже запускаем активность которая нужна при первом входе

            }else {

                //Сработает если вход в приложение уже был
                //Ниже запускаем активность которая нужна при последующих входах
            }

           */
      /*  if (!hasVisited) {
            // выводим нужную активность
            startActivity(new Intent((LoginActivity.this), LoginActivity.class));
            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit(); // не забудьте подтвердить изменения
        }

       */

/*        Class<?> activityClass;

           try {
               SharedPreferences prefs = getSharedPreferences("X", MODE_PRIVATE);
               activityClass = Class.forName(
                       prefs.getString("lastActivity", MainScreen.class.getName()));
           } catch (ClassNotFoundException ex) {
               activityClass = MainScreen.class;

           }

 */
        loginViewModel = ViewModelProviders.of(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);


        //  if ((usernameEditText.getText().toString().equals("йй")) &&
        //           passwordEditText.getText().toString().equals("йй")) {

         /*   Class<?> activityClass;
            try {
                SharedPreferences prefs = getSharedPreferences("X", MODE_PRIVATE);
                activityClass = Class.forName(
                        prefs.getString("lastActivity", MainScreen.class.getName()));
            } catch (ClassNotFoundException ex) {
                activityClass = MainScreen.class;

            }
            startActivity(new Intent((LoginActivity.this), MainScreen.class));
          */
        //    }
        //    final EditText usernameEditText = findViewById(R.id.username);
        //   final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        final TextView btn_registration = findViewById(R.id.btn_registration);
        final TextView btn_registration2 = findViewById(R.id.btn_registration2);
        final ProgressBar loadingProgressBar = findViewById(R.id.loading);
        passwordEditText = (EditText) findViewById(R.id.password);
        usernameEditText = (EditText) findViewById(R.id.username);

        //loadText();

        //Button loginButton = (Button)findViewById(R.id.login);
        ;
        loginViewModel.getLoginFormState().observe(this, new Observer<LoginFormState>() {
            @Override
            public void onChanged(@Nullable LoginFormState loginFormState) {
                if (loginFormState == null) {
                    return;
                }
                loginButton.setEnabled(loginFormState.isDataValid());
                if (loginFormState.getUsernameError() != null) {
                    usernameEditText.setError(getString(loginFormState.getUsernameError()));
                }
                if (loginFormState.getPasswordError() != null) {
                    passwordEditText.setError(getString(loginFormState.getPasswordError()));
                }
            }
        });

        loginViewModel.getLoginResult().observe(this, new Observer<LoginResult>() {
            @Override
            public void onChanged(@Nullable LoginResult loginResult) {
                if (loginResult == null) {
                    return;
                }
                loadingProgressBar.setVisibility(View.GONE);
                if (loginResult.getError() != null) {
                    showLoginFailed(loginResult.getError());
                }
                if (loginResult.getSuccess() != null) {
                    updateUiWithUser(loginResult.getSuccess());
                }
                setResult(Activity.RESULT_OK);

                //Complete and destroy login activity once successful
                finish();
            }
        });

        TextWatcher afterTextChangedListener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // ignore
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // ignore
            }

            @Override
            public void afterTextChanged(Editable s) {
                loginViewModel.loginDataChanged(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        };
        usernameEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    loginViewModel.login(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString());
                }
                return false;
            }
        });
//loginButton

        btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, Registration.class);
                intent.putExtra("Логин:", usernameEditText.getText().toString());

                intent.putExtra("Пароль:", passwordEditText.getText().toString());
                startActivity(intent);
                Intent e = new Intent(LoginActivity.this, Settings.class);
                e.putExtra("Логин:", usernameEditText.getText().toString());

                e.putExtra("Пароль:", passwordEditText.getText().toString());


            }
        });
        btn_registration2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, LoginWithGoogle.class);
                startActivity(intent);

            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //      loadingProgressBar.setVisibility(View.VISIBLE);
                //   loginViewModel.login(usernameEditText.getText().toString(),
                //         passwordEditText.getText().toString());
                // Intent intent = new Intent((LoginActivity.this), MainScreen.class);
                // startActivity(intent);
                if ((usernameEditText.getText().toString().equals("йй")) &&
                        passwordEditText.getText().toString().equals("йй")) {
                    Intent e = new Intent(LoginActivity.this, Settings.class);
                    e.putExtra("Логин:", usernameEditText.getText().toString());

                    e.putExtra("Пароль:", passwordEditText.getText().toString());

                    startActivity(new Intent((LoginActivity.this), MainScreen.class));

                    //     activityClass = MainScreen.class;
                    //                  startActivity(new Intent((LoginActivity.this), MainScreen.class));


                }
            }
        });

    }


    private void updateUiWithUser(LoggedInUserView model) {
        String welcome = getString(R.string.welcome) + model.getDisplayName();
        // TODO : initiate successful logged in experience
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
    }

    private void showLoginFailed(@StringRes Integer errorString) {
        Toast.makeText(getApplicationContext(), errorString, Toast.LENGTH_SHORT).show();
    }

}
    //TODO


    /*  void saveText() {
          sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
      //  Intent intent = new Intent((LoginActivity.this), MainScreen.class);
       // startActivity(intent);
        // ed.putString("lastActivity", getClass().getName());
          ed.putString(SAVED_TEXT, usernameEditText.getText().toString());
          ed.commit();

       //   SharedPreferences.Editor ed = sPref.edit();
        //  ed.putString("lastActivity", getClass().getName());
       //   ed.commit();
      }

     */
    /*void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, usernameEditText.getText().toString());
        ed.commit();
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();

        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed2 = sPref2.edit();
        ed2.putString(SAVED_TEXT, passwordEditText.getText().toString());
        ed2.commit();

    }

     */

      /*  sPref = getPreferences(MODE_PRIVATE);
        ed.commit();
        SharedPreferences.Editor ed2 = sPref.edit();
        ed2.putString(SAVED_TEXT, usernameEditText.getText().toString());
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();

       */


   /* void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        usernameEditText.setText(savedText);


        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText2 = sPref2.getString(SAVED_TEXT, "");
        passwordEditText.setText(savedText2);

*/

/*
        sPref = getPreferences(MODE_PRIVATE);
        String savedText2 = sPref.getString(SAVED_TEXT, "");
        passwordEditText.setText(savedText2);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();

 */




 /*   @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }

  */




   /* EditText etText, etText2;
    Button btnSave, btnLoad;

    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";


    /** Called when the activity is first created. */
   /*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etText = (EditText) findViewById(R.id.username);
        etText2 = (EditText) findViewById(R.id.password);

        btnSave = (Button) findViewById(R.id.login);
        btnSave.setOnClickListener(this);
        final ProgressBar loadingProgressBar = findViewById(R.id.loading);
       // btnLoad = (Button) findViewById(R.id.btnLoad);
      //  btnLoad.setOnClickListener(this);
    }
TODO
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                if((etText != null) & (etText2 != null)) {
                    saveText();
                    loadText();
                    btnSave.setClickable(true);
                    Intent intent = new Intent((LoginActivity.this), MainScreen.class);
                    startActivity(intent);
                    break;
                }else
                {
                    btnSave.setClickable(false);
                    Toast.makeText(this, "Error 404: not found", Toast.LENGTH_SHORT).show();
                }
                    default:
                        break;

        }
    }

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText.getText().toString());

        sPref = getPreferences(MODE_PRIVATE);
        ed.commit();
        SharedPreferences.Editor ed2 = sPref.edit();
        ed2.putString(SAVED_TEXT, etText2.getText().toString());
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText.setText(savedText);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();


        sPref = getPreferences(MODE_PRIVATE);
        String savedText2 = sPref.getString(SAVED_TEXT, "");
        etText2.setText(savedText2);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();

    }


    */

