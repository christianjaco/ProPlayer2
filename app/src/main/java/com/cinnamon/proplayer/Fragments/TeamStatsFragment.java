package com.cinnamon.proplayer.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.proplayer.Adapters.RecyclerAdapterTeamStats;
import com.cinnamon.proplayer.Objects.Player;
import com.cinnamon.proplayer.R;

import java.util.ArrayList;
import java.util.List;
/*

    xml: recycler_view_plantilla
    Se implementa el RecyclerAdapterLeagueTeamStats (ViewHolder del RecyclerView)
    Se hardcodean los Team que se crean en el BindPlayer del RecyclerAdapter

     */

public class TeamStatsFragment extends Fragment {

    private View view;
    private List<Player> players;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_players,container,false);


        players = new ArrayList<>();
        addPlayer();


        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view_plantilla);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(new RecyclerAdapterTeamStats(players,getContext()));
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private void addPlayer() {
        players.add(new Player(R.drawable.profile_foto,"Christian Jaco",R.drawable.moral_alta,"POR",0,8.57,false));
        players.add(new Player(R.drawable.profile_foto,"Nico Ferluga",R.drawable.moral_normal,"DEL",5,8.57,true));
        players.add(new Player(R.drawable.profile_foto,"Fede Ferluga",R.drawable.moral_alta,"DEL",4,8.57,false));
        players.add(new Player(R.drawable.profile_foto,"Rodrigo Ferluga",R.drawable.moral_normal,"DEF",2,8.57,false));
        players.add(new Player(R.drawable.profile_foto,"Nacho Herrera",R.drawable.moral_alta,"MED",8,8.57,false));
        players.add(new Player(R.drawable.profile_foto,"Sebi Ferluga",R.drawable.moral_baja,"DEF",2,8.57,false));
        players.add(new Player(R.drawable.profile_foto,"Juani Paillet",R.drawable.moral_normal,"DEF",6,8.57,false));
        players.add(new Player(R.drawable.profile_foto,"Nacho Leyro",R.drawable.moral_alta,"MED",2,8.57,false));
    }
}
