package com.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		//need auhtentification i'e login to access these resources(end points)
		.requestMatchers("/myAccount","/myBlance","/myLoans","/myCards").authenticated()
		//no auhtentification require to access below resource
		.requestMatchers("/notices","/contact").permitAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();
	}

}
