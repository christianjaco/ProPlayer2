package com.cinnamon.proplayer.Adapters;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cinnamon.proplayer.Adapters.RecyclerAdapter;
import com.cinnamon.proplayer.Objects.Match;
import com.cinnamon.proplayer.R;

import java.util.List;

/*
Se implementa el onBindViewHolder que viene del RecyclerAdapter(BindMatch)
 */

public class RecyclerAdapterFixture extends RecyclerView.Adapter {

    private List<Match> matches;
    private Context context;

    public RecyclerAdapterFixture(List<Match> matches, Context context) {
        this.matches = matches;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_fixture_detalle,parent,false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        Match match = matches.get(position);
        RecyclerAdapter.ViewHolder viewHolderMatches = (RecyclerAdapter.ViewHolder)holder;
        viewHolderMatches.bindMatch(match);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(context,"Abro posicion "+position,Toast.LENGTH_SHORT).show();            }
        });
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
}
