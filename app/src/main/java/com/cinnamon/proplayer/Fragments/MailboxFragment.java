package com.cinnamon.proplayer.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.proplayer.Adapters.RecyclerAdapter;
import com.cinnamon.proplayer.Objects.News;
import com.cinnamon.proplayer.R;

import java.util.ArrayList;
import java.util.List;

/*

    xml: recycler_view
    Se implementa el RecyclerAdapter (ViewHolder del RecyclerView)
    Se hardcodean los Team que se crean en el BindNews del RecyclerAdapter

     */

public class MailboxFragment extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mailbox,container,false);


        List<News> newslist = new ArrayList<>();

        newslist.add(new News(R.drawable.escudo_gordos,"Solicitud de Fichaje: Gordos Rocket"));
        newslist.add(new News(R.drawable.volley,"Proximo Partido: Volley FC"));
        newslist.add(new News(R.drawable.tabla_goleadores,"¡Hat-trick! Felicidades goleador"));
        newslist.add(new News(R.drawable.puntero,"¡Gordos Rocket puntero!"));
        newslist.add(new News(R.drawable.tabla_goleadores,"Pichichi: Sos el nuevo goleador de la liga"));
        newslist.add(new News(R.drawable.amistoso,"Propuesta de amistoso: Estelares FC"));
        newslist.add(new News(R.drawable.tabla_goleadores,"Clasificaste a la Tabla General Goleadores"));
        newslist.add(new News(R.drawable.sancion,"Sancionado: Te perdes el proximo partido"));
        newslist.add(new News(R.drawable.desafio_completado,"Enhorabuena: Desafio completado"));


        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(new RecyclerAdapter(newslist,getContext()));
        recyclerView.setLayoutManager(layoutManager);


        return view;

    }
}
