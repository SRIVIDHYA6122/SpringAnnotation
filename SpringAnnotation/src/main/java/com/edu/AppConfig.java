package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Stuudent getStuudent() {
		return new Stuudent();
	}
	@Bean
	public Course getCourse() {
		return new  SnapDragon();
	}

}
