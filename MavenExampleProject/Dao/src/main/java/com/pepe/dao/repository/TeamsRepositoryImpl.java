/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.repository;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.Projections;
import com.pepe.dao.model.QPlayers;
import com.pepe.dao.model.QTeams;
import com.pepe.dao.model.Teams;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author peter
 */
public class TeamsRepositoryImpl implements TeamsRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    //////pomocou queryDsl.... o technologii http://www.querydsl.com/index.html
    @Override
    public List<MyDto> dajMenaKapitanov() {
        
        QTeams qZaznam = QTeams.teams; // tieto pomocne classy sa vytvaraju pri buildovani
        QPlayers qPlayers = QPlayers.players;

        //List<Tuple> l= new JPAQuery(em).from(qZaznam,qPlayers).where(qZaznam.players.eq(qPlayers)).list(qZaznam.name,qPlayers.meno);
        
        List<MyDto> l = new JPAQuery(em).from(qZaznam, qPlayers).where(qZaznam.players.eq(qPlayers)).list(Projections.bean(MyDto.class, qZaznam.name, qPlayers.meno));
        
        return l;
    }

    //klasicky pomocou NativeQuery a em
    @Override
    public List<Object[]> dajMenaKapitanov2() {

//treba este konvertovat potom do Dtocka a vraciat nie List objektov ale list Dtociek
        List<Object[]> l1 = em.createNativeQuery("SELECT t.name, p.meno FROM Teams t, Players p WHERE t.players.id = p.id").getResultList();

        return l1;
    }

}
