package com.example.shaka.appbibliotecarimac.SQLiteConexion;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.shaka.appbibliotecarimac.Utilidades.Utilidades;

public class SQLiteHelper extends SQLiteOpenHelper{

    public static final String DATABASE="BIBLIOTECA";



    public SQLiteHelper(Context context) {
        super(context, DATABASE, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Utilidades.CREAR_TABLA_LIBROS);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Utilidades.TABLA_LIBROS);
    }
}
