package com.configServer.D_Configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DConfigServerApplication.class, args);
	}

}
