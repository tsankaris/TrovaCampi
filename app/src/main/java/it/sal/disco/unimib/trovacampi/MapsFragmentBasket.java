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

public class MapsFragmentBasket extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps_basket, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map_basket);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {


                LatLng posizione = new LatLng(45.6, 9.2);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posizione, 11));


                LatLng carugate = new LatLng(45.553269, 9.346469);
                googleMap.addMarker(new MarkerOptions()
                        .title("Basket Carugate")
                        .snippet("")
                        .position(carugate));

                  LatLng insport = new LatLng(45.583085, 9.335494);
                googleMap.addMarker(new MarkerOptions()
                        .title("In Sport")
                        .snippet("")
                        .position(insport));

                  LatLng gerardiana = new LatLng(45.585318, 9.286566);
                googleMap.addMarker(new MarkerOptions()
                        .title("Gerardiana")
                        .snippet("")
                        .position(gerardiana));

                  LatLng carnate = new LatLng(45.649248, 9.377934);
                googleMap.addMarker(new MarkerOptions()
                        .title("Palestra Carnate")
                        .snippet("")
                        .position(carnate));



            }


        });
        return view;
    }
}


