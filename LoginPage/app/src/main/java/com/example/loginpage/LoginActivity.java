package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edittext1;
    EditText edittext2;
    Button login;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edittext1 = (EditText)findViewById(R.id.edittext1);
        edittext2 = (EditText)findViewById(R.id.edittext2);
        login = (Button)findViewById(R.id.button1);
        signup = (Button)findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edittext1.getText().toString();
                String str1 = edittext2.getText().toString();

                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                intent.putExtra("message", str);
                intent.putExtra("message1", str1);


                startActivity(intent);
            }

        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(intent);
            }

        });
    }
}