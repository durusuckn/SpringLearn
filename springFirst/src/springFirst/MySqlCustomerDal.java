package springFirst;

public class MySqlCustomerDal implements ICustomerDal {
	String connectionString;
	//Her yerde bunu yapmamız gerekir
	
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
