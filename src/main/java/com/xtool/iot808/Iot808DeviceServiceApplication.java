package com.xtool.iot808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Iot808DeviceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Iot808DeviceServiceApplication.class, args);
	}
}
