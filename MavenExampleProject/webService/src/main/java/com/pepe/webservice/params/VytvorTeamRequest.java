/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.webservice.params;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author peter
 */
@XmlType(name ="VytvorTeamRequest")
@XmlRootElement(name = "vytvorTeamRequest")
public class VytvorTeamRequest {
 
  @XmlElement(name = "name")
  private String name;
  @XmlElement(name = "prezyvka")
  private String prezyvka;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrezyvka() {
        return prezyvka;
    }

    public void setPrezyvka(String prezyvka) {
        this.prezyvka = prezyvka;
    }
  
  
}
