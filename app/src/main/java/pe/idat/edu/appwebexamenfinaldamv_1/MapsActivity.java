package pe.idat.edu.appwebexamenfinaldamv_1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import pe.idat.edu.appwebexamenfinaldamv_1.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap map;
    //private ActivityMapsBinding binding;
    float latitud, longitud;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        asignarRefe();
        }
        //
        public void asignarRefe(){
            SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.mapa);
            mapFragment.getMapAsync(this);
        }
        //

        @Override
        public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.getUiSettings().setZoomControlsEnabled(true);
        recuperarDatos();
        //
        LatLng mapa = new LatLng(latitud, longitud);
        map.addMarker(new MarkerOptions().position(mapa).title(titulo));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(mapa,16));
    }
    //
    private void recuperarDatos() {
        latitud = Float.parseFloat(getIntent().getStringExtra("latitud"));
        longitud = Float.parseFloat(getIntent().getStringExtra("longitud"));
        titulo = getIntent().getStringExtra("titulo");
    }
}