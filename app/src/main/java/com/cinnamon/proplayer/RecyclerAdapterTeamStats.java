package com.cinnamon.proplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerAdapterTeamStats extends RecyclerView.Adapter {

    private List<Player> players;
    private Context context;

    public RecyclerAdapterTeamStats(List<Player> players, Context context) {
        this.players = players;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_plantilla_detalle,parent,false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Player player = players.get(position);

        RecyclerAdapter.ViewHolder viewHolderPlayers = (RecyclerAdapter.ViewHolder)holder;
        viewHolderPlayers.bindPlayers(player);
    }

    @Override
    public int getItemCount() {
        return players.size();
    }
}
