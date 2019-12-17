package com.example.szidonialaszlo.fragmentradiogroup;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ColorFragment colorFragment = new ColorFragment();
        fragmentTransaction.add(R.id.fragment_container,colorFragment);
        fragmentTransaction.commit();

    }

    /*public boolean onCreateOptionsMenu(Menu menu){

    }*/


}
