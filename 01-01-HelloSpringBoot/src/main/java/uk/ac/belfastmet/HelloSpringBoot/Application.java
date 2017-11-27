package uk.ac.belfastmet.HelloSpringBoot;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	
	
	private static final Logger logger = LoggerFactory.getlogger(Application.class);


	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
		logger.info("Hello Spring Boot");
		
		
	}
	
}
