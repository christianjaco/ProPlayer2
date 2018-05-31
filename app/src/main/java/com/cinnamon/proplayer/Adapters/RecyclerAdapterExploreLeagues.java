package com.cinnamon.proplayer.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cinnamon.proplayer.Objects.League;
import com.cinnamon.proplayer.R;

import java.util.List;

public class RecyclerAdapterExploreLeagues extends RecyclerView.Adapter {


    private List<League> leagues;
    private Context context;

    public RecyclerAdapterExploreLeagues(List<League> leagues, Context context) {
        this.leagues = leagues;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_explore_leagues_detalle,parent,false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        League league = leagues.get(position);
        RecyclerAdapter.ViewHolder viewHolderLeagues = (RecyclerAdapter.ViewHolder)holder;
        viewHolderLeagues.bindLeague(league);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Abro Liga"+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return leagues.size();
    }
}
