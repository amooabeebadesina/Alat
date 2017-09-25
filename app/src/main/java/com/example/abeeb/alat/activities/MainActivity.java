package com.example.abeeb.alat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.abeeb.alat.R;

public class MainActivity extends AbstractActivity {

    private Button login, sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.login);
        sign_up = (Button)findViewById(R.id.sign_up);
        getButtonActions();
    }

    private void launchRegisterActivity() {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    private void launchLoginActivity() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    private void getButtonActions() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLoginActivity();
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchRegisterActivity();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
