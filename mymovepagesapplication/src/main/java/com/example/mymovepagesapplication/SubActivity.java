package com.example.mymovepagesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String helloT = intent.getStringExtra("hello");
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(helloT);
    }
}
