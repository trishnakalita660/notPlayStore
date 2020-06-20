package com.example.playstore.GamesTabLayoutFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playstore.Adapter.DrawerAdapters.GamesPageAdapter;
import com.example.playstore.Adapter.DrawerAdapters.UpdatesAdapter;
import com.example.playstore.Adapter.GamesRvAdapter;
import com.example.playstore.Models.appUpdate;
import com.example.playstore.Models.forYou;
import com.example.playstore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForYouFragment extends Fragment {

View view;
RecyclerView recyclerView;
GamesRvAdapter gamesRvAdapter;
    ArrayList<forYou> forYou;

    //private UpdatesAdapter updatesAdapter;
    private LinearLayoutManager layoutManager;

    public ForYouFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
view= inflater.inflate(R.layout.fragment_for_you, container, false);
recyclerView=view.findViewById(R.id.for_you_top_rv);
initRecyclerView();
        return view;
    }
    private void initRecyclerView() {


        forYou=new ArrayList<>();
        forYou.add(new forYou("WhatsApp"));
        forYou.add(new forYou("WhatsAppeeeeeeeeeeeeeeeeeee"));
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(layoutManager);
        GamesRvAdapter adapter = new GamesRvAdapter(forYou,getActivity());
        recyclerView.setAdapter(adapter);
    }
}

