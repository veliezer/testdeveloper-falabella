package cl.example.pubsub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.example.pubsub.model.Customer;
import cl.example.pubsub.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService custService;
	
	@PostMapping("/saveCustomer")
	public void save(@RequestBody Customer myCust) {
		custService.save(myCust);
	}
}
