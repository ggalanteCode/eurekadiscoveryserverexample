package com.soprasteria.eurekadiscoveryserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekadiscoveryserverexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekadiscoveryserverexampleApplication.class, args);
	}

}
