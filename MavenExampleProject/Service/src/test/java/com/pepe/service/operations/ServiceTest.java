/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.service.operations;

import com.pepe.dao.init.ApplicationConfigDao;
import com.pepe.service.init.ApplicationConfigService;
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
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfigService.class,ApplicationConfigDao.class}, loader = AnnotationConfigContextLoader.class)
public class ServiceTest {
    
    @Autowired
   private ServiceImpl service;
    
    @Test
    public void test1(){
       int i = service.findAllsize();
       
       assertTrue(i==3);
    }
    
    @Test 
       public void test2(){
       String name = service.capitanName(1);
       assertTrue(name.equals("peter"));
    }
       
       @Test
       public void createTest(){
           service.createTeam("najTim", "naaaaaj");
       assertTrue(service.findAllsize() == 4);
       }
    
}
