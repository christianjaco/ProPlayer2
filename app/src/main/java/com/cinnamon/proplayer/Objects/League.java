package com.cinnamon.proplayer.Objects;

public class League {

    private Team team;
    private Integer position;
    private String Name;
    private Integer Logo;

    public League(Team team, Integer position, String name, Integer logo) {
        this.team = team;
        this.position = position;
        Name = name;
        Logo = logo;
    }

    public League(String name, Integer logo) {
        Name = name;
        Logo = logo;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getLogo() {
        return Logo;
    }

    public void setLogo(Integer logo) {
        Logo = logo;
    }
}
