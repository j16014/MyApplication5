package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button =(Button)findViewById(R.id.button);
        final TextView textView =(TextView)findViewById(R.id.text);
        textView.setText("ねこ");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //画像をタップした時の処理
                MediaPlayer mediaPlayer=
                        MediaPlayer.create(getApplicationContext(), R.raw.meow);
                mediaPlayer.start();
            }
        });
    }
}
