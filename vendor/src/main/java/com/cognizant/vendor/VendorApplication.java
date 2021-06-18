package com.cognizant.vendor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication


public class VendorApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(VendorApplication.class);
	public static void main(String[] args) {
		
		LOGGER.info("The Application Started");
		SpringApplication.run(VendorApplication.class, args);
		
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
