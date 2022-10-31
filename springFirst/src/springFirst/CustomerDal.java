package springFirst;

public class CustomerDal implements ICustomerDal {
	String connectionString;
	//bu her veri tabanına bağlanmak için farklı metin olur bu sebeple hepsinde ayrı tanımlama yapılabilir.her müşteriye
	//özel farklı veritabanı kullanıyor olabilir veya test veritabanı kullanılır ve değişken gösterilir kodları yeniden 
	//revize etmeden kullanabiliriz
	
 
@Override
public void add() {
	System.out.println("Connection String: "+this.connectionString);
	System.out.println("Oracle");
	
}


public String getConnectionString() {
	return connectionString;
}


public void setConnectionString(String connectionString) {
	this.connectionString = connectionString;
}

}
