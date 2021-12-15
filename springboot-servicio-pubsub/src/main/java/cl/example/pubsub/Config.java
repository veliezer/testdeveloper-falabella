package cl.example.pubsub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@Bean("clienteRest")
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
