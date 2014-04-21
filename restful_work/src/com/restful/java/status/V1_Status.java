package com.restful.java.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;

import com.restful.java.vo.ResultVO;

@Path("/v1/status/")
public class V1_Status {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Restful Web Service<p>";
	}
	
	@Path("/version/{versionno}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String returnVersion(@PathParam("versionno") String versionno) {
		JSONObject jsobject = new JSONObject();
		
		ResultVO resultVO = new ResultVO();
		resultVO.setVersion(versionno);
		resultVO.setName("Karthik");
		resultVO.setAge(36);
		resultVO.setAddress("16 Arumugam St, puzhuthivakkam, chennai-91");
		return resultVO.toString();
	}
	
	@Path("users/{username: [a-zA-Z][a-zA-Z_0-9]*}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getUserName(@PathParam("username") String userName, @QueryParam("country") String country) {
		System.out.println("Inside this method");
		return "Username : "+userName+"Country:"+country;
	}
	
}
