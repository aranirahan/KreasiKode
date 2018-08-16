package com.aranirahan.biodatabase.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sidiqpermana on 11/23/16.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "dbnoteappp";
    public static String TABLE_NAME = "note";
    public static String FIELD_TITLE = "title";
    public static String FIELD_DESCRIPTION = "description";
    public static String FIELD_PROV = "prov";
    public static String FIELD_DATE = "date";
    public static String FIELD_ID = "id";
    public static String FIELD_KOTA = "kota";
    public static String FIELD_TGL = "tgl";
    public static String FIELD_HP = "hp";

    private static final int DATABASE_VERSION = 1;

    public static String CREATE_TABLE_NOTE = "create table "+TABLE_NAME+" ("+FIELD_ID+" integer primary key autoincrement, " +
            FIELD_TITLE+" text not null, " +
            FIELD_DESCRIPTION+" text not null, " +
            FIELD_PROV+" text not null, " +
            FIELD_KOTA+" text not null, " +
            FIELD_TGL+" text not null, " +
            FIELD_HP+" text not null, " +
            FIELD_DATE+" text not null);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(CREATE_TABLE_NOTE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
