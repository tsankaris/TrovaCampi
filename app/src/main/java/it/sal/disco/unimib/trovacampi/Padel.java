package it.sal.disco.unimib.trovacampi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Padel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padel);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.PadelFragment, R.id.mapsFragmentPadel, R.id.profile).build();

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view_padel);

        // Logic to manage the behavior of the BottomNavigationView and Toolbar
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_activity_navigation_padel);
        NavController navController = navHostFragment.getNavController();

        // For the Toolbar
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        // For the BottomNavigationView
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}