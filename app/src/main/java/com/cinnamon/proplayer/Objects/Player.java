package com.cinnamon.proplayer.Objects;

public class  Player {

    private Integer age;
    private String name;
    private Integer avatar;
    private String leg;
    private String posicion;
    private Team team;
    private Integer numero;
    private Integer gol;
    private Integer appearences;
    private Double promedio;
    private Integer amarillas;
    private Integer rojas;
    private Integer moral;
    private Boolean lesionado;


    public Player(Integer avatar, String name, Integer moral,String posicion, Integer gol, Double promedio,Boolean lesionado) {
        this.avatar = avatar;
        this.name = name;
        this.moral = moral;
        this.posicion = posicion;
        this.gol = gol;
        this.promedio = promedio;
        this.lesionado = lesionado;
    }

    public Player(String name) {
        this.name = name;
    }

    public Integer getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(Integer amarillas) {
        this.amarillas = amarillas;
    }

    public Integer getRojas() {
        return rojas;
    }

    public void setRojas(Integer rojas) {
        this.rojas = rojas;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getGol() {
        return gol;
    }

    public void setGol(Integer gol) {
        this.gol = gol;
    }

    public Integer getAppearences() {
        return appearences;
    }

    public void setAppearences(Integer appearences) {
        this.appearences = appearences;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Integer getMoral() {
        return moral;
    }

    public void setMoral(Integer moral) {
        this.moral = moral;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public void setLesionado(Boolean lesionado) {
        this.lesionado = lesionado;
    }
}
