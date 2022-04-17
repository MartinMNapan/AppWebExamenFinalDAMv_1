package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import pe.idat.edu.appwebexamenfinaldamv_1.Adaptadores.AdaptadorProductos;
import pe.idat.edu.appwebexamenfinaldamv_1.DAO.ProductosDAO;
import pe.idat.edu.appwebexamenfinaldamv_1.Entidades.Productos;

public class ScooterActivity extends AppCompatActivity {

    //
    RecyclerView rv;
    AdaptadorProductos adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scooter);

        rv=findViewById(R.id.rvProductos);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //
        CargarProductos();
        //
        ProductosDAO dao = new ProductosDAO(ScooterActivity.this);
        adapter = new AdaptadorProductos(dao.ListarProductos());
        rv.setAdapter(adapter);
    }
    //
    void CargarProductos(){
        ProductosDAO dao = new ProductosDAO(ScooterActivity.this);
        dao.AgregarProducto(new Productos(1, "XXXX", "YYYYY", "AAAAA", R.drawable.img2));
        dao.AgregarProducto(new Productos(2, "XXXX", "YYYYY", "AAAAA", R.drawable.img3));
        dao.AgregarProducto(new Productos(3, "XXXX", "YYYYY", "AAAAA", R.drawable.img4));
        dao.AgregarProducto(new Productos(4, "XXXX", "YYYYY", "AAAAA", R.drawable.img5));
        //
        Toast.makeText(this, "Registro de Productos Insertados", Toast.LENGTH_LONG).show();
    }
}