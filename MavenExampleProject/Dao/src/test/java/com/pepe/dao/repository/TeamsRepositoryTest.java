/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.repository;

import com.pepe.dao.init.ApplicationConfigDao;
import com.pepe.dao.model.Players;
import com.pepe.dao.model.Teams;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author peter
 */
//// testy POZOR NA KONVENCIE!!!!!!!!!!!
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfigDao.class, loader = AnnotationConfigContextLoader.class)
public class TeamsRepositoryTest {

    @Autowired
    TeamsRepository repo;

    @Test
    public void findAllTest() {

        assertTrue(repo.findAll().size() == 3);

    }

    @Test
    public void findByNameAndSkratkaTest() {

        List<Teams> result = repo.findByNameAndSkratka("dinosaury", "dino");

        assertTrue(result.get(0).getSkratka().equals("dino"));
    }

    @Test
    public void capitanNameTest() {
        String name = repo.findOne(1).getPlayers().getMeno();
        assertTrue(name.equals("peter"));
    }

    @Test
    public void numberOfPlayersTest() {
        int nm = repo.findOne(1).getPlayerses().size();

        assertTrue(nm == 3);

    }

    @Test
    public void createTeamTest() {
        Teams team = new Teams();
        team.setName("novy team");
        team.setSkratka("nt");

        repo.saveAndFlush(team); // uloz do dbs

        assertTrue(repo.findAll().size() == 4);

    }

    @Test
    public void setNameForSkratkaTest() {
        repo.setNameForSkratka("dinovia", "dino");

        assertTrue("dinovia".equals(repo.findOne(1).getName()));
    }

    @Test
    public void setNameForSkratkaTest2() {
        Teams team = repo.findOne(1);
        team.setName("dinovia");

        repo.saveAndFlush(team);

        assertTrue("dinovia".equals(repo.findOne(1).getName()));
    }

    ///pri vymazavani treba vynullovat vsetky constrainsy.... todo: najst lepsi sposob
    @Test
    public void deleteByNameTest() {
        Teams team = repo.findOne(1);
        for (Players p : team.getPlayerses()) {
            p.setTeams(null);
            p.setTeamses(null);
        }

        team.setPlayers(null);
        team.setPlayerses(null);
        repo.saveAndFlush(team);
        repo.deleteByName("dinosaury");

        assertTrue(repo.findAll().size() == 2);
    }
    
//        @Test
//    public void deleteTeamsTest() {
//        Teams team = repo.findOne(1);
//       repo.delete(team);
//
//        assertTrue(repo.findAll().size() == 2);
//    }

//    @Test
//    public void getCaptainNameTest(){
//        
//        assertTrue("ondovcik".equals(repo.vratKapitanName(repo.findOne(1))));
//    }
}
