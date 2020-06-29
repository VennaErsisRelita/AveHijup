package com.bikeamovie.e_commerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bikeamovie.e_commerce.Fragment.HomeFragment;
import com.bikeamovie.e_commerce.Fragment.NotifFragment;
import com.bikeamovie.e_commerce.Fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ImageView home, notif, user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notif = findViewById(R.id.notif);
        home = findViewById(R.id.home);
        user = findViewById(R.id.user);

        getFragmentPage(new HomeFragment());
        changeicon(home, R.drawable.ic_home_yellow_24dp);
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentPage(new NotifFragment());
                changeicon(notif, R.drawable.ic_notifications_active_yellow_24dp);
                changeicon(home, R.drawable.ic_home_black_24dp);
                changeicon(user, R.drawable.ic_person_black_24dp);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentPage(new HomeFragment());
                changeicon(notif, R.drawable.ic_notifications_active_black_24dp);
                changeicon(home, R.drawable.ic_home_yellow_24dp);
                changeicon(user, R.drawable.ic_person_black_24dp);
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentPage(new ProfileFragment());
                changeicon(notif, R.drawable.ic_notifications_active_black_24dp);
                changeicon(home, R.drawable.ic_home_black_24dp);
                changeicon(user, R.drawable.ic_person_yellow_24dp);
            }
        });


    }


    //Menampilkan halaman Fragment
    private void getFragmentPage(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame,fragment);
        ft.commit();
    }

    private void changeicon(ImageView img, Integer integer ){
        img.setImageResource(integer);
    }
}
