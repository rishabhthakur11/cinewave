package com.cinewave.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig 
{
	@Bean
    PasswordEncoder passwordEncoder() 
	{
        return new BCryptPasswordEncoder();
    }
	
	@Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception 
	{
        return builder.getAuthenticationManager();
    }
}
