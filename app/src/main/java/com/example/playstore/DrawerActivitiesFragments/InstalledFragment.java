package com.example.playstore.DrawerActivitiesFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playstore.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InstalledFragment extends Fragment {


    public InstalledFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_installed, container, false);
    }

}
