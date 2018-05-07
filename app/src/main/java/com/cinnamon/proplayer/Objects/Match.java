package com.cinnamon.proplayer.Objects;

public class Match {

    private String rival;
    private String estadio;
    private Integer escudo;
    private String resultado;
    private String condicionPartido;
    private Integer gano;

    private String dia;
    private String hora;
    private Stadium cancha;

    private Integer goles;
    private String goleadores;
    private Player player;

    public Match(String rival, String estadio, Integer escudo, String resultado, String condicionPartido, String dia, String hora, Stadium cancha, Integer goles, String goleadores, Player player) {
        this.rival = rival;
        this.estadio = estadio;
        this.escudo = escudo;
        this.resultado = resultado;
        this.condicionPartido = condicionPartido;
        this.dia = dia;
        this.hora = hora;
        this.cancha = cancha;
        this.goles = goles;
        this.goleadores = goleadores;
        this.player = player;
    }

    public Match(Integer escudo, String rival, String estadio, String resultado, String condicionPartido, Integer gano) {
        this.escudo = escudo;
        this.rival = rival;
        this.estadio = estadio;
        this.resultado = resultado;
        this.condicionPartido = condicionPartido;
        this.gano = gano;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Integer getEscudo() {
        return escudo;
    }

    public void setEscudo(Integer escudo) {
        this.escudo = escudo;
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

    public Integer getGano() {
        return gano;
    }

    public void setGano(Integer gano) {
        this.gano = gano;
    }
}
