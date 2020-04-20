package com.example.playstore.DrawerActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.playstore.Adapter.PageAdapter;
import com.example.playstore.MainActivity;
import com.example.playstore.R;
import com.google.android.material.tabs.TabLayout;

public class AppsActivity extends AppCompatActivity {
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        tabLayout=findViewById(R.id.tablayout_apps);
        TabViewselector();
    }

    private void TabViewselector(){

        tabLayout.addTab(tabLayout.newTab().setText("Updates"));
        tabLayout.addTab(tabLayout.newTab().setText("Installed"));
      tabLayout.addTab(tabLayout.newTab().setText("Library"));
        final ViewPager viewPager= (ViewPager)findViewById(R.id.viewpager) ;
        PageAdapter pageAdapter= new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    public void imageclick(View view) {
        Intent intent = new Intent(AppsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
