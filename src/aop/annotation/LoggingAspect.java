package aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before(value = "execution(* aop.Calculator.*(..))")
	public void before() {
		System.out.println("开始计算");
	}
	
	@After(value = "execution(* aop.Calculator.*(..))")
	public void after() {
		System.out.println("计算完毕");
	}
}
