package pe.idat.edu.appwebexamenfinaldamv_1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbPagos extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "pagos.db";
    public static final String TABLA_PAGOS = "t_pagos";

    public DbPagos(@Nullable Context context){

        super(context,DATABASE_NOMBRE, null, DATABASE_VERSION);
    }
    @Override

    public void onCreate(SQLiteDatabase sqLiteDatabase){

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLA_PAGOS + "(" +
                "numerotarjeta TEXT NOT NULL ,"+
                "fechacaducidad TEXT NOT NULL,"+
                "nombre TEXT NOT NULL,"+
                "codigoseguridad TEXT NOT NULL," +
                "importeapagar TEXT )");


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE VIEW" + TABLA_PAGOS);
        onCreate(sqLiteDatabase);

    }
}
