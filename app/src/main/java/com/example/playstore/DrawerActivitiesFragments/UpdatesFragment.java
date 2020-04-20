package com.example.playstore.DrawerActivitiesFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playstore.Adapter.DrawerAdapters.UpdatesAdapter;
import com.example.playstore.Lists.appUpdate;
import com.example.playstore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpdatesFragment extends Fragment {
    ArrayList<appUpdate> appUpdates;

    RecyclerView recyclerView;

    //private UpdatesAdapter updatesAdapter;
    private LinearLayoutManager layoutManager;


    public UpdatesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_updates, container, false);
    recyclerView=view.findViewById(R.id.recycler_updates);
    initRecyclerView();
       return view;
    }
    private void initRecyclerView() {


        appUpdates=new ArrayList<>();
        appUpdates.add(new appUpdate(R.drawable.ic_launcher_background,"WhatsApp","31 MB","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
        appUpdates.add(new appUpdate(R.drawable.ic_launcher_background,"WhatsApp","31 MB","what's New"));
        appUpdates.add(new appUpdate(R.drawable.ic_launcher_background,"WhatsApp","31 MB","what's New"));
        appUpdates.add(new appUpdate(R.drawable.ic_launcher_background,"WhatsApp","31 MB","what's New"));
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(layoutManager);
        UpdatesAdapter adapter = new UpdatesAdapter(getActivity(), appUpdates);
        recyclerView.setAdapter(adapter);
    }

}
