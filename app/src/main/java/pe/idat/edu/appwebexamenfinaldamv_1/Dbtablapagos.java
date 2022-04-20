package pe.idat.edu.appwebexamenfinaldamv_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class Dbtablapagos extends DbPagos{

    Context context;

    public Dbtablapagos(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long insertarPago(String numerotarjeta,String nombre ,String fechacaducidad, String codigoseguridad, String importeapagar ){

        long id = 0;
        try {
            DbPagos dbPagos = new DbPagos(context);
            SQLiteDatabase db = dbPagos.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("numerotarjeta", numerotarjeta);
            values.put("nombre", nombre);
            values.put("fechacaducidad", fechacaducidad);
            values.put("codigoseguridad", codigoseguridad);
            values.put("importeapagar", importeapagar);

            id = db.insert(TABLA_PAGOS, null, values);
        }catch (Exception ex) {
            ex.toString();
        }
        return id;
    }
}
