package cl.example.customer.dao;

import org.springframework.data.repository.CrudRepository;

import cl.example.customer.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{

}
