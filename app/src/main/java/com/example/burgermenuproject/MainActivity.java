package com.example.burgermenuproject;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.burgermenuproject.Fragments.DrinkFragment;
import com.example.burgermenuproject.Fragments.FoodFragment;
import com.example.burgermenuproject.Fragments.FavoriteFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showHomePage();

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);

        drawerLayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.menu_item1) {
                    showHomePage();
                } else if (itemId == R.id.menu_item2) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new DrinkFragment())
                            .commit();
                    getSupportActionBar().setTitle("Beverage Menu");
                } else if (itemId == R.id.menu_item3) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new FavoriteFragment())
                            .commit();
                    getSupportActionBar().setTitle("Profile Menu");
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    private void showHomePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new FoodFragment())
                .commit();

        getSupportActionBar().setTitle("Food Menu");
    }

}