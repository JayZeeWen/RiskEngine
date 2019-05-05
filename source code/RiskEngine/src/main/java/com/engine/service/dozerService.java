package com.engine.service;

import ocm.engine.config.DozerConfig;

import org.dozer.Mapper;
import org.springframework.stereotype.Component;



@Component
public class dozerService {

	public static final Mapper dozerMapper;
	static{
		dozerMapper = DozerConfig.dozerBeanMapper();
	}
	
}