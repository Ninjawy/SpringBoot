package com.training.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication is composed of :
 *	@EnableAutoConfiguration: enables Spring Boot's auto-configuration support;
 *  @ComponentScan: enables component scanning of current package and 
 *  				recursively scans sub-packages;
 *  @Configuration: is able to register extra beans with @Bean or import other
 *  
 * @SpringBootApplication:  Bootstraps the Spring Boot application, creating 
 * 							application context and registering all beans, 
 * 							starts the embedded server Tomcat.. etc.
 **/

@SpringBootApplication 
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
