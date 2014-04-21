package com.restful.java.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.restful.java.vo.ResultVO;

@Path("/v1/status/")
public class V1_Status {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Restful Web Service<p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String returnVersion() {
		ResultVO resultVO = new ResultVO();
		resultVO.setName("Karthik");
		resultVO.setAge(36);
		resultVO.setAddress("16 Arumugam St, puzhuthivakkam, chennai-91");
		return resultVO.toString();
	}
	
}
