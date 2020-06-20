package com.example.playstore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.playstore.Adapter.DrawerAdapters.GamesPageAdapter;
import com.example.playstore.Models.forYou;
import com.example.playstore.R;

import java.util.ArrayList;

public class GamesRvAdapter extends RecyclerView.Adapter<GamesRvAdapter.ViewHolder> {
    GamesPageAdapter gamesPageAdapter;
    private ArrayList<forYou> hlist;
    private Context tcontext;

    public GamesRvAdapter(ArrayList<forYou> hlist, Context tcontext) {
        this.hlist = hlist;
        this.tcontext = tcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_for_you,parent,false);
      return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.textView.setText(hlist.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return hlist.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.tv_test);
        }
    }
}
