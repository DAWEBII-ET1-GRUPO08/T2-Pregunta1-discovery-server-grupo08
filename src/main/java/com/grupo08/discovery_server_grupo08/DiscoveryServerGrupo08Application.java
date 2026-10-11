package com.grupo08.discovery_server_grupo08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerGrupo08Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerGrupo08Application.class, args);
	}

}
