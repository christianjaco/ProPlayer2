package com.cinnamon.proplayer.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.proplayer.Objects.Player;
import com.cinnamon.proplayer.R;

import java.util.List;

public class RecyclerAdapterConvocatoria extends RecyclerView.Adapter {

    private List<Player> convocados;
    private Context context;

    public RecyclerAdapterConvocatoria(List<Player> players, Context context) {
        this.convocados = players;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_convocatoria,parent,false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Player player = convocados.get(position);

        RecyclerAdapter.ViewHolder viewHolderPlayers = (RecyclerAdapter.ViewHolder)holder;
        viewHolderPlayers.bindConvocatoria(player);
    }

    @Override
    public int getItemCount() {
        return convocados.size();
    }
}
