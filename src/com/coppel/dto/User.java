package com.coppel.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@XmlRootElement
@ApiModel(description = "Your comment")
public class User implements Serializable {
	 
    private static final long serialVersionUID = 1L;
 
    public static List<User> users = new ArrayList<>(Arrays.asList(
            new User("Rosa", "Marfil"), 
            new User("Pepito", "Grillo"), 
            new User("Manuela", "Río")));
	@ApiModelProperty(value = "nombre", required = true, example = "pancho villa")

    public String name;
	@ApiModelProperty(value = "nombre usuario", required = true, example = "JR")

    public String username;
 
    public User() {
        super();
    }
     
    public User(String name, String username) {
        super();
        this.name = name;
        this.username = username;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
     
     public static List<User> getUsers()
     {
         return users;
     }
 
}
