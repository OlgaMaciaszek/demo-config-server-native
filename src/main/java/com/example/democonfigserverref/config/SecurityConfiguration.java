package com.example.democonfigserverref.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Olga Maciaszek-Sharma
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf()
				.ignoringAntMatchers("/encrypt/**")
				.ignoringAntMatchers("/decrypt/**");

		super.configure(http);
	}
}