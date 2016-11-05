/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.service.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author peter
 */
@Configuration  // konfiguracny subor
@ComponentScan("com.pepe.service") /// v ktorych packages hladam beany
public class ApplicationConfigService {
    
}
