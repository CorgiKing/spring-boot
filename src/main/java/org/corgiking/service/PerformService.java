package org.corgiking.service;

import org.corgiking.aop.aspectj.Performance;
import org.springframework.stereotype.Service;

@Service
public class PerformService implements Performance {

	@Override
	public void perform() {
		System.out.println("表演开始");
	}

	@Override
	public void perform(int time) {
		System.out.println("表演开始："+time);
	}

}
