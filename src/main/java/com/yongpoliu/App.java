package com.yongpoliu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

@Path("/api/pet")
@Api(value = "/pet", description = "Operations about pets", authorizations = {
    @Authorization(value = "petstore_auth",
        scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
}, tags = "pet")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class App {

  @GET
  @Path("/name")
  @ApiOperation(value = "Find pet by ID",
      notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions",
      response = Object.class,
      authorizations = @Authorization(value = "api_key")
  )
  @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
                          @ApiResponse(code = 404, message = "Pet not found") })
  public Response getByName(@ApiParam(name = "name") String name) {

    return null;
  }
}
