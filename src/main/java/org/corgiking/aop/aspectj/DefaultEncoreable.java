package org.corgiking.aop.aspectj;

public class DefaultEncoreable implements Encoreable{

	@Override
	public void performEncore() {
		System.out.println("引入DefaultEncoreable");
	}

}
