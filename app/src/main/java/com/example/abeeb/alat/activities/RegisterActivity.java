package com.example.abeeb.alat.activities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.abeeb.alat.R;

public class RegisterActivity extends AbstractActivity {

    Button start;
    EditText country_code, phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        start = (Button)findViewById(R.id.start);
        country_code = (EditText) findViewById(R.id.country_code);
        phone_number = (EditText) findViewById(R.id.phone_number);


        //        I don;t know where to pass the country code and phone number data to.. Guess that will be the work of API and server


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                continueRegisterActivity();

            }
        });

    }

    private void continueRegisterActivity() {
        Intent intent = new Intent(RegisterActivity.this, Regiister2Activity.class);
        startActivity(intent);
    }

}
