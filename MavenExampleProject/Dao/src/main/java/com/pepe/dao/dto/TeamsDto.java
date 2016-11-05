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
@XmlRootElement(name = "TeamsDto")
public class TeamsDto {

    @XmlElement(name = "id")
    private Integer id;
    @XmlElement(name = "player")
    private PlayersDto player;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "skratka")
    private String skratka;
    @XmlElement(name = "regDate")
    private Date regDate;

    @XmlElementWrapper(name = "timy")
    @XmlElement(name = "tim")
    private Set<PlayersDto> playerses = new HashSet<>(0);

    public TeamsDto() {
    }

    public TeamsDto(Integer id, PlayersDto player, String name, String skratka, Date regDate) {
        this.id = id;
        this.player = player;
        this.name = name;
        this.skratka = skratka;
        this.regDate = regDate;
    }

    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PlayersDto getPlayer() {
        return player;
    }

    public void setPlayer(PlayersDto player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkratka() {
        return skratka;
    }

    public void setSkratka(String skratka) {
        this.skratka = skratka;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Set<PlayersDto> getPlayerses() {
        return playerses;
    }

    public void setPlayerses(Set<PlayersDto> playerses) {
        this.playerses = playerses;
    }
    
    

}
