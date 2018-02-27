package tx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tx.service.AccountService;

public class AccountTest {
	
	@Test 
	public void testTransactionByXml() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
		AccountService accountService = (AccountService) context.getBean("userService");
		accountService.transferAccount("zhangsan", "lisi", 500);
	}
	
	@Test 
	public void testTransactionByAnnotation() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		AccountService accountService = (AccountService) context.getBean("userService");
		accountService.transferAccount("zhangsan", "lisi", 500);
	}
	
}
