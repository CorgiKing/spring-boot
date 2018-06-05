package org.corgiking.api;

import org.corgiking.aop.aspectj.Encoreable;
import org.corgiking.aop.aspectj.Performance;
import org.corgiking.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoApi {
	
	@Autowired
	//这个一定要是接口,spring默认aop是基于接口的
	private Performance performService;
	
	@Autowired
	private TestDao testDao;
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
	
	@GetMapping("/perform")
	public String perform(){
		performService.perform();
		return "aop";
	}
	
	@GetMapping("/perform_t")
	public String perform_t(){
		performService.perform(1);
		return "aop";
	}
	
	@GetMapping("/perform_e")
	public String perform_e(){
		Encoreable encoreable = (Encoreable)performService;
		encoreable.performEncore();
		return "aop";
	}
	
	@GetMapping("/dao")
	public Integer dao(){
		return testDao.countUserNum();
	}
	
}
