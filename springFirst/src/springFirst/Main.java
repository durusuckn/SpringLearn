package springFirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService=context.getBean("service", ICustomerService.class);
		customerService.add();
		//newleyemez burada...Constructorında parametre olduğundan dolayı bunu newleyemez burdan xml dosyasına gidiyoruz ve ordan devam.
		
		
		//CustomerManager manager=new CustomerManager(context.getBean("MySql", ICustomerDal.class));
		//manager.add();
		
		

	}

}
