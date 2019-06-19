package com.example.sahaj.mathlearns;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Mathlearns.db"; //name of whole database
    public static final String TABLE_NAME = "score_table"; //this contains all the scores
    public static final String USERNAME = "username";
    public static final String ADDSCORE = "additionScore";
    public static final String SUBSCORE = "substitutionScore";
    public static final String MULTSCORE = "multipulcationScore";
    public static final String DIVSCORE = "divisionScore";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1); //This is the constructor
    }

    @Override
    public void onCreate(SQLiteDatabase db) { //
        db.execSQL("create table " + TABLE_NAME +" (username TEXT PRIMARY KEY AUTOINCREMENT, additionScore INTEGER,substitutionScore INTEGER, multipulcationScore INTEGER, divisionScore INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertAdd(String additionScore){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ADDSCORE,additionScore);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1){
            return false;
        }
        else return true;
    }

    public boolean insertSUB(String subtractionScore){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(SUBSCORE,subtractionScore);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1){
            return false;
        }
        else return true;
    }

    public boolean insertMult(String multScore){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MULTSCORE,multScore);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1){
            return false;
        }
        else return true;
    }

    public boolean divAdd(String divScore){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DIVSCORE,divScore);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1){
            return false;
        }
        else return true;
    }
}
