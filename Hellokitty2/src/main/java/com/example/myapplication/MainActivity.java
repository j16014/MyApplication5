package com.example.myapplication;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int flag=0,i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Cat and Dogs");
        setContentView(R.layout.activity_main);
        final Button button =(Button)findViewById(R.id.button);
        final TextView textView =(TextView)findViewById(R.id.text);
        final TextView textView2 =(TextView)findViewById(R.id.text2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //画像をタップした時の処理
                if(flag==0){
                    textView.setText("いぬ");
                    button.setBackgroundResource(R.drawable.image_dog);
                    textView.setTextColor(Color.RED);
                    flag=1;
                }else{
                    textView.setText("ねこ");
                    button.setBackgroundResource(R.drawable.kitty);
                    textView.setTextColor(Color.BLUE);
                    flag=0;
                }
                i++;
                //MediaPlayer mediaPlayer=
                //        MediaPlayer.create(getApplicationContext(), R.raw.meow);
                //mediaPlayer.start();
                textView2.setText(i+"回");
                setTitle("a");

                //getTextを使ってネコならイヌ、イヌならネコに切り替えるようにしてもいい

            }
        });
    }
}
