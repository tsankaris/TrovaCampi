package it.sal.disco.unimib.trovacampi;

import android.location.Address;
import android.location.Location;

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

public class MapsFragmentTennis extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps_tennis, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map_basket);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {


                LatLng posizione = new LatLng(45.6, 9.2);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posizione, 11));


                LatLng cantera = new LatLng(45.630718, 9.285114);
                googleMap.addMarker(new MarkerOptions()
                        .title("Cantera")
                        .snippet("The most populous city in Australia.")
                        .position(cantera));


            }


        });
        return view;
    }
}


