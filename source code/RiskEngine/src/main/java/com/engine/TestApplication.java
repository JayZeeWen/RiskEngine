package com.engine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.engine.dao","com.engine"})
@ComponentScan(basePackages = {"com.engine.controller","com.risk.engine"})
public class TestApplication  {

	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
