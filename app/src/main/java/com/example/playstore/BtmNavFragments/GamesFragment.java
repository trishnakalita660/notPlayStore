package com.example.playstore.BtmNavFragments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;
import com.example.playstore.Adapter.DrawerAdapters.GamesPageAdapter;
import com.example.playstore.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class GamesFragment extends Fragment {
View view;
Toolbar toolbar;
TabLayout tabLayout;

    public GamesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_games, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.games_tablayout);

        FragmentTabViewselector();

        return view;
    }

    private void FragmentTabViewselector() {

            tabLayout.addTab(tabLayout.newTab().setText(R.string.foryou));
            tabLayout.addTab(tabLayout.newTab().setText(R.string.topcharts));
            tabLayout.addTab(tabLayout.newTab().setText(R.string.events));

        tabLayout.addTab(tabLayout.newTab().setText("Premium"));
        tabLayout.addTab(tabLayout.newTab().setText("Categories"));
        tabLayout.addTab(tabLayout.newTab().setText("Family"));
        tabLayout.addTab(tabLayout.newTab().setText("Editor's Choice"));

        final ViewPager viewPager= (ViewPager)view.findViewById(R.id.games_viewpager) ;
            GamesPageAdapter pageAdapter= new GamesPageAdapter(getFragmentManager(),tabLayout.getTabCount());
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
    }