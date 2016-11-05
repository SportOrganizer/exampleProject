/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.service.operations;

import com.pepe.dao.dto.TeamsDto;
import com.pepe.dao.konverter.Konverter;
import com.pepe.dao.model.Teams;
import com.pepe.dao.repository.TeamsRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author peter
 */
@Service
public class ServiceImpl /*implements ServiceInterface*/ {
    
    static Logger log = Logger.getLogger(ServiceImpl.class.getName()); /// logovanie..
                                                //// properties v resources/log4j.properties

    @Autowired
    private TeamsRepository repo;
    
    public int findAllsize(){
        return repo.findAll().size();
    }

    //@Override
    public Teams findByNameAndSkratka() {
        return repo.findByNameAndSkratka("dinosaury", "dino").get(0);
    }

    //@Override
    public String capitanName(int id) {
        return repo.findOne(id).getPlayers().getMeno();
    }

    //@Override
//    @Transactional ///////anotujeme kde robime s dbs.. hlavne kde menime data a moze nastat chyba - rollback
//    public Teams createTeam(String name, String skratka) {
//        log.info("vytvarame novy tim s name: "+name+" a skratka:"+skratka);
//        Teams team = new Teams();
//        team.setName(name);
//        team.setSkratka(skratka);
//        repo.saveAndFlush(team);
//        return team;
//    }
    
        @Transactional ///////anotujeme kde robime s dbs.. hlavne kde menime data a moze nastat chyba - rollback
    public TeamsDto createTeam(String name, String skratka) {
        log.info("vytvarame novy tim s name: "+name+" a skratka:"+skratka);
        Teams team = new Teams();
        team.setName(name);
        team.setSkratka(skratka);
        repo.saveAndFlush(team);
        return Konverter.teamsDaoToDto(team);
    }

    //@Override
    @Transactional ///////anotujeme kde robime s dbs.. hlavne kde menime data a moze nastat chyba - rollback
    public void setNameForSkratkaTest(String name, String skratka) {
       repo.setNameForSkratka(name, skratka);
    }

}
