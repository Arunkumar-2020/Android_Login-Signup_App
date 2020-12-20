package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView text1;
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        text1 = (TextView)findViewById(R.id.text1);
        text3 = (TextView)findViewById(R.id.text3);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        String str1 = intent.getStringExtra("message1");
        text1.setText(str);
        text3.setText(str1);
    }
}