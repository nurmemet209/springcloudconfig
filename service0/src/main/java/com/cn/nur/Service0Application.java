package com.cn.nur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
public class Service0Application {

	public static void main(String[] args) {
		SpringApplication.run(Service0Application.class, args);
	}




}
