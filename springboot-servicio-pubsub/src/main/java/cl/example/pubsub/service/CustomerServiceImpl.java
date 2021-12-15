package cl.example.pubsub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.example.pubsub.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public void save(Customer myCust) {
		clienteRest.postForObject("http://localhost:7001/addcustomer", myCust, String.class);
	}

}
