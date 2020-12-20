package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

        EditText edit;
        EditText edit2;
        EditText edit3;
        Button signin;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_signup);

            edit = (EditText)findViewById(R.id.edittext);
            edit2 = (EditText)findViewById(R.id.edittext2);
            edit3 = (EditText)findViewById(R.id.edittext3);

            signin = (Button)findViewById(R.id.button1);

            signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = edit.getText().toString();
                    String str1 = edit2.getText().toString();
                    String str2 = edit3.getText().toString();

                    Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                    intent.putExtra("message", str);
                    intent.putExtra("message1", str1);
                    intent.putExtra("message2", str2);


                    startActivity(intent);
                }

            });

        }
    }