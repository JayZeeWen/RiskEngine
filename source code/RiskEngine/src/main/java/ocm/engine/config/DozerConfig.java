package ocm.engine.config;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

public class DozerConfig {

	@Bean(name = "dozerBeanMapper")
    public Mapper dozerBeanMapperFactoryBean(@Value("classpath*:dozer/dozer-mapping.xml") Resource[] resources) throws Exception {
        final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        return dozerBeanMapperFactoryBean.getObject();
    }
	
	public static DozerBeanMapper dozerBeanMapper() {
		List<String> mappingFiles = Arrays.asList("dozer/dozer-mapping.xml");
		

	    DozerBeanMapper dozerBean = new DozerBeanMapper();
	    dozerBean.setMappingFiles(mappingFiles);
	    return dozerBean;
	}
}
