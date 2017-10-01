package org.corgiking.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncorePerformAspect {

	/**
	 * 借助AOP引入新功能
	 */
	@DeclareParents(value="org.corgiking.aop.aspectj.Performance+",//“+” 号，表示只要是Performance及其子类都可以添加新的方法
			defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
	
}
