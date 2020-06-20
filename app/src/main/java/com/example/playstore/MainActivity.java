package com.example.playstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.playstore.DrawerActivities.AccountsActivity;
import com.example.playstore.DrawerActivities.AppsActivity;
import com.example.playstore.DrawerActivities.NotificationActivity;
import com.example.playstore.DrawerActivities.PaymentActivity;
import com.example.playstore.DrawerActivities.PlayAndProtectActivity;
import com.example.playstore.DrawerActivities.SettingsActivity;
import com.example.playstore.DrawerActivities.SubscriptionActivity;
import com.example.playstore.DrawerActivities.WishlistActivity;
import com.example.playstore.BtmNavFragments.AppsFragment;
import com.example.playstore.BtmNavFragments.BooksFragment;
import com.example.playstore.BtmNavFragments.GamesFragment;
import com.example.playstore.BtmNavFragments.MoviesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
 DrawerLayout drawerLayout;
 ActionBarDrawerToggle actionBarDrawerToggle;
 Toolbar toolbar;
 NavigationView navigationView;
 BottomNavigationView bottomNavigationView;
 TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= findViewById(R.id.drawer_toolbar);
        setSupportActionBar(toolbar);
       //
        drawerLayout= findViewById(R.id.drawer);
        navigationView= findViewById(R.id.navigationView);
        bottomNavigationView=findViewById(R.id.btm_nav);
        actionBarDrawerToggle= new ActionBarDrawerToggle(this, drawerLayout,
                toolbar,R.string.open,R.string.close);

         drawerLayout.addDrawerListener(actionBarDrawerToggle);
         actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
         actionBarDrawerToggle.syncState();
         navigationView.setNavigationItemSelectedListener(this);
        // TabViewselector();
         bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 int id= item.getItemId();

                 if (id== R.id.games){

                     GamesFragment fragment= new GamesFragment();
                     FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
                     ft.replace(R.id.container_fragment,fragment);
                     ft.commit();


                 }


                 if (id== R.id.apps){
                     AppsFragment fragment = new AppsFragment();
                     //GamesFragment fragment= new GamesFragment();
                     FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
                     ft.replace(R.id.container_fragment,fragment);
                     ft.commit();


                 }

                 if (id== R.id.movies){

                     MoviesFragment fragment = new MoviesFragment();
                     FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
                     ft.replace(R.id.container_fragment,fragment);
                     ft.commit();

                 }

                 if (id== R.id.books){

                     BooksFragment fragment = new BooksFragment();
                     FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
                     ft.replace(R.id.container_fragment,fragment);
                     ft.commit();

                 }
                 return true;

             }
         });

         bottomNavigationView.setSelectedItemId(R.id.games);

//        FragmentManager fragmentManager= getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.container_fragment,new MyAppsFragment());
//        fragmentTransaction.commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()== R.id.my_apps) {

            Intent intent= new Intent(MainActivity.this, AppsActivity.class);
            startActivity(intent);

        }
        if (item.getItemId()== R.id.notification) {

            Intent intent= new Intent(MainActivity.this, NotificationActivity.class);
            startActivity(intent);

        }
        if (item.getItemId()== R.id.subscription) {

            Intent intent= new Intent(MainActivity.this, SubscriptionActivity.class);
            startActivity(intent);

        }
        if (item.getItemId()== R.id.wishlist) {

            Intent intent= new Intent(MainActivity.this, WishlistActivity.class);
            startActivity(intent);

        }
        if (item.getItemId()== R.id.accounts) {

            Intent intent= new Intent(MainActivity.this, AccountsActivity.class);
            startActivity(intent);

        }
        if (item.getItemId()== R.id.payment) {

            Intent intent= new Intent(MainActivity.this, PaymentActivity.class);
            startActivity(intent);

        }
        if (item.getItemId()== R.id.play_protect) {

            Intent intent= new Intent(MainActivity.this, PlayAndProtectActivity.class);
            startActivity(intent);

        }
        if (item.getItemId()== R.id.settings) {

            Intent intent= new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }
        else{
          super.onBackPressed();
        }


    }
   
}
