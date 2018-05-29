package com.cinnamon.proplayer.Adapters;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cinnamon.proplayer.Adapters.RecyclerAdapter;
import com.cinnamon.proplayer.Fragments.NewsItemFragment;
import com.cinnamon.proplayer.Objects.Player;
import com.cinnamon.proplayer.R;

import java.util.List;

/*
Se implementa el onBindViewHolder que viene del RecyclerAdapter(BindPlayers)
 */

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
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Player player = players.get(position);

        RecyclerAdapter.ViewHolder viewHolderPlayers = (RecyclerAdapter.ViewHolder)holder;
        viewHolderPlayers.bindPlayers(player);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(context,"Abro posicion "+position,Toast.LENGTH_SHORT).show();

                         }
        });



    }

    @Override
    public int getItemCount() {
        return players.size();
    }

}
