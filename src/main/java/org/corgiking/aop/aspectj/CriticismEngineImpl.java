package org.corgiking.aop.aspectj;

import org.springframework.stereotype.Component;

@Component
public class CriticismEngineImpl implements CriticismEngine {

	@Override
	public String getCriticism() {
		return "苛刻的评论！";
	}
	

}
