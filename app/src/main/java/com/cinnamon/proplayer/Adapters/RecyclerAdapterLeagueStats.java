package com.cinnamon.proplayer.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cinnamon.proplayer.Adapters.RecyclerAdapter;
import com.cinnamon.proplayer.Objects.Team;
import com.cinnamon.proplayer.R;

import java.util.List;
/*
Se implementa el onBindViewHolder que viene del RecyclerAdapter(BindTeam)
 */
public class RecyclerAdapterLeagueStats extends RecyclerView.Adapter {

    private List<Team> teams;
    private Context context;

    public RecyclerAdapterLeagueStats(List<Team> teams, Context context) {
        this.teams = teams;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_league_detalle,parent,false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Team team = teams.get(position);

        RecyclerAdapter.ViewHolder viewHolderTeams= (RecyclerAdapter.ViewHolder)holder;
        viewHolderTeams.bindTeam(team);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Abro posicion "+position,Toast.LENGTH_SHORT).show();            }
        });

    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
