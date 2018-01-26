package com.example.j16014.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView)findViewById(R.id.text);
        /*String s = String.valueOf(tasizan(100));
        String s1 = String.valueOf(tasizan(1000));
        String s2 = String.valueOf(tasizan(10000));
        textView.setText("1から100を足した値は"+s+"です"+"\n"+
                "1から100を足した値は"+s1+"です"+"\n"+
                "1から100を足した値は"+s2+"です");
        */

        textView.setText("1から100を足した値は"+String.valueOf(tasizan(100))+"です"+"\n"+
                "1から100を足した値は"+String.valueOf(tasizan(1000))+"です"+"\n"+
                "1から100を足した値は"+String.valueOf(tasizan(10000))+"です");
    }
    public int tasizan(int j) {
        int result=0;
        for (int i = 1; i <= j; i++) {
            result += i;
        }
        return result;
    }
}
