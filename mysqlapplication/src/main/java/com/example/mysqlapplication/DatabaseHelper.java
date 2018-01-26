package com.example.mysqlapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by j16014 on 2018/01/11 (011).
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    /* データベース名 */
    private final static String DB_NAME = "androidstudydb";
    /* データベースのバージョン */
    private final static int DB_VER = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME,null,DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "";
        sql += "create table MyTable(";
        sql += "No integer primary key autoincrement";
        sql += ",Name text not null";
        sql += ",Height real";
        sql += ",Weight real";
        sql += ")";
        sqLiteDatabase.execSQL(sql);

        sqLiteDatabase.execSQL("INSERT INTO MyTable(No,Name,Height, Weight) values (1,'japan',35,139);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(No,Name,Height, Weight) values (2,'ja',35,139);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}