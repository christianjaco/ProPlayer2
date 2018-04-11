package com.cinnamon.proplayer;

public class Team {

private Player player;
private Integer logo;
private Stadium stadium;
private League league;

    public Team(Player player, Integer logo, Stadium stadium, League league) {
        this.player = player;
        this.logo = logo;
        this.stadium = stadium;
        this.league = league;
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
}
