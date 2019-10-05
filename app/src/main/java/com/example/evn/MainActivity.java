package com.example.evn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.PipedInputStream;
import java.sql.PreparedStatement;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editEmail;
    private EditText editPass;
    private Button butLogin;
    private TextView txtRegisternow;
    private TextView txtLoginSatus;
    public static final String EMAIL="vietnt@gmail.com";
    public static final String PASS="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
   }
    void intView(){
        editEmail = findViewById(R.id.editEmail);
        editPass = findViewById(R.id.editPass);
        butLogin = findViewById(R.id.butLogin);
        txtRegisternow = findViewById(R.id.txtRegisternow);
        butLogin.setOnClickListener(this);
        txtRegisternow.setOnClickListener(this);
        txtLoginSatus =findViewById(R.id.txtLoginSatus);
    }

    @Override
    public void onClick(View viet) {
        switch (viet.getId()){
            case R.id.butLogin:
                handleLoginClicked();
                return;
            case R.id.txtRegisternow:
                handleRegisterClicked();
                return;
        }
    }
    void handleLoginClicked(){
        //Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
        String email = editEmail.getEditableText().toString();
        String pass = editPass.getEditableText().toString();
        if (email.equals("vietnt@gmail.com") && (pass.equals("123"))) {
            Intent intent = new Intent(this,
                    SecondActivity.class);
            intent.putExtra(EMAIL, email);
            intent.putExtra(PASS, pass);
            startActivity(intent);
        }else {
                txtLoginSatus.setVisibility(View.VISIBLE);
                txtLoginSatus.setText("Login Fail");
            }
        }
    void handleRegisterClicked(){
        //Toast.makeText(this, "Register Now", Toast.LENGTH_SHORT).show();
    }
}
