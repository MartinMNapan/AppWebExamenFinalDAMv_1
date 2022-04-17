package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import pe.idat.edu.appwebexamenfinaldamv_1.Adaptadores.AdaptadorProductos;
import pe.idat.edu.appwebexamenfinaldamv_1.DAO.ProductosDAO;

public class ListadoProductosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_productos);




    }
}