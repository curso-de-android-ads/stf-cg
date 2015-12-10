package com.example.jpadm.paises.model;

/**
 * Created by jpadm on 09/12/2015.
 */
public class Country {

    private String name;
    private String capital;
    private String language;
    private int flagResourceId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFlagResourceId() {
        return flagResourceId;
    }

    public void setFlagResourceId(int flagResourceId) {
        this.flagResourceId = flagResourceId;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", language='" + language + '\'' +
                ", flagResourceId=" + flagResourceId +
                '}';
    }
}
