package org.corgiking.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.corgiking.dao")
public class MyBatisConfig {

}
