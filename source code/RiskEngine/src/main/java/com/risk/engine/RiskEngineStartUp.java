package com.risk.engine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 风控引擎启动入口
 * @author Peter 马克
 *
 */
@Configuration
public class RiskEngineStartUp implements ApplicationListener<ContextRefreshedEvent>{
	
	/**
	 * spring context
	 */
	private static ApplicationContext  CONTEXT;

	/**
	 * 初始化这里执行
	 */
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		CONTEXT = event.getApplicationContext();
		
		RiskEngineContainer.init();
	}
	
	public static <T> T get(Class<T> clazz){
		return CONTEXT.getBean(clazz);
	}
	
	public static <T> T get(String beanName, Class<T> clazz){
		return CONTEXT.getBean(beanName,clazz);
	}

	public static ApplicationContext getCONTEXT() {
		return CONTEXT;
	}

	public static void setCONTEXT(ApplicationContext cONTEXT) {
		CONTEXT = cONTEXT;
	}

	
}
