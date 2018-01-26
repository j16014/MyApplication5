package com.example.mymovemap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String text,text2,text3;
    EditText editText,editText2,editText3;
    Button movePagesButtonS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        movePagesButtonS = (Button)findViewById(R.id.button);
        movePagesButtonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.length()!=0&&editText2.length()!=0) {
                    text =  editText.getText().toString();
                    text2 = editText2.getText().toString();
                    text3 = editText3.getText().toString();

                    Intent intent = new Intent(getApplication(), MapsActivity.class);
                    intent.putExtra("ido", text);
                    intent.putExtra("keido", text2);
                    intent.putExtra("title", text3);
                    startActivity(intent);
                }
            }
        });
    }
}

