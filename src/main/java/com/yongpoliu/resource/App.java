package com.yongpoliu.resource;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import com.yongpoliu.data.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/api/pet")
@Api(value = "/pet", description = "Operations about pets", tags = "pet")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class App {

  @GET
  @Path("/name")
  @ApiOperation(value = "Find pet by ID",
      notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions",
      response = Book.class)
  @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
                          @ApiResponse(code = 404, message = "Pet not found") })
  public Response getByName(@ApiParam(name = "name") String name) {
    Book book = new Book();
    book.setTitle("Java Concurrency In Practice");
    return Response.ok(book).build();
  }
}
