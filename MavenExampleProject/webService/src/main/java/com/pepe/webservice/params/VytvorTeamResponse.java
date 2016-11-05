/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.webservice.params;

import com.pepe.dao.dto.TeamsDto;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author peter
 */
@XmlType(name ="VytvorTeamResponse")
@XmlRootElement(name = "vytvorTeamResponse")
public class VytvorTeamResponse {
    
   private TeamsDto team;

    public TeamsDto getTeam() {
        return team;
    }

    public void setTeam(TeamsDto team) {
        this.team = team;
    }
   
   
    
}
