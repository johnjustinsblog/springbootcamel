/**
 * 
 */
package com.john.springboot.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author John Justin
 * john@johnjustin.com
 *
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})
@PropertySource("classpath:springbootcamel.properties")
public class SpringBootCamelApplication {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootCamelApplication.class);
	public static void main(String[] args) {
		LOG.info(" application starting...");
		SpringApplication.run(SpringBootCamelApplication.class, args);

	}

}
