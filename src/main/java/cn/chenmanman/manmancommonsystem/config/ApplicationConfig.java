package cn.chenmanman.manmancommonsystem.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.chenmanman.manmancommonsystem.mapper")
public class ApplicationConfig {
}
