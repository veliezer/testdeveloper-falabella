package cl.example.pubsub.model;

import java.util.Date;

public class Customer {

	public Customer(int customer_id, String lastName, String firstName, String email, Date birth) {
		this.customer_id = customer_id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.birth = birth;
	}
	
	private int customer_id;
	private String lastName;
	private String firstName;
	private String email;
	private Date birth;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
