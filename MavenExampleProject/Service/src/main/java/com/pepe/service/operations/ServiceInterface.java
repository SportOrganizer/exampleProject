/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.service.operations;

import com.pepe.dao.model.Teams;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author peter
 */

public interface ServiceInterface {
    
    @Transactional ///////anotujeme kde robime s dbs.. hlavne kde menime data a moze nastat chyba - rollback
    Teams findByNameAndSkratka();
    @Transactional
    String capitanNameTest();
    @Transactional
    Teams createTeam(String name, String skratka);
    @Transactional
    void setNameForSkratkaTest(String name, String skratka);
    
}
