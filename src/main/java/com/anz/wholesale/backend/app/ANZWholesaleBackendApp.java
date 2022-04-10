package com.anz.wholesale.backend.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ConfigurationPropertiesScan("com.baeldung.configurationproperties")
@ComponentScan(basePackages = "com.anz.wholesale.backend")
@EnableJpaRepositories(basePackages = "com.anz.wholesale.backend.data.repository")
@EntityScan("com.anz.wholesale.backend.data.entity") 
public class ANZWholesaleBackendApp {
	
	public static void main(String[] args) {   
        SpringApplication.run(ANZWholesaleBackendApp.class, args); 
    } 
	
}
