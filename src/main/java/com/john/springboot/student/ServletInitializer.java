/**
 * 
 */
package com.john.springboot.student;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author John Justin
 * john@johnjustin.com
 *
 */
public class ServletInitializer extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		return application.sources(SpringBootCamelApplication.class);
	}
	@Override
	public void onStartup(ServletContext container) throws ServletException{
		super.onStartup(container);
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(context));
		registration.setLoadOnStartup(1);
	}
}
