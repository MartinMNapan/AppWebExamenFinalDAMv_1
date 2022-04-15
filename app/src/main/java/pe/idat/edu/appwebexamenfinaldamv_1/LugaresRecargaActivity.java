package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LugaresRecargaActivity extends AppCompatActivity {
    //
    Button btnm1, btnm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares_recarga);
        //
        asignarUbicaciones();
    }
    //
    private void asignarUbicaciones(){
        btnm1=findViewById(R.id.btnMapa1);
        btnm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LugaresRecargaActivity.this, MapsActivity.class);
                intent.putExtra("latitud", "-12.085569");
                intent.putExtra("longitud", "-76.976361");
                intent.putExtra("titulo", "Jockey Plaza Bouleveard, Santiago de Surco");
                startActivity(intent);
            }
        });
        //
        btnm2=findViewById(R.id.btnMapa2);
        btnm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LugaresRecargaActivity.this, MapsActivity.class);
                intent.putExtra("latitud", "-12.252808");
                intent.putExtra("longitud",  "-76.928033");
                intent.putExtra("titulo", "Kio Petroperu Carr. Panamericana Sur 245, Lurin");
                startActivity(intent);
            }
        });
    }

}