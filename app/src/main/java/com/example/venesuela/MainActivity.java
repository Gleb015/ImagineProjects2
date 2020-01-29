package com.example.venesuela;

import android.os.Bundle;

import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.venesuela.ui.main.txt.SectionsPagerAdapter_Stylecss;
import com.google.android.material.tabs.TabLayout;

import imagineprojects.R;

public class MainActivity extends AppCompatActivity //implements View.OnClickListener
{
    private final static String FILENAME = "sample.txt"; // имя файла
    private EditText mEditText;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.editText_html);

        SectionsPagerAdapter_Stylecss sectionsPagerAdapter_Stylecss = new SectionsPagerAdapter_Stylecss(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_main);
        viewPager.setAdapter(sectionsPagerAdapter_Stylecss);
        TabLayout tabs = findViewById(R.id.tabs_main);
        tabs.setupWithViewPager(viewPager);

       /* EditText editText_html = (EditText) findViewById(R.id.editText_html);
        EditText  editText_js = (EditText) findViewById(R.id.editText_js);
        EditText  editText_css = (EditText) findViewById(R.id.editText_css);

        Button btn_main_activity = (Button) findViewById(R.id.btn_main_activity);
        btn_main_activity.setOnClickListener(this);

        Button   btn_main_activity2 = (Button) findViewById(R.id.btn_main_activity2);
        btn_main_activity2.setOnClickListener(this);

        loadText();

        */
    }
/*
    EditText etText;
    Button btnSave, btnLoad;

    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";


    /** Called when the activity is first created.



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_activity:
                saveText();
                break;
            case R.id.btn_main_activity2:
                loadText();
                break;
            default:
                break;
        }
    }

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText.getText().toString());
        ed.commit();
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText.setText(savedText);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            startActivity(new Intent((MainActivity.this), MainScreen.class));
            return false;
        }
        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_open:
                openFile(FILENAME);
                return true;
            case R.id.action_save:
                saveFile(FILENAME);
                return true;
            default:
                return true;
        }
    }

    // Метод для открытия файла
    private void openFile(String fileName) {
        try {
            InputStream inputStream = openFileInput(fileName);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    builder.append(line + "\n");
                }

                inputStream.close();
                mEditText.setText(builder.toString());
            }
        } catch (Throwable t) {
            Toast.makeText(getApplicationContext(),
                    "Exception: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }

    // Метод для сохранения файла
    private void saveFile(String fileName) {
        try {
            OutputStream outputStream = openFileOutput(fileName, 0);
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            osw.write(mEditText.getText().toString());
            osw.close();
        } catch (Throwable t) {
            Toast.makeText(getApplicationContext(),
                    "Exception: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }@Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }
*/
}


