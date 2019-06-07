package com.example.sahaj.mathlearns;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "mathlearns.db"; //name of whole database
    public static final String TABLE_NAME = "score_table"; //this contains all the scores
    public static final String USERNAME = "username";
    public static final String ADDSCORE = "additionScore";
    public static final String SUBSCORE = "substitutionScore";
    public static final String MULTSCORE = "multipulcationScore";
    public static final String DIVSCORE = "divisionScore";
    

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
