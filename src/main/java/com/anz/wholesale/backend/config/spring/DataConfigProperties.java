package com.anz.wholesale.backend.config.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource") 
public class DataConfigProperties {

	private String username;
	private String password;
	private String platform;
	private String url;
	private String driverClass;

	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	String getUsername() {
		return username;
	}
	void setUsername(String username) {
		this.username = username;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	String getPlatform() {
		return platform;
	}
	void setPlatform(String platform) {
		this.platform = platform;
	}
	String getUrl() {
		return url;
	}
	void setUrl(String url) {
		this.url = url;
	}
	String getDriverClassname() {
		return driverClass;
	}
	void setDriverClassname(String driverClassname) {
		this.driverClass = driverClassname;
	}
	@Override
	public String toString() {
		return "DataConfigProperties [username=" + username + ", password=" + password + ", platform=" + platform
				+ ", url=" + url + ", driverClass=" + driverClass + "]";
	}
	
}
