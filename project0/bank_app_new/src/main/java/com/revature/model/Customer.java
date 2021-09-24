package com.revature.model;

public class Customer {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String  password ;
	private static long count=0;
	public Customer( String firstname, String lastname, String email, String password) {
		super();
		count++;		
		this.id = count;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	

	public Customer() {
		
	}
	public long getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public static long getCount() {
		return count;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
	

	

}
