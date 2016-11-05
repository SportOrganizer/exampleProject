/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.repository;

import com.pepe.dao.model.Teams;
import java.util.List;
import org.hibernate.annotations.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author peter
 */
@Repository
public interface TeamsRepository extends JpaRepository<Teams, Integer>/*, TeamsRepositoryCustoms*/ { ///<objekt, Typ Idcka>

     ////
////   vsetky implementovane metody a moznosti puzitia na tejto stranke
////    http://docs.spring.io/spring-data/jpa/docs/1.4.1.RELEASE/reference/html/jpa.repositories.html
////// dalsie info a pokrocilejsie moznosti pouzitia
////////////// http://docs.spring.io/spring-data/jpa/docs/current/reference/html/
    
    
    public List<Teams> findByNameAndSkratka(String name, String skratka); //vyhlada pomocou mena a skratky

    @Query("select t.id, LENGTH(t.name) as team_len from Teams t where t.name like ?1%") //// vrati List pole Objekt, poradie parametrov podla selectu
    public List<Object[]> findByNameAsArrayAndSort(String lastname, Sort sort); //////////// do sortu new Sort("{nazov premennej podla ktorej sa sortuje}");
//    .
//    .
//    .
//    .
//    .

    @Modifying /// anotujeme ak menime dbs
    @Query("update Teams t set t.name = ?1 where t.skratka = ?2") /// pouzivame speci query nie typicke sql.. odkazujeme sa na objekt Shop
    public int setNameForSkratka(String name, String skratka);       // a nasledne volime presne paramaetre, ktore mame v objekte Shop v jave
                                                                    ///?1 prvy parameter, ?2 druhy parameter

    @Modifying
    @Query("update Teams t set t.name = :name where t.skratka = :skratka ") /// mozme pouzit aj param
    public int setNameForSkratka2(@Param("name") String name, @Param("skratka") String skratka);

    @Modifying
    @Transactional
    @Query("delete from Teams t where t.name = :name")
    public void deleteByName(@Param("name") String name);

}
