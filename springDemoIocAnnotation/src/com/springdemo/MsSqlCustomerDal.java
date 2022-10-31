package com.springdemo;

import org.springframework.stereotype.Component;

@Component("database")
//Burada databasen bu olduğunu işaret ediyoruz ama yine mainde hata alırız çünkü xml dosyasında
//böyle bir bilgi yok bu bilgiyi oraya eklememiz gerekir.Dikkat ; konulmuyor tek yerde kullanılır.


public class MsSqlCustomerDal implements ICustomerDal {
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("Connection String: "+this.connectionString);
		System.out.println("MsSql");
	}

}
