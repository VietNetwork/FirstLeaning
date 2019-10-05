package com.example.evn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String email = getIntent().getStringExtra(MainActivity.EMAIL);
        String pass = getIntent().getStringExtra(MainActivity.PASS);

        String reultFormat = String.format("%s - %s", email, pass);
        ((TextView) findViewById(R.id.txtresult)).setText(reultFormat);

    }
}
