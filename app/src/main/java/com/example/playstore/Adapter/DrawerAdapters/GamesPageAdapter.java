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

    switch (position){

        case 0:
            ForYouFragment forYouFragment= new ForYouFragment();
            return forYouFragment;
        case 1:
            TopChartsFragment topChartsFragment= new TopChartsFragment();
            return  topChartsFragment;

        case 2:
            LibraryFragment libraryFragment= new LibraryFragment();
            return libraryFragment;
        default:
                return null;

    }

    }

    @Override
    public int getCount() {
        return counttab;
    }
}
