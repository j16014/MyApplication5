package com.example.countrysearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ErrorActivity extends AppCompatActivity {

    /*　作成者　長倉　*/

    Button movepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        movepage = (Button)findViewById(R.id.button5);
        movepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
