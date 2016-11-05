/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.webservice;

import com.pepe.service.operations.ServiceImpl;
import com.pepe.webservice.params.VytvorTeamRequest;
import com.pepe.webservice.params.VytvorTeamResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author peter
 */
@SuppressWarnings("deprecation")
@WebService(serviceName = "ServiceEndpoint")
public class ServiceEndpoint {

    @Autowired
    ServiceImpl service;

    @WebMethod
    @WebResult(name = "vytvorTeamResponse")
    public VytvorTeamResponse vytvorZiadost(
            @WebParam(name = "vytvorTeamRequst") VytvorTeamRequest request) {

        VytvorTeamResponse response = new VytvorTeamResponse();
        response.setTeam(service.createTeam(request.getName(), request.getPrezyvka()));

        return response;

    }

}
