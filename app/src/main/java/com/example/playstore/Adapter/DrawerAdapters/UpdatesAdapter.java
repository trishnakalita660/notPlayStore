package com.example.playstore.Adapter.DrawerAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.playstore.Models.appUpdate;
import com.example.playstore.R;

import java.util.ArrayList;

public class UpdatesAdapter extends RecyclerView.Adapter<UpdatesAdapter.viewholder> {
    private Context tcontext;
    private ArrayList<appUpdate> hlist;
    private View.OnClickListener onItemClickListener;

    public UpdatesAdapter(Context tcontext, ArrayList<appUpdate> hlist) {
        this.tcontext = tcontext;
        this.hlist = hlist;
    }
    public void setOnItemClickListener(View.OnClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_updates, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.imageView.setImageResource(hlist.get(position).getImages());
        holder.name.setText(hlist.get(position).getName());
        holder.size.setText(hlist.get(position).getSize());
        holder.expandTitle.setText(hlist.get(position).getWhatsNew());
        boolean isExpanded= hlist.get(position).isExpanded();
        holder.expandable.setVisibility(isExpanded ? View.VISIBLE: View.GONE);


    }

    @Override
    public int getItemCount() {
        return hlist.size();
    }

    public class  viewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView size;
        ImageButton Button;
        TextView expandTitle;

        ConstraintLayout expandable;
    public viewholder(@NonNull View itemView) {
        super(itemView);
   imageView=itemView.findViewById(R.id.iv_app_icon_updates);
   name=itemView.findViewById(R.id.tv_updates_appName);
   size=itemView.findViewById(R.id.tv_updates_appsize);
   Button= itemView.findViewById(R.id.ib_rv_installed);
    expandable=itemView.findViewById(R.id.expandable_layout);

    expandTitle=itemView.findViewById(R.id.expand_title);
    Button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            appUpdate appUpdate= hlist.get(getAdapterPosition());
            appUpdate.setExpanded(!appUpdate.isExpanded());
           notifyItemChanged(getAdapterPosition());

        }
    });
    }
}

}
