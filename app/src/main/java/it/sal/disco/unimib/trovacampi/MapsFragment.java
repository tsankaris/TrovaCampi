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

public class MapsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {



                LatLng posizione = new LatLng(45.6,9.2);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posizione, 11));



                LatLng cantera = new LatLng(45.630718, 9.285114);
                googleMap.addMarker(new MarkerOptions()
                        .title("Cantera")
                        .snippet("")
                        .position(cantera));

                LatLng sportpark = new LatLng(45.615736, 9.266916);
                googleMap.addMarker(new MarkerOptions()
                        .title("SportPark")
                        .snippet("")
                        .position(sportpark));

                  LatLng derby = new LatLng(45.588395, 9.253444);
                googleMap.addMarker(new MarkerOptions()
                        .title("Derby")
                        .snippet("")
                        .position(derby));

                  LatLng tijuana = new LatLng(45.662430, 9.304065);
                googleMap.addMarker(new MarkerOptions()
                        .title("Tijuana")
                        .snippet("")
                        .position(tijuana));

                  LatLng playsport = new LatLng(45.642917, 9.303909);
                googleMap.addMarker(new MarkerOptions()
                        .title("PlaySport")
                        .snippet("")
                        .position(playsport));

                  LatLng piscine = new LatLng(45.608566, 9.229179);
                googleMap.addMarker(new MarkerOptions()
                        .title("Piscine di Lissone")
                        .snippet("")
                        .position(piscine));

                  LatLng insport = new LatLng(45.625585, 9.316515);
                googleMap.addMarker(new MarkerOptions()
                        .title("InSport")
                        .snippet("")
                        .position(insport));

                  LatLng leon = new LatLng(45.605987, 9.373933);
                googleMap.addMarker(new MarkerOptions()
                        .title("Leon Arena")
                        .snippet("")
                        .position(leon));

                  LatLng open_sport= new LatLng(45.649961, 9.268412);
                googleMap.addMarker(new MarkerOptions()
                        .title("Open Sport")
                        .snippet("")
                        .position(open_sport));

                  LatLng la_dominante = new LatLng(45.600716, 9.262886);
                googleMap.addMarker(new MarkerOptions()
                        .title("La Dominante")
                        .snippet("")
                        .position(la_dominante));



            }



        });
        return view;
    }


}