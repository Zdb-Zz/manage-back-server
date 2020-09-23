package com.zdb.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ServletComponentScan
@MapperScan("com.zdb.demo.mapper")
@SpringBootApplication(scanBasePackages = "com.zdb.demo")
@EnableScheduling
public class ZdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZdbApplication.class, args);
	}

}
