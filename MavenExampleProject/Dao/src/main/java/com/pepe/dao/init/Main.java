/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.init;

import com.pepe.dao.repository.TeamsRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author peter
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(ApplicationConfigDao.class);

        TeamsRepository repo = ctx.getBean(TeamsRepository.class);
//        String name = repo.findOne(1).getName();
//        System.out.println(name);

    }

}
