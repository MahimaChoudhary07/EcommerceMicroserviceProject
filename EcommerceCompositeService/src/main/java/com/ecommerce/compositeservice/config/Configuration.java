package com.ecommerce.compositeservice.config;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.setConnectTimeout(Duration.ofMillis(3000000))
				.setReadTimeout(Duration.ofMillis(3000000)).build();
	}
}
