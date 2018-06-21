package org.corgiking.config.test;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TestProperties.class)
public class TestConfig {
	
	@Autowired
	private TestProperties prop;
	
	/**
	 * 打印出读取到的配置属性内容
	 */
	@PostConstruct
	public void test(){
		System.out.println("prop is "+prop);
	}
	
}
