package pe.idat.edu.appwebexamenfinaldamv_1.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseRide extends SQLiteOpenHelper {
    //
    String tabla_productos = "create table productos("+"cod_producto int primary key,"+
                                                     "producto varchar(50)," +
                                                     "bateria varchar(50),"  +
                                                     "duracion varchar(50)," + "imagen int);";

    public DataBaseRide(@Nullable Context context, @Nullable String name){
        super(context, name, null, 1);
    }
    //
    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(tabla_productos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
