/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.service.init;

import com.pepe.dao.init.ApplicationConfigDao;
import com.pepe.service.operations.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author peter
 */
public class Main {
    
    public static void main(String[] args) {
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(ApplicationConfigService.class, 
                        ApplicationConfigDao.class); // pouzivam aj beany z DAO tak potrebujem zadefinovat
                                ///aj konfiguracny subor z DAO

        ServiceImpl service = ctx.getBean(ServiceImpl.class);
        service.createTeam("naajTim", "naj");
        

    }
    
}
