package com.example.menu_bar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    DrawerLayout d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar t = findViewById(R.id.toolbar);
        d = findViewById(R.id.mydrawer);
        setSupportActionBar(t);
        ActionBarDrawerToggle mt = new ActionBarDrawerToggle(this, d, R.string.open, R.string.close);
        d.addDrawerListener(mt);
        mt.syncState();
    }

    @Override
    public void onBackPressed() {
        if(d.isDrawerOpen(GravityCompat.START)){
            d.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}