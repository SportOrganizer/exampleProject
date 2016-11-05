/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.repository;

import com.pepe.dao.model.Teams;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author peter
 */
public class TeamsRepositoryCustomsImpl implements TeamsRepositoryCustoms {

   // @PersistenceContext
   // private EntityManager em;
    
  //  @Autowired
  //  TeamsRepository repo;
    
    @Override
    public String vratKapitanName(Teams team) {
    return "aaa";   
  //     return repo.findOne(team.getId()).getPlayers().getPriezvisko();
    }
    
    
}
