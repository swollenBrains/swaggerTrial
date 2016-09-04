package com.trials.service;

import com.google.common.net.MediaType;
import io.swagger.annotations.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/message")
@Api(value = "/message", description = "Rest api for do operations on admin", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public class MessageRestService {

	@GET
	@Path("/hello")
	@ApiOperation(value = "Get specific admin", httpMethod = "GET", notes = "Fetch the admin user details", response = Response.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Given admin user found")})
	public Response printMessage() {
		String result = "Restful example hello";
		return Response.status(200).entity(result).build();
	}

}
