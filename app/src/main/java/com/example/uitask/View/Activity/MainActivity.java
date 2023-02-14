package com.example.uitask.View.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.uitask.R;
import com.example.uitask.View.Fragment.CartFragment;
import com.example.uitask.View.Fragment.FavouriteFrangement;
import com.example.uitask.View.Fragment.HomeFragment;
import com.example.uitask.View.Fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigation;
    final Fragment homeFragment = new HomeFragment();
    final Fragment cartFragment = new CartFragment();
    final Fragment favouriteFragment=new FavouriteFrangement();
    final Fragment profileFragment = new ProfileFragment();

    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = homeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigation = (BottomNavigationView) findViewById(R.id.product_bottom);
        fm.beginTransaction().add(R.id.product_frame, profileFragment, "4").hide(profileFragment).commit();
        fm.beginTransaction().add(R.id.product_frame,favouriteFragment,"3").hide(favouriteFragment).commit();
        fm.beginTransaction().add(R.id.product_frame, cartFragment, "2").hide(cartFragment).commit();
        fm.beginTransaction().add(R.id.product_frame,homeFragment, "1").commit();

        navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_icon:
                        fm.beginTransaction().hide(active).show(homeFragment).commit();
                        active = homeFragment;
                        Toast.makeText(getApplicationContext(), "home", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.cart_icon:
                        fm.beginTransaction().hide(active).show(cartFragment).commit();
                        active = cartFragment;
                        Toast.makeText(getApplicationContext(), "cart", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.favourite_icon:
                        fm.beginTransaction().hide(active).show(favouriteFragment).commit();
                        active = favouriteFragment;
                        Toast.makeText(getApplicationContext(), "favourite", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.profile_icon:
                        fm.beginTransaction().hide(active).show(profileFragment).commit();
                        active = profileFragment;
                        Toast.makeText(getApplicationContext(), "me", Toast.LENGTH_SHORT).show();
                        return true;

                }


                return false;
            }
        });
    }
}