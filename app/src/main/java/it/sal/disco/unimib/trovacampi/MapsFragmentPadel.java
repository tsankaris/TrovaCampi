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

public class MapsFragmentPadel extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps_padel, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map_padel);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {


                LatLng posizione = new LatLng(45.6, 9.2);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posizione, 11));


                LatLng triante = new LatLng(45.575281, 9.251948);
                googleMap.addMarker(new MarkerOptions()
                        .title("Centro Trainte")
                        .snippet("")
                        .position(triante));


                  LatLng carate = new LatLng(45.675311, 9.223362);
                googleMap.addMarker(new MarkerOptions()
                        .title("Circolo Carate")
                        .snippet("")
                        .position(carate));

                  LatLng ceriano = new LatLng(45.632658, 9.075507);
                googleMap.addMarker(new MarkerOptions()
                        .title("Circolo Ceriano")
                        .snippet("")
                        .position(ceriano));

                  LatLng playsport = new LatLng(45.642917, 9.303909);
                googleMap.addMarker(new MarkerOptions()
                        .title("PlaySport")
                        .snippet("")
                        .position(playsport));



            }


        });
        return view;
    }
}


