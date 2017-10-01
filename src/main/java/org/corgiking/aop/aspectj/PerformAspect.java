package org.corgiking.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.sun.javafx.scene.paint.GradientUtils.Point;

@Aspect
//@Component
public class PerformAspect {
	public static final String target = "execution(** org.corgiking.aop.aspectj.Performance.perform(..))";

	/**
	 * 定义切点
	 */
	@Pointcut("execution(** org.corgiking.aop.aspectj.Performance.perform(..))")
	public void pointPerform(){
		
	}
	
	/**
	 * 方法执行前执行
	 */
	@Before("execution(** org.corgiking.aop.aspectj.Performance.perform(..))")
	public void beforePerform1(){
		System.out.println("准备表演...before");
	}
	
	/**
	 * 环绕通知：
	 * 
	 */
	@Around("pointPerform()")//用切点
	public void around(ProceedingJoinPoint point){
		try {
			System.out.println("准备表演...around");
			point.proceed();
			System.out.println("表演结束...around");
		} catch (Throwable e) {
			System.out.println("表演事故...around");
		}
		System.out.println("回家次饭饭...around");
	}
	
	/**
	 * 方法返回后执行
	 */
	@AfterReturning(PerformAspect.target)
	public void afterReturn(){
		System.out.println("表演结束...afterReturn");
	}
	
	/**
	 * 抛出异常后执行
	 */
	@AfterThrowing(PerformAspect.target)
	public void exception(){
		System.out.println("表演事故...afterThrowing");
	}
	
	/**
	 * 返回或异常后执行
	 */
	@After(PerformAspect.target)
	public void beforePerform2(){
		System.out.println("回家次饭饭...after");
	}
	
	
	/**
	 * 定义带参数的切点时：
	 *     1.args中参数time必须和point方法的参数time保持一致
	 *     2.前置通知（其他通知也一样）before方法参数time必须和point切点方法参数保持一致
	 * @param time
	 */
	@Pointcut("execution(** org.corgiking.aop.aspectj.Performance.perform(int))" + "&& args(time)")
	public void point(int time) {//与args中time保持一致

	}

	@Before("point(time)")
	public void beforeByArgs(int time) {//与point中time保持一致
		System.out.println("参数为："+time);
		time=100;//不能改变传入被通知方法的参数
	}
	
}
