package it.sal.disco.unimib.trovacampi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsFragmentPallavolo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps_pallavolo, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map_volley);

        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {


                LatLng posizione = new LatLng(45.6, 9.2);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posizione, 11));


                LatLng desio = new LatLng(45.611348, 9.192536);
                googleMap.addMarker(new MarkerOptions()
                        .title("Centro Desio")
                        .snippet("")
                        .position(desio));


                  LatLng ladomi = new LatLng(45.600716, 9.262886);
                googleMap.addMarker(new MarkerOptions()
                        .title("La Dominante")
                        .snippet("")
                        .position(ladomi));

                  LatLng derby = new LatLng(45.588395, 9.253444);
                googleMap.addMarker(new MarkerOptions()
                        .title("Derby")
                        .snippet("")
                        .position(derby));

                  LatLng planet = new LatLng(45.619380, 9.134277);
                googleMap.addMarker(new MarkerOptions()
                        .title("Planet Soccer")
                        .snippet("")
                        .position(planet));



            }


        });
        return view;
    }
}