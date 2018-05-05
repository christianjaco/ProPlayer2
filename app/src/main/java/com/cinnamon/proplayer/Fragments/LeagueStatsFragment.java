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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_league, container, false);

        List<Team> teams = new ArrayList<>();
        teams.add(new Team(53,"Gordos Rockets",1));
        teams.add(new Team(50,"Pectus Frigore",2));
        teams.add(new Team(48,"Talleres",3));
        teams.add(new Team(46,"La Famosa G",4));
        teams.add(new Team(40,"Deportivo Polvorines",5));
        teams.add(new Team(40,"Hellas FC",6));
        teams.add(new Team(39,"La Gilada",7));
        teams.add(new Team(37,"Gregoria FC",8));
        teams.add(new Team(30,"Dromedarios",9));
        teams.add(new Team(30,"Estelas Futbol Club",10));
        //teams.add(new Team(14,"Tikki Bar",11));
        //teams.add(new Team(8,"Club di Paglia",12));


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_league);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(new RecyclerAdapterLeagueStats(teams, getContext()));
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
