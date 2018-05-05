package com.cinnamon.proplayer.Objects;

public class Match {
    private String local;
    private String visitante;
    private String resultado;
    private String condicionPartido;

    private String dia;
    private String hora;
    private Stadium cancha;

    private Integer goles;
    private String goleadores;
    private Player player;

    public Match(String local, String visitante, String resultado, String campeonato, Integer goles, String goleadores, Player player) {
        this.local = local;
        this.visitante = visitante;
        this.resultado = resultado;
        this.condicionPartido = campeonato;
        this.goles = goles;
        this.goleadores = goleadores;
        this.player = player;
    }

    public Match(String local, String visitante, String resultado,String condicionPartido) {
        this.local = local;
        this.visitante = visitante;
        this.resultado = resultado;
        this.condicionPartido = condicionPartido;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public String getGoleadores() {
        return goleadores;
    }

    public void setGoleadores(String goleadores) {
        this.goleadores = goleadores;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getCampeonato() {
        return condicionPartido;
    }

    public void setCampeonato(String campeonato) {
        this.condicionPartido = campeonato;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Stadium getCancha() {
        return cancha;
    }

    public void setCancha(Stadium cancha) {
        this.cancha = cancha;
    }

    public String getCondicionPartido() {
        return condicionPartido;
    }

    public void setCondicionPartido(String condicionPartido) {
        this.condicionPartido = condicionPartido;
    }
}
