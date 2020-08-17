package com.coppel.imp;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.coppel.dto.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@WebService(endpointInterface = "com.coppel.imp.SOAPI",
			targetNamespace = "http://ejb.test.autopayment.ebpp.tess.com/", 
			serviceName = "ApplicationBusinessFacadeService", 
			portName = "ApplicationBusinessFacadePort")
@Path(value = "/")
@Api(tags= {"EcommerceTestSoap"})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class SOAPImpl implements SOAPI{
 
    @Override
    @GET
    @Path("/validarOTPEmail")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="Metodo dummy", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	@ApiResponses(value = {
			@ApiResponse(code=200, message="OK"),
			@ApiResponse(code=400, message="ERROR")
			})
    public List<User> getUsers() {
        return User.getUsers();
    }
 
    @Override
    @POST
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="Metodo dummy", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	@ApiResponses(value = {
			@ApiResponse(code=200, message="OK"),
			@ApiResponse(code=400, message="ERROR")
			})
    public void addUser(User user) {
        User.getUsers().add(user);
    }

	@Override
	@GET
	@Path("/getUserXml")
	@Produces(MediaType.APPLICATION_XML)
	@ApiOperation(value="Metodo dummy", consumes=MediaType.APPLICATION_XML,produces=MediaType.APPLICATION_XML)

	public List<User> getUsersXML() {
		return User.getUsers();
	}

	@Override
	public List<User> getUsersJSON() {
		// TODO Auto-generated method stub
		return null;
	}

 
}

