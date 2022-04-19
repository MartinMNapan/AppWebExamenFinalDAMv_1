package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import pe.idat.edu.appwebexamenfinaldamv_1.Entidades.EstadoBateria;

public class DetailActivity extends AppCompatActivity {
    //
    private ImageView imgItemDetail;
    private TextView tvTituloDetail;
    private TextView tvDescripcionDetail;
    private EstadoBateria itemDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle(getClass().getSimpleName());
        //
        initViews();
        initValues();
    }
    //
    private void initViews(){
        imgItemDetail = findViewById(R.id.imgItemDetail);
        tvTituloDetail = findViewById(R.id.tvTituloDetail);
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail);
    }

    private void initValues(){
        itemDetail = (EstadoBateria) getIntent().getExtras().getSerializable("itemDetail");
        //
        imgItemDetail.setImageResource(itemDetail.getImgResource());
        tvTituloDetail.setText(itemDetail.getTitulo());
        tvDescripcionDetail.setText(itemDetail.getDescripcion());
    }
}