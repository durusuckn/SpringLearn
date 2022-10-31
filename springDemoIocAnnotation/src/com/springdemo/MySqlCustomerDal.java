package com.springdemo;

import org.springframework.stereotype.Component;

//@Component("database") iki yere bunu eklersek hata vericektir
public class MySqlCustomerDal implements ICustomerDal {
	String connectionString;
	
	
	public void add() {
		System.out.println("Connection String: "+this.connectionString);
		System.out.println("MySQL");
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
