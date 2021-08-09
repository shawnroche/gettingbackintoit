package com.example.gettingbackintiit;

import android.app.ProgressDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText email, password;
    private Button loginBTN;
    private TextView loginQn;

    private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginBTN = findViewById(R.id.loginBTN);
        loginQn = findViewById(R.id.loginQn);

        mAuth = FirebaseAuth.getInstance();
        progressBar = new ProgressBar(this);

        loginQn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailString = email.getText().toString();
                String passwordString = password.getText().toString();

                if (TextUtils.isEmpty(emailString)){
                    email.setError("Email is required");
                }
                if (TextUtils.isEmpty(passwordString)){
                    email.setError("Password is required");
                }
                else {
                    //progressBar.setMessage("Login in Progress")
                }
            }
        });
    }
}