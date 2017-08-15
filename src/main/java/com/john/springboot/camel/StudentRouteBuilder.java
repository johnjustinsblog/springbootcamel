package com.john.springboot.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class StudentRouteBuilder extends RouteBuilder {
	
	
	@Autowired
	private Environment environment;

	@Override
	public void configure() throws Exception {
		
		//onException()
		from("direct:start")
		.routeId("Route process starts")
		.log("Process triggered")
		.setBody().simple("successfully triggered the process");
	}

}
