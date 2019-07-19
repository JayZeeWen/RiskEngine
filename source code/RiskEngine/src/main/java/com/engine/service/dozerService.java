package com.engine.service;

import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import com.engine.config.DozerConfig;



@Component
public class dozerService {

	public static final Mapper dozerMapper;
	static{
		dozerMapper = DozerConfig.dozerBeanMapper();
	}
	
}