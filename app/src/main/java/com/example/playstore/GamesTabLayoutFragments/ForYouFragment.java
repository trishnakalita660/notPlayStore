package com.example.playstore.GamesTabLayoutFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playstore.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForYouFragment extends Fragment {


    public ForYouFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_for_you, container, false);
    }

}