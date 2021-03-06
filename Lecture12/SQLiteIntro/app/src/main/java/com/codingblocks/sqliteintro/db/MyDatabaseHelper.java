package com.codingblocks.sqliteintro.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.codingblocks.sqliteintro.db.tables.TodosTable;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "todo.db";
    public static final int DB_VER = 1;


    public MyDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TodosTable.CMD_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
