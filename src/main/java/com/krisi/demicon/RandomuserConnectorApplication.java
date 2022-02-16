package com.krisi.demicon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RandomuserConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomuserConnectorApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			RandomUsersResponse quote = restTemplate.getForObject(
					"https://randomuser.me/api/", RandomUsersResponse.class);
			System.out.println(quote.toString());
		};
	}
	
}
