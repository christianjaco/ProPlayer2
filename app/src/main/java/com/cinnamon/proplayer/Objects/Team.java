package com.cinnamon.proplayer.Objects;

public class Team {

private Player player;
private Integer logo;
private Stadium stadium;
private Integer puntaje;
private Integer diferenciagol;
private Integer fairplay;
private League league;
private String nombre;
private Integer partidosJugados;
private Integer partidosGanados;
private Integer partidosEmpatados;
private Integer partidosPerdidos;
private Integer ranking;


    public Team(Integer ranking, Integer logo, Integer puntaje, Integer diferenciagol, Integer fairplay, String nombre, Integer partidosJugados, Integer partidosGanados, Integer partidosEmpatados, Integer partidosPerdidos) {
        this.ranking = ranking;
        this.logo = logo;
        this.puntaje = puntaje;
        this.diferenciagol = diferenciagol;
        this.fairplay = fairplay;
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
    }

    public Team(Integer logo, Integer puntaje, Integer diferenciagol, Integer fairplay, String nombre) {
        this.logo = logo;
        this.puntaje = puntaje;
        this.diferenciagol = diferenciagol;
        this.fairplay = fairplay;
        this.nombre = nombre;
    }

    public Team(String nombre) {
        this.nombre = nombre;
    }

    public Team(Integer puntaje, String nombre, Integer posicion) {
        this.puntaje = puntaje;
        this.nombre = nombre;
        this.ranking = posicion;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getLogo() {
        return logo;
    }

    public void setLogo(Integer logo) {
        this.logo = logo;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getDiferenciagol() {
        return diferenciagol;
    }

    public void setDiferenciagol(Integer diferenciagol) {
        this.diferenciagol = diferenciagol;
    }

    public Integer getFairplay() {
        return fairplay;
    }

    public void setFairplay(Integer fairplay) {
        this.fairplay = fairplay;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(Integer partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public Integer getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(Integer partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public Integer getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(Integer partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public Integer getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(Integer partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
