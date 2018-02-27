package aop.xml;

public class LoggingAspect {
	public void before() {
		System.out.println("开始计算");
	}
	
	public void after() {
		System.out.println("计算完毕");
	}
}
