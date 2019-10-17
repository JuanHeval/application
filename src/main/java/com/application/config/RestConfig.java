package com.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
	@Bean("ClientRest")
	public RestTemplate registryRestTemplate() {
		return new RestTemplate();
	}

}
