package com.anz.wholesale.backend.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class AppConfig {

	/*
	 * @Bean public SecurityWebFilterChain securityWebFilterChain(
	 * ServerHttpSecurity http) { return http.authorizeExchange()
	 * .pathMatchers("/actuator/**").permitAll() .anyExchange().authenticated()
	 * .and().build(); }
	 */
	
	@Bean
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter
          = new CommonsRequestLoggingFilter();
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(false);
        filter.setAfterMessagePrefix("REQUEST DATA : ");
        return filter;
    }
}

