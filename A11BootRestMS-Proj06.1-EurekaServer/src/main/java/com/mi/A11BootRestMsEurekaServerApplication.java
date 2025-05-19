package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class A11BootRestMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(A11BootRestMsEurekaServerApplication.class, args);
	}

}
