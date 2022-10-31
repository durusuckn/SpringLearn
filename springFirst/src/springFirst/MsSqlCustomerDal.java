package springFirst;

public class MsSqlCustomerDal implements ICustomerDal {
	String connectionString;
	//Aynı durumu tüm databaselerde yapmamız gerekir
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
