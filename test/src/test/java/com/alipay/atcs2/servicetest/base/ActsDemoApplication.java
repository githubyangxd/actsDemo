package com.alipay.atcs2.servicetest.base;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:META-INF/spring/acts-core.xml"})
//@ComponentScan(basePackages = {"com.*"})
public class ActsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActsDemoApplication.class, args);
	}

}
