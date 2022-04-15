package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    //
    Button btnregscoot, btnestbat, btnlugrec, btnpago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //
        btnregscoot();
        btnestbat();
        btnlugrec();
        //btnpago();

    }
    //
    private void btnregscoot(){
        btnregscoot=findViewById(R.id.btnRegistrarBateria);
        btnregscoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ScooterActivity.class);
                startActivity(intent);

            }
        });
    }
    //
    private void btnestbat(){
        btnestbat=findViewById(R.id.btnEstadoBateria);
        btnestbat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, EstadoBateriaActivity.class);
                startActivity(intent);
            }
        });
    }
    //
    private void btnlugrec(){
        btnlugrec=findViewById(R.id.btnLugaresRecarga);
        btnlugrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LugaresRecargaActivity.class);
                startActivity(intent);
            }
        });
    }


}