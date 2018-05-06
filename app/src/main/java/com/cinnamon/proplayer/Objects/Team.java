package com.cinnamon.proplayer.Objects;

public class Team {

private Player player;
private Integer escudo;
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



    public Team(Integer escudo,Integer puntaje, String nombre, Integer ranking, Integer partidosJugados,Integer diferenciagol,Integer fairplay) {
        this.escudo = escudo;
        this.puntaje = puntaje;
        this.nombre = nombre;
        this.ranking = ranking;
        this.partidosJugados=partidosJugados;
        this.diferenciagol = diferenciagol;
        this.fairplay=fairplay;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getEscudo() {
        return escudo;
    }

    public void setEscudo(Integer escudo) {
        this.escudo = escudo;
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
