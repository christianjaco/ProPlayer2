package com.cinnamon.proplayer.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        News news = newsList.get(position);

        ViewHolder mailboxViewHolder = (ViewHolder) holder;
        mailboxViewHolder.bindNews(news);
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

        private TextView equipoLocal;
        private TextView resultado;
        private TextView equipoVisitante;
        private TextView condicionPartido;


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

            equipoLocal =(TextView)itemView.findViewById(R.id.equipo_local);
            resultado = (TextView)itemView.findViewById(R.id.resultado);
            equipoVisitante = (TextView)itemView.findViewById(R.id.equipo_visitante);
            condicionPartido = (TextView)itemView.findViewById(R.id.condicion_partido);
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

            if (player.getMoral() == R.drawable.moral_alta){
                moral.setImageResource(player.getMoral());
                moral.setColorFilter(Color.rgb(74,146,59));
            } else if (player.getMoral() == R.drawable.moral_baja){
                moral.setImageResource(player.getMoral());
                moral.setColorFilter(Color.rgb(212,40,46));
            } else {
                moral.setImageResource(player.getMoral());
                moral.setColorFilter(Color.rgb(252,146,71));
            }

        }
        //Seteo a los equipos
        public void bindTeam(Team team){
            CardView cardView = (CardView)itemView.findViewById(R.id.card_view);
            nombre_equipo.setText(team.getNombre());
            puntaje.setText(team.getPuntaje().toString());

            if(team.getRanking()<4){
                ranking.setText(team.getRanking().toString());
                cardView.setBackgroundColor(Color.rgb(255,215,0));
            }
            else if(team.getRanking()<7){
                ranking.setText(team.getRanking().toString());
                cardView.setBackgroundColor(Color.rgb(192,192,192));
            }
            else if (team.getRanking()<10){
                ranking.setText(team.getRanking().toString());
                cardView.setBackgroundColor(Color.rgb(205,127,50));
            } else {
                ranking.setText(team.getRanking().toString());
            }

        }

        //Seteo los partidos
        public void bindMatch(Match match){
            equipoLocal.setText(match.getLocal());
            resultado.setText(match.getResultado());
            equipoVisitante.setText(match.getVisitante());
            condicionPartido.setText(match.getCondicionPartido());
        }
    }
}

