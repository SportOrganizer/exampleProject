/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.repository;

import com.pepe.dao.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author peter
 */
@Repository
public interface PlayersRepository extends JpaRepository<Players, Integer>{
    
}
