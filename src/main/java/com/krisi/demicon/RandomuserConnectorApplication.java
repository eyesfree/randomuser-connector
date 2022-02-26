package com.krisi.demicon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RandomuserConnectorApplication {

	@Autowired
	public UsersRepository repository; 
	
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
					"https://randomuser.me/api/?results=10", RandomUsersResponse.class);
			System.out.println(quote.toString());
			
			repository.saveAll(quote.results);
		};
	}
	
}
