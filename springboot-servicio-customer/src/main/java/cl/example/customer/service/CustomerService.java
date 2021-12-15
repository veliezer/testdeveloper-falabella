package cl.example.customer.service;

import java.util.List;

import cl.example.customer.model.Customer;

public interface CustomerService {
	
	public void save(Customer cust);
	public List<Customer> findAll();
	public Customer findById(int id);
}
