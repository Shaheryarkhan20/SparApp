package com.example.user.spar;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class JourneyActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageView toggleMenu;
    ActionBarDrawerToggle toggle;
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);

        l1=(LinearLayout)findViewById(R.id.Layout1);
        l2=(LinearLayout)findViewById(R.id.Layout2);
        l3=(LinearLayout)findViewById(R.id.Layout3);
        l4=(LinearLayout)findViewById(R.id.Layout4);
        l5=(LinearLayout)findViewById(R.id.Layout5);
        l6=(LinearLayout)findViewById(R.id.Layout6);
        l7=(LinearLayout)findViewById(R.id.Layout7);
        l8=(LinearLayout)findViewById(R.id.Layout8);
        l9=(LinearLayout)findViewById(R.id.Layout9);
        l10=(LinearLayout)findViewById(R.id.Layout10);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(JourneyActivity.this,RonniePage.class);
                startActivity(intent);
            }
        });
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        toggleMenu=(ImageView)findViewById(R.id.toggleMenu);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggleMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer,  R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){

        if(keyCode==KeyEvent.KEYCODE_BACK)
        {
            Intent intent= new Intent(JourneyActivity.this,Home.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case  R.id.nav_camera:
                Intent i = new Intent(JourneyActivity.this,Home.class);
                startActivity(i);
                break;
            case  R.id.nav_gallery:
                Intent intent = new Intent(JourneyActivity.this,AboutActivity.class);
                startActivity(intent);
                break;
            case  R.id.nav_slideshow:
                Intent intent1 = new Intent(JourneyActivity.this,JourneyActivity.class);
                startActivity(intent1);
                break;
            case  R.id.nav_manage:
                Intent intent2 = new Intent(JourneyActivity.this,ContactActivity.class);
                startActivity(intent2);
                break;
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

