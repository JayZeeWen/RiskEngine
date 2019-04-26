package com.engine.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.engine.test.dao","com.engine.test"})
@ComponentScan(basePackages = {"com.engine.test.controller","com.risk.engine"})
public class TestApplication  {

	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
