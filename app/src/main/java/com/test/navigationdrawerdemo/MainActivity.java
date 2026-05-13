package com.test.navigationdrawerdemo;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout panneau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Barre de navigation personnalisée
        Toolbar barreOutils = findViewById(R.id.toolbar);
        setSupportActionBar(barreOutils);

        // Connexion du drawer
        panneau = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle bascule = new ActionBarDrawerToggle(
                this, panneau, barreOutils,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        panneau.addDrawerListener(bascule);
        bascule.syncState();

        // Connexion du menu latéral
        NavigationView menulateral = findViewById(R.id.nav_view);
        menulateral.setNavigationItemSelectedListener(this);

        // Fragment par défaut au démarrage
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.zone_affichage, new BlankFragment())
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int identifiant = item.getItemId();

        if (identifiant == R.id.nav_fragment1) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.zone_affichage, new BlankFragment())
                    .commit();

        } else if (identifiant == R.id.nav_fragment2) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.zone_affichage, new BlankFragment2())
                    .commit();

        } else if (identifiant == R.id.nav_list) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.zone_affichage, new FragmentList())
                    .commit();
        }

        // Fermer le tiroir latéral après sélection
        panneau.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (panneau.isDrawerOpen(GravityCompat.START)) {
            panneau.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}