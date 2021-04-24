package com.example.aplikasifragment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasifragment.Preferences;
import com.example.aplikasifragment.R;

public class MainActivity extends AppCompatActivity {

    EditText etUsername;
    Button btnSubmit;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        btnSubmit = findViewById(R.id.btnSubmit);

        sharedPreferences = getSharedPreferences(Preferences.getSharedPrefName(), MODE_PRIVATE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etUsername.getText().toString())){
                    etUsername.setError("Nama tidak boleh kosong!");
                }
                else{
                    Preferences.setRegisteredUser(getApplicationContext(),etUsername.getText().toString());

                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                    finish();
                }

            }
        });

    }
}