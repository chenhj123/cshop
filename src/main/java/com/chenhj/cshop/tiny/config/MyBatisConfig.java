package com.chenhj.cshop.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.chenhj.cshop.tiny.mbg.mapper")
public class MyBatisConfig {
}
