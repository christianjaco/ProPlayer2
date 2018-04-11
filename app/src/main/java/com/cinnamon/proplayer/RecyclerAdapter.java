package com.cinnamon.proplayer;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter {

    private List<News>newsList;
    private Context context;

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



        public ViewHolder(View itemView) {

            super(itemView);

            titulo = (TextView)itemView.findViewById(R.id.news_title);
            imagen = (ImageView)itemView.findViewById(R.id.news_image);
            name = (TextView)itemView.findViewById(R.id.name);
            moral = (ImageView) itemView.findViewById(R.id.moral);
            goles = (TextView)itemView.findViewById(R.id.goles);
            promedio = (TextView)itemView.findViewById(R.id.promedio);
            posicion = (TextView)itemView.findViewById(R.id.position);
            profile_picture =(ImageView)itemView.findViewById(R.id.profile_picture);
            }

        public void bindNews(News news) {

            titulo.setText(news.getTitulo());
            imagen.setImageResource(news.getFoto());
            }

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
                moral.setColorFilter(Color.rgb(228,212,0));
            }

        }
    }
}

