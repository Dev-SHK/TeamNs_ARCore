package com.example.teamns_arcore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME="UserDataBase";

    public static final String TABLE_NAME="UserTable";

    public static final String Table_Column_ID="id"; // index
    public static final String Table_Column_1_Name="name"; // 이름
    public static final String Table_Column_2_Email="email"; // id
    public static final String Table_Column_3_Password="password"; // 비밀번호

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("+Table_Column_ID+" INTEGER, "+Table_Column_1_Name+" VARCHAR, "+Table_Column_2_Email+" VARCHAR PRIMARY KEY, "+Table_Column_3_Password+" VARCHAR)";
        database.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }

}