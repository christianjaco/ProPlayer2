package com.cinnamon.proplayer.Adapters;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cinnamon.proplayer.Fragments.NewsItemFragment;
import com.cinnamon.proplayer.Objects.Match;
import com.cinnamon.proplayer.Objects.News;
import com.cinnamon.proplayer.Objects.Player;
import com.cinnamon.proplayer.Objects.Team;
import com.cinnamon.proplayer.R;

import java.util.List;
/*
Recycler que actua como madre del resto solo en la parte del seteo de datos (Bind)
 */
public class RecyclerAdapter extends RecyclerView.Adapter {

    private List<News>newsList;
    private Context context;
    private CardView cardView;

    public RecyclerAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_news_detalle,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final News news = newsList.get(position);

        final ViewHolder mailboxViewHolder = (ViewHolder) holder;
        mailboxViewHolder.bindNews(news);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Abro posicion "+ position,Toast.LENGTH_SHORT).show();

/*
                //Inflate the fragment

                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                NewsItemFragment fragmentNewItem = new NewsItemFragment();

                //Bundle
                String args = "valorString";
                Bundle bundle = new Bundle();
                bundle.putString("clave", args);
                fragmentNewItem.setArguments(bundle);


                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentNewItem).addToBackStack(null).commit();

*/
            }
        });
    }


    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView titulo;

        private TextView name;
        private ImageView moral;
        private TextView goles;
        private TextView promedio;
        private TextView posicion;
        private ImageView profile_picture;

        private TextView nombre_equipo;
        private TextView puntaje;
        private TextView ranking;
        private ImageView escudo_equipo;

        private TextView rival;
        private TextView resultado;
        private TextView estadio;
        private TextView condicionPartido;
        private TextView partidosJugados;
        private TextView diferenciaGol;
        private TextView fairPlay;
        private ImageView escudo_rival;
        private ImageView dot_fixture;
        private FrameLayout pos_clasif;



        public ViewHolder(View itemView) {

            //Relaciono a cada item del layout con el codigo
            super(itemView);

            titulo = (TextView)itemView.findViewById(R.id.news_title);
            imagen = (ImageView)itemView.findViewById(R.id.news_image);

            name = (TextView)itemView.findViewById(R.id.name);
            moral = (ImageView) itemView.findViewById(R.id.moral);
            goles = (TextView)itemView.findViewById(R.id.goles);
            promedio = (TextView)itemView.findViewById(R.id.promedio);
            posicion = (TextView)itemView.findViewById(R.id.position);
            profile_picture =(ImageView)itemView.findViewById(R.id.profile_picture);

            nombre_equipo = (TextView)itemView.findViewById(R.id.nombre_equipo);
            puntaje = (TextView)itemView.findViewById(R.id.puntaje);
            ranking = (TextView)itemView.findViewById(R.id.ranking);
            escudo_equipo =(ImageView)itemView.findViewById(R.id.escudo_equipo);
            partidosJugados=(TextView)itemView.findViewById(R.id.partidos_jugados);
            diferenciaGol=(TextView)itemView.findViewById(R.id.difencia_gol);
            fairPlay=(TextView)itemView.findViewById(R.id.fair_play);


            rival =(TextView)itemView.findViewById(R.id.rival);
            resultado = (TextView)itemView.findViewById(R.id.resultado);
            estadio = (TextView)itemView.findViewById(R.id.estadio);
            condicionPartido = (TextView)itemView.findViewById(R.id.condicion_partido);
            escudo_rival = (ImageView)itemView.findViewById(R.id.escudo_rival);
            dot_fixture = (ImageView) itemView.findViewById(R.id.won_lost_image);
            pos_clasif = (FrameLayout) itemView.findViewById(R.id.frame_positions);

            }

        //Seteo las noticias
        public void bindNews(News news) {

            titulo.setText(news.getTitulo());
            imagen.setImageResource(news.getFoto());
            }

        //Seteo a los jugadores
        public void bindPlayers(Player player){


            if (player.getLesionado()==true){
                name.setText(player.getName());
                //name.setTextColor(Color.RED);
            } else {
                name.setText(player.getName());
            }

            goles.setText(player.getGol().toString());
            promedio.setText(player.getPromedio().toString());
            posicion.setText(player.getPosicion());
            profile_picture.setImageResource(player.getAvatar());
            moral.setImageResource(player.getMoral());
            

            if (player.getMoral() == R.drawable.moral_alta){
                moral.setColorFilter(Color.rgb(74,146,59));
            } else if (player.getMoral() == R.drawable.moral_baja){
                moral.setColorFilter(Color.rgb(212,40,46));
            } else {
                moral.setColorFilter(Color.rgb(252,146,71));
            }

        }
        //Seteo a los equipos
        public void bindTeam(Team team){
            
            nombre_equipo.setText(team.getNombre());
            puntaje.setText(team.getPuntaje().toString());
            escudo_equipo.setImageResource(team.getEscudo());
            ranking.setText(team.getRanking().toString());
            partidosJugados.setText(team.getPartidosJugados().toString());
            diferenciaGol.setText(team.getDiferenciagol().toString());
            fairPlay.setText(team.getFairplay().toString());

            pos_clasif.setBackgroundResource(R.drawable.rounded_shape);

            GradientDrawable drawable = (GradientDrawable) pos_clasif.getBackground();

           if(team.getRanking()<= 3){
                drawable.setColor(Color.rgb(255,215,0));
            }
            else if(team.getRanking()<= 6){
               drawable.setColor(Color.rgb(192,192,192));
            }
            else if (team.getRanking()<= 9){
               drawable.setColor(Color.rgb(205,127,50));
            }
            else if (team.getRanking()<= 20){
               drawable.setColor(Color.rgb(255,255,255));
           }

        }

        //Seteo los partidos
        public void bindMatch(Match match){
            rival.setText(match.getRival());
            resultado.setText(match.getResultado());
            estadio.setText(match.getEstadio());
            condicionPartido.setText(match.getCondicionPartido());
            escudo_rival.setImageResource(match.getEscudo());
            dot_fixture.setImageResource(match.getWon_lost());



            if (match.getGano() == 1){
                dot_fixture.setColorFilter(Color.rgb(0,210,0));

            }else if (match.getGano() == 0){
                dot_fixture.setColorFilter(Color.rgb(220,0,0));
            } else {
                dot_fixture.setColorFilter(Color.rgb(230,230,0));
            }
        }
    }
}

