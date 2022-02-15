package it.sal.disco.unimib.trovacampi;


import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {


     Button LocationButton;
     private LocationRequest locationRequest;
     Button button3;
     private Spinner mSpinner;



    @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         mSpinner = findViewById(R.id.spinner);

         button3 = findViewById(R.id.button);
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String sport = mSpinner.getSelectedItem().toString();
                 if (sport.equals("football") || sport.equals("calcio")) {
                     startActivity(new Intent(getApplicationContext(), NavigationCalcio.class));
                 }
                 if (sport.equals("tennis")) {
                     startActivity(new Intent(getApplicationContext(), Tennis.class));
                 }
                 if (sport.equals("volleyball") || sport.equals("pallavolo")) {
                     startActivity(new Intent(getApplicationContext(), Pallavolo.class));
                 }
                 if (sport.equals("padel")) {
                     startActivity(new Intent(getApplicationContext(), Padel.class));
                 }
                 if (sport.equals("basket")) {
                     startActivity(new Intent(getApplicationContext(), Basket.class));
                 }
             }
         });}
 }