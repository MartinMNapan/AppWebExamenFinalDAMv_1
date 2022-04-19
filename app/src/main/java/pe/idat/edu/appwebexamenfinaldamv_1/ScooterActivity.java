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
        dao.AgregarProducto(new Productos(1, "Scooter Eléctrico ES1L Ninebot By Segway", "Batería de iones de litio premium de larga duración IPX6 resistente al agua.", "larga duracion", R.drawable.img2));
        dao.AgregarProducto(new Productos(2, "Scooter Eléctrico L2 Neg/Roj", "Batería de iones de litio premium de larga duración", "larga duracion", R.drawable.img3));
        dao.AgregarProducto(new Productos(3, "Scooter Eléctrico X7 PRO", "Batería: 6.4 Ah Panasonic Battery", "larga duracion", R.drawable.img4));
        dao.AgregarProducto(new Productos(4, "Gondi Scooter Eléctrico S12", "48 V / 10 aH", "larga duracion", R.drawable.img5));
        //
        Toast.makeText(this, "Registro de Productos Insertados", Toast.LENGTH_LONG).show();
    }
}