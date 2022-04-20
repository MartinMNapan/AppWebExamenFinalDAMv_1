package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PagoActivity extends AppCompatActivity {
    EditText TXTNUMERODTARJETA,TXTFECHACADUCIDAD,TXTCODIGOSEGURIDAD,TXTIMPORTEAPAGAR,TXTNOMBRE;

    Button BTNCONTINUE,btnfinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        TXTNUMERODTARJETA = findViewById(R.id.TXTNUMERODTARJETA);
        TXTFECHACADUCIDAD = findViewById(R.id.TXTFECHACAD);
        TXTCODIGOSEGURIDAD = findViewById(R.id.TXTCODIGODESEGU);
        TXTIMPORTEAPAGAR = findViewById(R.id.TXTIMPORTEAPAGAR);
        TXTNOMBRE = findViewById(R.id.TXTNOMBRE);

        BTNCONTINUE = findViewById(R.id.BTNCONTINUE);
        btnfinalizar = findViewById(R.id.btnfinalizar);

        btnfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        BTNCONTINUE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dbtablapagos dBtablapagos = new Dbtablapagos(PagoActivity.this);
                long id = dBtablapagos.insertarPago(TXTNUMERODTARJETA.getText().toString(),TXTFECHACADUCIDAD.getText().toString(),
                        TXTCODIGOSEGURIDAD.getText().toString(),TXTIMPORTEAPAGAR.getText().toString(),TXTNOMBRE.getText().toString());


                if (id> 0){
                    Toast.makeText(PagoActivity.this, "PAGO GUARDADO CON EXITO DEL CLIENTE :  "+ TXTNOMBRE.getText(),Toast.LENGTH_LONG).show();
                    limpiar();

                }else {
                    Toast.makeText(PagoActivity.this, "ERROR AL GUARDAR PAGO",Toast.LENGTH_LONG).show();

                }

            }
        });


    }

    private void limpiar(){
        TXTNUMERODTARJETA.setText("");
        TXTFECHACADUCIDAD.setText("");
        TXTCODIGOSEGURIDAD.setText("");
        TXTIMPORTEAPAGAR.setText("");
    }
}