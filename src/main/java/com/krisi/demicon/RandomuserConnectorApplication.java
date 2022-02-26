package com.krisi.demicon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class RandomuserConnectorApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(RandomuserConnectorApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
//	@Bean
//	public CommandLineRunner run() throws Exception {
//		return args -> {
//			scheduleFixedRateTaskAsync();		
//		};
//	}
//	
//	@Scheduled(fixedRate = 1000)
//    public void scheduleFixedRateTaskAsync() throws InterruptedException {
//        System.out.println(
//          "Fixed rate task async - " + System.currentTimeMillis() / 1000);
//    }
	
}
