package com.example.mysqlapplication;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /* 名前入力項目 */
    private EditText nameT;
    /* 身長入力項目 */
    private EditText heightT;
    /* 体重入力項目 */
    private EditText weightT;
    /* Selectボタン */
    private Button selectB;
    /* Insertボタン */
    private Button insertB;
    /* Deleteボタン */
    private Button deleteB;
    /* 結果出力項目 */
    private TextView resultTV;

    private int no;

    /* InsertボタンのClickリスナー */
    private OnClickListener insertB_ClickListener = new OnClickListener(){
        public void onClick(View v) {buttonInsert_Click(v);}};
    /* DeleteボタンのClickリスナー */
    private OnClickListener deleteB_ClickListener = new OnClickListener(){
        public void onClick(View v) {buttonDelete_Click(v);}};
    /* SelectボタンのClickリスナー */
    private OnClickListener selectB_ClickListener = new OnClickListener(){
        public void onClick(View v) {buttonSelect_Click(v);}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    	/* 画面項目を取得する */
        nameT = (EditText)findViewById(R.id.nameT);
        heightT = (EditText)findViewById(R.id.heightT);
        weightT = (EditText)findViewById(R.id.weightT);
        resultTV = (TextView)findViewById(R.id.resultTv);

        //ボタンにClickリスナーを設定する。
        selectB = (Button)findViewById(R.id.selectB);
        selectB.setOnClickListener(selectB_ClickListener);
        insertB = (Button)findViewById(R.id.insertB);
        insertB.setOnClickListener(insertB_ClickListener);
        deleteB =(Button)findViewById(R.id.deleteB);
        deleteB.setOnClickListener(deleteB_ClickListener);
    }

    /*
     * InsertボタンClick処理
     */
    private void buttonInsert_Click(View v){
        ContentValues values = new ContentValues();
        values.put("Name", nameT.getText().toString());
        values.put("Height", Double.parseDouble(heightT.getText().toString()));
        values.put("Weight", Double.parseDouble(weightT.getText().toString()));

        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        long ret;
        try {
            ret = db.insert("MyTable", null, values);
        } finally {
            db.close();
        }
        if (ret == -1) {
            Toast.makeText(this,"Insert失敗",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Insert成功",Toast.LENGTH_SHORT).show();
        }
    }


    /* DeleteボタンClick処理 */
    private void buttonDelete_Click(View v){
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        int ret;
        try {
            ret = db.delete("MyTable", null,null);
        } finally {
            db.close();
        }
        if (ret == -1){
            Toast.makeText(this,"Delete失敗",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Delete成功",Toast.LENGTH_SHORT).show();
        }
    }

    /* SelectボタンClick処理 */
    private void buttonSelect_Click(View v){
        String[] columns = new String[]{"No","Name","Height","Weight"};

        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor ret;
        String result = "";

        try {
            ret = db.query("MyTable",columns,null,null,null,null,null);
            if (ret.moveToFirst()){
                do{
                    result += "No:" + ret.getInt(ret.getColumnIndex("No"))
                            + "Name:" + ret.getString(ret.getColumnIndex("Name"))
                            + "Height:" + String.valueOf(ret.getDouble(ret.getColumnIndex("Height")))
                            + "Weight:" + String.valueOf(ret.getDouble(ret.getColumnIndex("Weight")))
                            +"\n";

                }while(ret.moveToNext());
            }
        } finally {
            db.close();
        }
        resultTV.setText(result);
    }
}
