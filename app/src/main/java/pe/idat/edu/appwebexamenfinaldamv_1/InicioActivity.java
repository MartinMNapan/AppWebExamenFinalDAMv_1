package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class InicioActivity extends AppCompatActivity {
    //
    TextView loading;
    ImageView logo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);

        //Animaciones
        //Animation a1 = AnimationUtils.loadAnimation(this, R.anim.despla_arriba);
        //Animation a2 = AnimationUtils.loadAnimation(this, R.anim.despla_abajo);

        loading = findViewById(R.id.txtLoading);
        logo1 = findViewById(R.id.idLogo);

        //oading.setAnimation(a2);
        //logo1.setAnimation(a1);
        //
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(InicioActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}