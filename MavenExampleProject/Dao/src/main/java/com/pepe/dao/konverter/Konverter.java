/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.dao.konverter;

import com.pepe.dao.dto.TeamsDto;
import com.pepe.dao.model.Teams;

/**
 *
 * @author peter
 */
public class Konverter {

    public static TeamsDto teamsDaoToDto(Teams team) {
        TeamsDto dto = new TeamsDto();
        dto.setId(team.getId());
        dto.setName(team.getName());
        return dto;
    }

}
