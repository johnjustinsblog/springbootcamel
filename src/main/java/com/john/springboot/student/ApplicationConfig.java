package com.john.springboot.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author John Justin
 * john@johnjustin.com
 *
 */

@Configuration
public class ApplicationConfig implements EnvironmentAware{
	
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationConfig.class);
	
	@Autowired
	private Environment environment;


	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	

}
