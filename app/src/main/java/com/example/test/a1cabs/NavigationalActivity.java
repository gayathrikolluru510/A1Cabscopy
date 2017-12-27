package com.example.test.a1cabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.io.IOException;
import java.net.URL;

public class NavigationalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigational);


        // for aboutus page opening

        Button aboutus = (Button) findViewById(R.id.aboutus);
        //giving event listeners
        aboutus.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent( NavigationalActivity.this,AboutUsActivity.class);
                startActivity(numbersIntent);
            }

        });

        Button contact = (Button) findViewById(R.id.contact);
        //giving event listeners
        contact.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:09826008899"));
                startActivity(intent);
            }

        });

        Button linkedin = (Button) findViewById(R.id.linkedin);
        //giving event listeners
        linkedin.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {
                String url="https://www.linkedin.com/shekharaerosoft";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }

        });

        Button facebook = (Button) findViewById(R.id.facebook);
        //giving event listeners
        facebook.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {
                String url="https://www.facebook.com/shekhar.gupta.969";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }

        });

        Button google = (Button) findViewById(R.id.google);
        //giving event listeners
        google.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {
                String url="https://plus.google.com/+CaptainShekhar";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }

        });

        Button twitter = (Button) findViewById(R.id.twitter);
        //giving event listeners
        twitter.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {
                String url="https://twitter.com/captshekhar";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }

        });




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places View is clicked on.
            @Override
            public void onClick(View view) {
                String[] email={"neha@a-1soft.com"};
                String subject="to book a cab";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL,email);

                intent.putExtra(Intent.EXTRA_SUBJECT, subject);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.navigational, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent numbersIntent = new Intent( NavigationalActivity.this,PrivacyActivity.class);
            startActivity(numbersIntent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
