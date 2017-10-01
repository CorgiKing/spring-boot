package org.corgiking.aop.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CriticAspect {
	
	@Pointcut("execution(** org.corgiking.aop.aspectj.Performance.perform(..))")
	public void pointPerform(){}
	
	@After("pointPerform()")
	public void afterPerform(){
		System.out.println(criticismEngine.getCriticism());
	}
	
	private CriticismEngine criticismEngine;

	@Autowired
	public void setCriticismEngine(CriticismEngine criticismEngine) {
		this.criticismEngine = criticismEngine;
	}

}
