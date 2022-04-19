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
        itemLists.add(new EstadoBateria("xxxx","yyyy", R.drawable.imagen1));
        itemLists.add(new EstadoBateria("xxxe","yyyt", R.drawable.imagen1));
        itemLists.add(new EstadoBateria("xxxr","yyyx", R.drawable.imagen1));
        itemLists.add(new EstadoBateria("xxxt","yyyn", R.drawable.imagen1));
        itemLists.add(new EstadoBateria("xxxy","yyym", R.drawable.imagen1));
        itemLists.add(new EstadoBateria("xxxq","yyya", R.drawable.imagen1));

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