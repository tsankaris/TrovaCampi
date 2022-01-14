package it.sal.disco.unimib.trovacampi;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;


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
import android.widget.TextView;
import android.widget.Toast;

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


 public class MainActivity extends AppCompatActivity {

     private TextView AddressText;
     private Button LocationButton;
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
                 if (sport.equals("calcio")) {
                     startActivity(new Intent(getApplicationContext(), Calcio_activity.class));
                 }
                 if (sport.equals("tennis")) {
                     startActivity(new Intent(getApplicationContext(), Tennis.class));
                 }
                 if (sport.equals("pallavolo")) {
                     startActivity(new Intent(getApplicationContext(), Pallavolo.class));
                 }
                 if (sport.equals("padel")) {
                     startActivity(new Intent(getApplicationContext(), Padel.class));
                 }
                 if (sport.equals("basket")) {
                     startActivity(new Intent(getApplicationContext(), Basket.class));
                 }
             }
         });







     }

     @Override
     public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
         super.onRequestPermissionsResult(requestCode, permissions, grantResults);

         if (requestCode == 1){
             if (grantResults[0] == PackageManager.PERMISSION_GRANTED){

                 if (isGPSEnabled()) {

                     getCurrentLocation();

                 }else {

                     turnOnGPS();
                 }
             }
         }


     }

     @Override
     protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
         super.onActivityResult(requestCode, resultCode, data);

         if (requestCode == 2) {
             if (resultCode == Activity.RESULT_OK) {

                 getCurrentLocation();
             }
         }
     }

     private void getCurrentLocation() {


         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
             if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                 if (isGPSEnabled()) {

                     LocationServices.getFusedLocationProviderClient(MainActivity.this)
                             .requestLocationUpdates(locationRequest, new LocationCallback() {
                                 @Override
                                 public void onLocationResult(@NonNull LocationResult locationResult) {
                                     super.onLocationResult(locationResult);

                                     LocationServices.getFusedLocationProviderClient(MainActivity.this)
                                             .removeLocationUpdates(this);

                                     if (locationResult != null && locationResult.getLocations().size() >0){

                                         int index = locationResult.getLocations().size() - 1;
                                         double latitude = locationResult.getLocations().get(index).getLatitude();
                                         double longitude = locationResult.getLocations().get(index).getLongitude();

                                         AddressText.setText("Latitude: "+ latitude + "\n" + "Longitude: "+ longitude);
                                     }
                                 }
                             }, Looper.getMainLooper());

                 } else {
                     turnOnGPS();
                 }

             } else {
                 requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
             }
         }
     }

     private void turnOnGPS() {



         LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                 .addLocationRequest(locationRequest);
         builder.setAlwaysShow(true);

         Task<LocationSettingsResponse> result = LocationServices.getSettingsClient(getApplicationContext())
                 .checkLocationSettings(builder.build());

         result.addOnCompleteListener(new OnCompleteListener<LocationSettingsResponse>() {
             @Override
             public void onComplete(@NonNull Task<LocationSettingsResponse> task) {

                 try {
                     LocationSettingsResponse response = task.getResult(ApiException.class);
                     Toast.makeText(MainActivity.this, "GPS is already tured on", Toast.LENGTH_SHORT).show();

                 } catch (ApiException e) {

                     switch (e.getStatusCode()) {
                         case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:

                             try {
                                 ResolvableApiException resolvableApiException = (ResolvableApiException) e;
                                 resolvableApiException.startResolutionForResult(MainActivity.this, 2);
                             } catch (IntentSender.SendIntentException ex) {
                                 ex.printStackTrace();
                             }
                             break;

                         case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:
                             //Device does not have location
                             break;
                     }
                 }
             }
         });

     }

     private boolean isGPSEnabled() {
         LocationManager locationManager = null;
         boolean isEnabled = false;

         if (locationManager == null) {
             locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
         }

         isEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
         return isEnabled;

     }


 }