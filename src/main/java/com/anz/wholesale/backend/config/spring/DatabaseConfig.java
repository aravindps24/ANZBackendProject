package com.anz.wholesale.backend.config.spring;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;


@Configuration
public class DatabaseConfig {

	@Autowired
	private DataConfigProperties configProperties;
	
	Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);
 
	@Bean
	@Profile(value = "prodA")
	public DataSource dataSource() {
		
		logger.debug("configProperties:" + configProperties.toString());
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    dataSource.setDriverClassName(configProperties.getDriverClassname());
	    dataSource.setUsername(configProperties.getUsername());
	    dataSource.setPassword(configProperties.getPassword());
	    dataSource.setUrl(configProperties.getUrl()); 
	    
	    return dataSource;
	}

	@Bean
	@Profile(value = "prodB")
	public DataSource dataSourcePostgreSql() {
		
		logger.debug("configProperties:" + configProperties.toString());
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    dataSource.setDriverClassName(configProperties.getDriverClassname());
	    dataSource.setUsername(configProperties.getUsername());
	    dataSource.setPassword(configProperties.getPassword());
	    dataSource.setUrl(configProperties.getUrl()); 
	    
	    return dataSource;
	}

	
	@Bean
	@Profile(value = "dev")
	public DataSource hsqldataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL)
				/*
				 * .addScript("classpath:db/changelog/DDL/DDL-001.sql")
				 * .addScript("classpath:db/changelog/DML/DML-001.sql")
				 */
				.build();

		return db;
	}
	 	
}
