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
 * 							starts the embedded server Tomcat
 * So it works like this:
 * 	Main Spring Boot application class automatically component scans package and
 * 	sub-packages. Any other sub-packages we can give them any name under entity.
 * 	Scans everything in com.<SpringPackagesPath>.<Project> recursively.
 * 
 * Common Pitfall - Different location for packages could be outside the project
 * so they could be located somewhere else (e.g. com.training.util, 
 * org.acme.cart, edu.cmu.srs), so by default Spring Boot will not 
 * scan these packages. Only the packages of main Spring Boot application class
 * and sub-packages could be scanned by default.
 * 
 * To explicitly list the packages to scan we can do as the following:
 * 
 * @SpringBootApplication(
 * 		scanBasePackages={"com.training.util",
 * 						  "org.acme.cart",
 * 						  "edu.cmu.srs"})
 * 
 * instead of :
 * @SpringBootApplication
 **/

@SpringBootApplication 
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
