package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text);
        ArrayList<String> stringList = new ArrayList<String>();
        String result = null;
        int i = 0;
        while(i <= 9){
            String str = null;
            if(i%3==0){
                str = String.valueOf(i) + "は3の倍数です";
            } else if(i%3==1){
                str = String.valueOf(i) + "は3の倍数ではありません";
            }
            stringList.add(str);
            i++;
        }

        for(String s : stringList){
            //Log.d("sの値:",s);
            try {
                //例外が起こる処理
                if (s.length() == 8) {
                    result += s + "\n";
                }
            }catch(NullPointerException e){
                //例外が起きた時の処理
                result+=e.getMessage()+"\n";
            }
        }
        textView.setText(result);
    }
}
