package cl.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.example.customer.model.Customer;
import cl.example.customer.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@PostMapping("/addcustomer")
	public void addCustomer(@RequestBody Customer cust) {
		custService.save(cust);
	}
	
	@GetMapping("/list")
	public List<Customer> listAllCustomers() {
		return custService.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return custService.findById(id);
	}

}
