package com.cinnamon.proplayer.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.proplayer.Adapters.RecyclerAdapterFixture;
import com.cinnamon.proplayer.Objects.Match;
import com.cinnamon.proplayer.R;

import java.util.ArrayList;
import java.util.List;

/*

    xml: recycler_view_fixture
    Se implementa el RecyclerAdapterFixture (ViewHolder del RecyclerView)
    Se hardcodean los matches que se crean en el BindMatches del RecyclerAdapter

     */

public class FixtureFragment extends Fragment {

    private View view;

    private List<Match>matches;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fixture,container,false);


        matches = new ArrayList<>();
        addMatch();

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view_fixture);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(new RecyclerAdapterFixture(matches,getContext()));
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private void addMatch(){
        matches.add(new Match(R.drawable.volley,"Talleres","L","2-0","Playoff",1,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.volley,"Pectus Frigore","V","1-3","Liga",0,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.escudo_gordos,"La Famosa G","L","5-0","Liga",1,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.volley,"Deportivo Polvorines","V","0-0","Liga",2,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.volley,"Hellas FC","L","6-0","Amistoso",1,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.escudo_gordos,"La Gilada","V","0-4","Liga",0,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.escudo_gordos,"Gregoria FC","L","5-1","Amistoso",1,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.volley,"Dromedarios","V","1-0","Amistoso",1,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.escudo_gordos,"Estelares Futbol Club","L","2-0","Liga",1,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.escudo_gordos,"Hellas FC","L","3-0","Liga",1,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.escudo_gordos,"Pectus Frigore","V","0-1","Amistoso",0,R.drawable.dot_fixture));
        matches.add(new Match(R.drawable.escudo_gordos,"Talleres","V","2-0","Liga",1,R.drawable.dot_fixture));

    }
}
