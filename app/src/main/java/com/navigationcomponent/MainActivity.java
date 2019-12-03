package com.navigationcomponent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void optionsMenu(View v){
        Intent i = new Intent();
        i.setClass(this, ShoppingActivity.class);
        startActivity(i);
    }

    public void bottomNav(View v){
        Intent i = new Intent();
        i.setClass(this, ShoppingBottomNavActivity.class);
        startActivity(i);
    }

    public void navigationDrawer(View v){
        Intent i = new Intent();
        i.setClass(this, ShoppingNavigationDrawerActivity.class);
        startActivity(i);
    }
    public void passDataTransitions(View v){
        Intent i = new Intent();
        i.setClass(this, PassDataActivity.class);
        startActivity(i);
    }

}
