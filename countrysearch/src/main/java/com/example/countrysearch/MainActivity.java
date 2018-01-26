package com.example.countrysearch;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    /* 国名入力項目 */
    private EditText nameT;
    /* 緯度入力項目 */
    private EditText idoT;
    /* 経度入力項目 */
    private EditText keidoT;
    /* 検索ボタン */
    private Button serch;
    /* 追加ボタン */
    private Button join;
    /* 削除ボタン */
    private Button delete;
    /* 更新ボタン */
    private Button change;
    /* 国名変数 */
    private String text;
    /* 緯度変数 */
    private String text2;
    /* 経度変数 */
    private String text3;

    /* 追加ボタンのClickリスナー */
    private View.OnClickListener join_ClickListener = new View.OnClickListener(){
        public void onClick(View v) {buttonJoin_Click(v);}};
    /* 削除ボタンのClickリスナー */
    private View.OnClickListener delete_ClickListener = new View.OnClickListener(){
        public void onClick(View v) {buttonDelete_Click(v);}};
    /* 選択ボタンのClickリスナー */
    private View.OnClickListener serch_ClickListener = new View.OnClickListener(){
        public void onClick(View v) {buttonSerch_Click(v);}};
    /* 更新ボタンのClickリスナー */
    private View.OnClickListener change_ClickListener = new View.OnClickListener(){
        public void onClick(View v) {buttonChange_Click(v);}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    	/* 画面項目を取得する */
        nameT = (EditText)findViewById(R.id.nameT);
        idoT = (EditText)findViewById(R.id.idoT);
        keidoT = (EditText)findViewById(R.id.keidoT);

        //ボタンにClickリスナーを設定する。
        serch = (Button)findViewById(R.id.button1);
        serch.setOnClickListener(serch_ClickListener);
        join = (Button)findViewById(R.id.button3);
        join.setOnClickListener(join_ClickListener);
        delete =(Button)findViewById(R.id.button4);
        delete.setOnClickListener(delete_ClickListener);
        change =(Button)findViewById(R.id.button2);
        change.setOnClickListener(change_ClickListener);

        // db情報表示
        dbDisplay();
    }

    /* 追加ボタンClick処理 */
    private void buttonJoin_Click(View v) {
        // 処理が成功か失敗か判定するretを定義
        long ret = -1;
        // 入力された値を取得
        text = nameT.getText().toString();
        text2 = idoT.getText().toString();
        text3 = keidoT.getText().toString();

        // 入力欄に入力されている場合に処理を実行
        if (text.length() != 0 && text2.length() != 0 && text3.length() != 0) {
            // 緯度と緯度の限界値を設定
            if(Double.parseDouble(text2)<=84&&Double.parseDouble(text2)>=-84&&Double.parseDouble(text3)<=180&&Double.parseDouble(text3)>=-180) {
                DatabaseHelper dbHelper = new DatabaseHelper(this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                //ContentValuesに値を入れる
                ContentValues values = new ContentValues();
                values.put("Name", text);
                values.put("Ido", Double.parseDouble(text2));
                values.put("Keido", Double.parseDouble(text3));

                // データベースに入力された値が登録されていないか確認
                long recodeCount = DatabaseUtils.queryNumEntries(db, "Mytable", "Name=?", new String[]{text});

                // 登録されていない場合
                if (recodeCount == 0) {
                    try {
                        // 追加処理
                        ret = db.insert("MyTable", null, values);

                        // db情報表示
                        dbDisplay();
                    } finally {
                        db.close();
                    }
                }
            }
        }
        // 結果トースト表示
        if (ret == -1) {
            Toast.makeText(this, "追加失敗", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "追加成功", Toast.LENGTH_SHORT).show();
        }
    }

    /* 削除ボタンClick処理 */
    private void buttonDelete_Click(View v){
        // 処理が成功か失敗か判定するretを定義
        long ret = -1;
        // 入力された値を取得
        text =  nameT.getText().toString();

        // 入力欄に入力されている場合に処理を実行
        if(text.length()!=0) {
            DatabaseHelper dbHelper = new DatabaseHelper(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            //ContentValuesに値を入れる
            ContentValues val = new ContentValues();
            val.put("name", text);

            // データベースに入力された値が登録済みか確認
            long recodeCount = DatabaseUtils.queryNumEntries(db, "Mytable", "Name=?", new String[]{text});

            // 登録済みの場合
            if (recodeCount == 1) {
                try {
                    // 削除処理
                    ret = db.delete("MyTable", "NAME= ?", new String[]{text});

                    // db情報表示
                    dbDisplay();
                } finally {
                    db.close();
                }
            }
        }
        // 結果トースト表示
        if (ret == -1) {
            Toast.makeText(this, "削除失敗", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "削除成功", Toast.LENGTH_SHORT).show();
        }
    }

    /* 検索ボタンClick処理 */
    private void buttonSerch_Click(View v){
        // 処理が成功か失敗か判定するretを定義
        long ret = -1;
        // 入力された値を取得
        text = nameT.getText().toString();

        // 入力欄に入力されている場合に処理を実行
        if(text.length()!=0) {
            DatabaseHelper dbHelper = new DatabaseHelper(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            Cursor c;

            // データベースに入力された値が登録済みか確認
            long recodeCount = DatabaseUtils.queryNumEntries(db, "Mytable", "Name=?", new String[]{text});

            // 登録済みの場合
            if (recodeCount == 1) {
                ret = 1;
                try {
                    // 検索処理
                    c = db.rawQuery("select * from Mytable where Name = ?", new String[]{text});

                    if (c.moveToFirst()) {
                        do {
                            text2 = c.getString(c.getColumnIndex("Ido"));
                            text3 = c.getString(c.getColumnIndex("Keido"));
                        } while (c.moveToNext());
                    }
                } finally {
                    db.close();
                }
                Intent intent = new Intent(getApplication(), MapsActivity.class);
                intent.putExtra("name", text);
                intent.putExtra("ido", text2);
                intent.putExtra("keido", text3);
                startActivity(intent);
                text2 = null;
                text3 = null;
            }
        }
        // 検索失敗画面表示
        if (ret == -1) {
            Intent intent = new Intent(getApplication(), ErrorActivity.class);
            startActivity(intent);
        }
    }

    /* 更新ボタンClick処理 */
    private void buttonChange_Click(View v){
        // 処理が成功か失敗か判定するretを定義
        long ret = -1;
        // 入力された値を取得
        text = nameT.getText().toString();
        text2 = idoT.getText().toString();
        text3 = keidoT.getText().toString();

        // 入力欄に入力されている場合に処理を実行
        if (text.length() != 0 && text2.length() != 0 && text3.length() != 0) {
            // 緯度と緯度の限界値を設定
            if(Double.parseDouble(text2)<=84&&Double.parseDouble(text2)>=-84&&Double.parseDouble(text3)<=180&&Double.parseDouble(text3)>=-180) {
                DatabaseHelper dbHelper = new DatabaseHelper(this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                //ContentValuesに値を入れる
                ContentValues values = new ContentValues();
                values.put("Name", text);
                values.put("Ido", Double.parseDouble(text2));
                values.put("Keido", Double.parseDouble(text3));

                // データベースに入力された値が登録済みか確認
                long recodeCount = DatabaseUtils.queryNumEntries(db, "Mytable", "Name=?", new String[]{text});

                // 登録済みの場合
                if (recodeCount == 1) {
                    try {
                        // 更新処理
                        ret = db.update("MyTable", values, "Name=?", new String[]{text});

                        // db情報表示
                        dbDisplay();
                    } finally {
                        db.close();
                    }
                }
            }
        }
        // 結果トースト表示
        if (ret == -1){
            Toast.makeText(this,"変更失敗",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"変更成功",Toast.LENGTH_SHORT).show();
        }
    }

    /* データベース表示処理 */
    public void dbDisplay(){
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        // rawQueryというSELECT専用メソッドを使用してデータを取得する
        Cursor c = db.rawQuery("select * from Mytable", null);
        // Cursorの先頭行があるかどうか確認
        boolean next = c.moveToFirst();

        // 最終的に表示する文字列
        String dispStr = "";
        // 取得した全ての行を取得
        while (next) {
            // 取得したカラムの順番(0から始まる)と型を指定してデータを取得する
            String rowdata = String.valueOf(c.getInt(0)) + " : ";// idを取得
            rowdata += c.getString(1) + " ( ";// nameを取得
            rowdata += String.valueOf(c.getDouble(2)) + " , ";// idoを取得
            rowdata += String.valueOf(c.getDouble(3)) + " ) ";// keidoを取得
            dispStr += rowdata + "\n";// \nは改行を表し、複数行取れた場合に一行ごとに改行するため
            // 次の行が存在するか確認
            next = c.moveToNext();
        }
        dispStr += "取得完了";

        // TextViewに取得したデータを表示
        ((TextView) findViewById(R.id.searchText)).setText(dispStr);
    }
}

