package com.example.playstore.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.playstore.DrawerActivitiesFragments.InstalledFragment;
import com.example.playstore.DrawerActivitiesFragments.LibraryFragment;
import com.example.playstore.DrawerActivitiesFragments.UpdatesFragment;


public class PageAdapter extends FragmentStatePagerAdapter {
   int counttab;
    public PageAdapter(@NonNull FragmentManager fm, int counttab) {
        super(fm,counttab);
        this.counttab= counttab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

    switch (position){

        case 0:
            UpdatesFragment updatesFragment= new UpdatesFragment();
            return  updatesFragment;
        case 1:
            InstalledFragment installedFragment= new InstalledFragment();
            return installedFragment;

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
