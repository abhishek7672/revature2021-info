package com.revature.model;

import java.util.ArrayList;
import java.util.List;

public class Datamanager {
		private static List<Customer> customerlist=new ArrayList<>();
		static {
			customerlist.add(new Customer("john","smith","john","1234"));
		}
		public  static void  addcustomer(Customer customer) {
			customerlist.add(customer);
		}
		public static Customer getcustomer(String email) {
			for(Customer customer :customerlist)
				if(customer.getEmail().equals(email)){
					
				
					return customer;
				}
					
						return null;
					}
		}


