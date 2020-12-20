package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView text1;
    TextView text3;
    TextView text5;

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        text1 = (TextView) findViewById(R.id.text1);
        text3 = (TextView) findViewById(R.id.text3);
        text5 = (TextView) findViewById(R.id.text5);

        back = (Button) findViewById(R.id.button1);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        String str1 = intent.getStringExtra("message1");
        String str2 = intent.getStringExtra("message2");
        text1.setText(str);
        text3.setText(str1);
        text5.setText(str2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }

        });
    }

}