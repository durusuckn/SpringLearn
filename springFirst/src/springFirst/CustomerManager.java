package springFirst;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//constructor injection denir... 
	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}
	//public void setCustomerDal(ICustomerDal customerDal) {
	//	this.customerDal = customerDal;}
//Yukardaki kodu sadece setter injection kullanacağımız zaman kullanacağız ama bunu kullanmak önerilmez set metodunu sadece getiririz
	//getter setter metodundan ve xml dosyası ile devam edicez

	public void add() {
		
		customerDal.add();
		
	}

	
}
