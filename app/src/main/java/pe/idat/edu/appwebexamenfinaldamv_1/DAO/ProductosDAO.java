
package pe.idat.edu.appwebexamenfinaldamv_1.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import pe.idat.edu.appwebexamenfinaldamv_1.Entidades.Productos;

public class ProductosDAO {
    //
    SQLiteDatabase db;
    DataBaseRide ride1;
    //
    public ProductosDAO(Context contexto){
        ride1 = new DataBaseRide(contexto,"BD_RIDE_1");
    }
    //
    public void LeerBD(){
        db = ride1.getReadableDatabase();
    }
    //
    public void EscribirBD(){
        db = ride1.getWritableDatabase();
    }
    //
    public void CerrarBD(){
        db.close();
    }

    public void AgregarProducto(Productos obj){

        //Crear un ContenValues
        ContentValues cv = new ContentValues();
        cv.put("cod_producto", obj.getCod_producto());
        cv.put("producto", obj.getProducto());
        cv.put("bateria", obj.getBateria());
        cv.put("duracion", obj.getDuracion());
        cv.put("imagen", obj.getImagen());
        //
        EscribirBD();
        db.insert("productos", null, cv);
        CerrarBD();
        //
        listaProductos.add(obj);
    }
    //
    public void EliminarClienteSQL(int codigo){
        String cad_eliminar = "delete from productos where cod_producto=" + codigo;
        //
        db = ride1.getWritableDatabase();
        db.execSQL(cad_eliminar);
        db.close();
    }
    //
    public void EliminarClienteCV(int codigo){
        //
        String criterio = "cod_producto=?";
        String[] valor = new String[]{codigo+""};
        //
        db = ride1.getWritableDatabase();
        db.delete("productos", criterio, valor);
        db.close();
    }
    //
    public void ActualizarProductosCV(Productos obj){
        String criterio = "cod_producto=?";
        String [] valor = new String[]{obj.getCod_producto()+""};
        //
        ContentValues cv = new ContentValues();
        cv.put("producto", obj.getProducto());
        cv.put("bateria", obj.getBateria());
        cv.put("duracion", obj.getDuracion());
        cv.put("imagen", obj.getImagen());
    }
    //
    public  List<Productos> ListarProductosDB(){
        List<Productos> lista = new ArrayList<>();
        //
        db = ride1.getReadableDatabase();
        //
        Cursor c = db.rawQuery("select * from productos", null);
        //
        Productos obj = null;
        //
        if(c.getCount()>0){
            c.moveToFirst();
            //
            do{
                obj = new Productos(c.getInt(0),
                        c.getString(c.getColumnIndex("producto")),
                        c.getString(2),
                        c.getString(3),
                        c.getInt(4));
                //
                lista.add(obj);
            }while (c.moveToNext());
        }
        //
        c.close();
        db.close();
        //
        return lista;
    }
    //
    private static List<Productos> listaProductos = new ArrayList<>();

    public List<Productos> ListarProductos(){
        return listaProductos;
    }

}
