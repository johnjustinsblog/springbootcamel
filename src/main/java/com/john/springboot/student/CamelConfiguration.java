package com.john.springboot.student;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;

import org.apache.camel.spring.SpringCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.john.springboot.exception.SpringBootCamelServiceException;

/**
 * @author John Justin
 * john@johnjustin.com
 *
 */

public class CamelConfiguration {
	
	private static final Logger LOG = LoggerFactory.getLogger(CamelConfiguration.class);
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private RoutesBuilder[] routesBuilders;
	
    @Bean
    public CamelContext camelContext() {
    	
    	CamelContext camelContext = new SpringCamelContext(applicationContext);
    	
    	LOG.info("camel context created :"+camelContext);
    	if(routesBuilders!= null) {
    		for(RoutesBuilder routesBuilder :routesBuilders) {
    			
    			try {
    				
    			}catch(Exception e) {
    				throw new SpringBootCamelServiceException("Exception occurered while creating camel context",e);
    			}
    		}
    	}
    	
		return camelContext;
    	
    	
    }
	
	

}
