package com.krisi.demicon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class RandomUsersClient {
	@Autowired
	public UsersRepository repository; 

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${randomusers.number.of.users}")
	public String numberOfUsers;
	
	@Value("${randomusers.api}")
	public String apiUrl;

    @Scheduled(fixedRateString = "${scheduler.fixed.rate}")
    public void doSomething() {
    	String url = apiUrl + "?results=" + numberOfUsers;
		RandomUsersResponse quote = restTemplate.getForObject(
				url, RandomUsersResponse.class);
		System.out.println(quote.toString());
		
		repository.saveAll(quote.results);
    }

}
