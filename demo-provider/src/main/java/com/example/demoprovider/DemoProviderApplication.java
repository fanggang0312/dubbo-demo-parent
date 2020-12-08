package com.example.demoprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.example.demoprovider.mapper")
public class DemoProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoProviderApplication.class, args);
	}
}
