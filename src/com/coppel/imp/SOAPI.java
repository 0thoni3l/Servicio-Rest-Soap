package com.coppel.imp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.core.Response;
import javax.xml.ws.RequestWrapper;

import com.coppel.dto.User;

@WebService

public interface SOAPI {
     
    @WebMethod
    public List<User> getUsers();
     
    @WebMethod
    @RequestWrapper(localName = "user", targetNamespace = "http://ejb.gateway.ebpp.com/", className = "com.coppel.dto")
    public void addUser(@WebParam(name = "user", targetNamespace = "")User user);
    
    @WebMethod
    public List<User> getUsersXML();
    @WebMethod
	List<User> getUsersJSON();
 
}
