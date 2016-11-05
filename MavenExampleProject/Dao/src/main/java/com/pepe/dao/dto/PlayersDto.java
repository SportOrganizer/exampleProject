/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author peter
 */
@XmlType
@XmlRootElement(name="PlayersDto")
public class PlayersDto {
    
    @XmlElement(name = "id")
    private Integer id;
    @XmlElement(name = "team")
     private TeamsDto teams;
    @XmlElement(name = "meno")
     private String meno;
    @XmlElement(name = "priezvisko")
     private String priezvisko;
    @XmlElement(name = "cislo")
     private int cislo;
    @XmlElement(name = "datumNarodenia")
     private Date datumNarodenia;
    
    @XmlElementWrapper(name="timy")
    @XmlElement(name="tim")
     private Set<TeamsDto> teamses = new HashSet<>(0);

    public PlayersDto() {
    }

    public PlayersDto(Integer id, TeamsDto teams, String meno, String priezvisko, int cislo, Date datumNarodenia) {
        this.id = id;
        this.teams = teams;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.cislo = cislo;
        this.datumNarodenia = datumNarodenia;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TeamsDto getTeams() {
        return teams;
    }

    public void setTeams(TeamsDto teams) {
        this.teams = teams;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public Date getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(Date datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    public Set<TeamsDto> getTeamses() {
        return teamses;
    }

    public void setTeamses(Set<TeamsDto> teamses) {
        this.teamses = teamses;
    }
     
     
    
}
