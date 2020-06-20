package com.example.playstore.Adapter.DrawerAdapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.playstore.DrawerActivitiesFragments.LibraryFragment;
import com.example.playstore.GamesTabLayoutFragments.ForYouFragment;
import com.example.playstore.GamesTabLayoutFragments.TopChartsFragment;


public class GamesPageAdapter extends FragmentStatePagerAdapter {
   int counttab;
    public GamesPageAdapter(@NonNull FragmentManager fm, int counttab) {
        super(fm,counttab);
        this.counttab= counttab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        for(int i=0; i<counttab; i++){
            ForYouFragment forYouFragment= new ForYouFragment();
            return forYouFragment;
        }


return  null;
    }

    @Override
    public int getCount() {
        return counttab;
    }
}
