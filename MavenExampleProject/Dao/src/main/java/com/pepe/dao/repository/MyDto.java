/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.repository;

import com.mysema.query.annotations.QueryProjection;

/**
 *
 * @author peter
 */

public class MyDto  {

    String name;
    String captain;

    public MyDto() {
    }

    @QueryProjection
    public MyDto(String name, String captain) {
        this.name = name;
        this.captain = captain;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }
    
    
}
