package com.ir.cs101.service;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ir.cs101.core.StringReverse;
import com.ir.cs101.core.impl.StringReverseFactory;

@Path("/stringreverse/")
public class ReverseStringService {
  
  @GET
  @Path("/simple/{stringToReverse}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getSimpleReverseOfString(@PathParam("stringToReverse") String stringToReverse) {
    
    StringReverse sr = StringReverseFactory.GetSimpleStringReverse();
    
    return Response.status(200).entity(sr.reverse(stringToReverse)).build();
  }
  
  @GET
  @Path("/recursive/{stringToReverse}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getRecursiveReverseOfString(@PathParam("stringToReverse") String stringToReverse) {
    
    StringReverse sr = StringReverseFactory.GetRecursiveStringReverse();
    
    return Response.status(200).entity(sr.reverse(stringToReverse)).build();
  }
  
  @GET
  @Path("/loop/{stringToReverse}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getLoopAndTempReverseOfString(@PathParam("stringToReverse") String stringToReverse) {
    
    StringReverse sr = StringReverseFactory.GetLoopAndTempStringReverse();
    
    return Response.status(200).entity(sr.reverse(stringToReverse)).build();
  }
  
  
  @GET
  @Path("/verify")
  @Produces(MediaType.TEXT_PLAIN)
  public Response verifyRESTService(InputStream incomingData) {
    String result = "ReverseStringService is running";
      return Response.status(200).entity(result).build();
  }
}
