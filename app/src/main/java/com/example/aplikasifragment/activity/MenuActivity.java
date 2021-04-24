package com.example.aplikasifragment.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.aplikasifragment.R;
import com.example.aplikasifragment.fragment.ProfilFragment;
import com.example.aplikasifragment.fragment.RumahFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        navigationView = findViewById(R.id.bottomNavigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        loadFragment(new RumahFragment());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.rumah:
                loadFragment(new RumahFragment());
                break;

            case R.id.profile:
                loadFragment(new ProfilFragment());
                break;
        }

        return true;
    }

    private boolean loadFragment(Fragment selectedFragment){
        if (selectedFragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayout,selectedFragment)
                    .commit();
            return true;
        }
        else{
            return false;
        }
    }
}