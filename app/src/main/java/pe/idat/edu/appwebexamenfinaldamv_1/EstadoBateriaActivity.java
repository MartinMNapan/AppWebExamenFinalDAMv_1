package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import pe.idat.edu.appwebexamenfinaldamv_1.Adaptadores.RecyclerAdapter;
import pe.idat.edu.appwebexamenfinaldamv_1.Entidades.EstadoBateria;

public class EstadoBateriaActivity extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
    //
    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private List<EstadoBateria> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_bateria);
        //
        initViews();
        initValues();
        initListener();
    }
    //
    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
        svSearch = findViewById(R.id.svSearch);

    }
    //
    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items, this);
        rvLista.setAdapter(adapter);
    }
    //
    private void initListener(){
        svSearch.setOnQueryTextListener(this);
    }
    //

    private List<EstadoBateria> getItems(){
        List<EstadoBateria> itemLists = new ArrayList<>();
        itemLists.add(new EstadoBateria("Paquete de batería de litio para patinete eléctrico","18650 celdas, 60v, 20ah, batería recargable", R.drawable.imagen1));
        itemLists.add(new EstadoBateria("Paquete de celdas de 3400mAh para patinete eléctrico","18650 celdas, 60v, 20ah, batería recargable", R.drawable.image2));
        itemLists.add(new EstadoBateria("batería para scooter Eléctrico E 5"," 48 v", R.drawable.image3));
        itemLists.add(new EstadoBateria("Batería de litio recargable de repuesto para scooter eléctrico","36V, 7800mAh", R.drawable.image4));
        itemLists.add(new EstadoBateria("Paquete de batería de patinete Eléctrico Xiaomi Mijia M365","Voltaje límite de carga de la batería: 36V", R.drawable.image5));
        itemLists.add(new EstadoBateria(" Batería Paquete de celdas E-scooters Litio Li-ion","36V 7.8Ah ", R.drawable.image6));

        return itemLists;
    }
    //
    @Override
    public void itemClick(EstadoBateria item){
        Intent intent  = new Intent(this, DetailActivity.class);
        intent.putExtra("itemDetail", item);
        startActivity(intent);
    }
    //
    @Override
    public boolean onQueryTextSubmit(String query){
        return false;
    }
    //
    @Override
    public boolean onQueryTextChange(String newText){
        adapter.filter(newText);
        return false;
    }


}