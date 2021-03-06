package com.cinnamon.proplayer.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.proplayer.Adapters.RecyclerAdapterLeagueStats;
import com.cinnamon.proplayer.Objects.Team;
import com.cinnamon.proplayer.R;

import java.util.ArrayList;
import java.util.List;

     /*

    xml: recycler_view_league
    Se implementa el RecyclerAdapterLeagueStats (ViewHolder del RecyclerView)
    Se hardcodean los Team que se crean en el BindTeam del RecyclerAdapter

     */

public class LeagueStatsFragment extends Fragment {
    View view;
    private List<Team> teams;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_league, container, false);

        teams = new ArrayList<>();
        AddTeam();


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_league);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(new RecyclerAdapterLeagueStats(teams, getContext()));
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private void AddTeam() {
        teams.add(new Team(R.drawable.escudo_gordos,53,"Gordos Rockets",1,12,31,1));
        teams.add(new Team(R.drawable.escudo_gordos,50,"Pectus Frigore",2,12,12,0));
        teams.add(new Team(R.drawable.escudo_gordos,48,"Talleres",3,12,23,1));
        teams.add(new Team(R.drawable.escudo_gordos,46,"La Famosa G",4,12,45,1));
        teams.add(new Team(R.drawable.escudo_gordos,40,"Deportivo Polvorines",5,12,27,1));
        teams.add(new Team(R.drawable.escudo_gordos,40,"Hellas FC",6,12,12,9));
        teams.add(new Team(R.drawable.escudo_gordos,37,"Gregoria FC",7,12,5,12));
        teams.add(new Team(R.drawable.escudo_gordos,30,"Dromedarios",8,12,0,31));
        teams.add(new Team(R.drawable.escudo_gordos,30,"Estelar Futbol Club",9,12,0,12));
        teams.add(new Team(R.drawable.escudo_gordos,22,"Tikki Bar",10,12,0,12));
        teams.add(new Team(R.drawable.escudo_gordos,18,"Volley FC",11,12,0,12));
        teams.add(new Team(R.drawable.escudo_gordos,16,"Poco Pique",12,12,0,12));
        teams.add(new Team(R.drawable.escudo_gordos,8,"Peppa Pig",13,12,0,12));
        teams.add(new Team(R.drawable.escudo_gordos,7,"Macacos FC",14,12,0,12));
        //teams.add(new Team(R.drawable.escudo_gordos,5,"La Gilada",15,12,8,0));
    }
}
