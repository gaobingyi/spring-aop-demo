package test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Calculator;

class CalculatorTest {

	@Test
	void testAOPByXml() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
		Calculator caculator = (Calculator) context.getBean("calculator");
		caculator.calc();
	}
	
	@Test
	void testAOPByAnnotation() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		Calculator caculator = (Calculator) context.getBean("calculator");
		caculator.calc();
	}

}
