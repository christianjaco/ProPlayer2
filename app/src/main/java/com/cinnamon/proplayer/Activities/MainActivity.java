package com.cinnamon.proplayer.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.cinnamon.proplayer.Fragments.AddFragment;
import com.cinnamon.proplayer.Fragments.HomeFragment;
import com.cinnamon.proplayer.Fragments.SearchFragment;
import com.cinnamon.proplayer.R;
/*
xml: activity_main
 */

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            // Creo los fragments y navego entre cada uno con switch

            Fragment selectedFragment = null;
            switch (item.getItemId()){
                case R.id.inicio:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.add:
                    selectedFragment = new AddFragment();
                    break;
                case R.id.search:
                    selectedFragment = new SearchFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;

        }
    };
}
