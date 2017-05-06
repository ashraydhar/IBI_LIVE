package com.zeplin;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.zeplin.fragement.HomeFragement;

/**
 * main activity
 */
public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ImageView i;
    private HomeFragement homeFragement = new HomeFragement();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        i = (ImageView) findViewById(R.id.nav_drawer_btn);
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {

                //mDrawerLayout.openDrawer(l);
                mDrawerLayout.openDrawer(Gravity.START);
            }
        });

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.drawer_framelayout, homeFragement);
        ft.commit();
    }
}
