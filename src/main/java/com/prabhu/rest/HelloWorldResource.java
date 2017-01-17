package com.prabhu.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * <p>
 *
 * </p>
 *
 * @author Prabhu R Babu (1/15/17 10:35 AM)
 */
@Path("/hello")
public class HelloWorldResource {

  @GET
  public String greeting(@QueryParam("name") String name){
    if(name == null) return "Hello World";
    else return "Hello " + name;
  }

}
