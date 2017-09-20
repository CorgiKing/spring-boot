package org.corgiking.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class DemoApi {
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
	
}
