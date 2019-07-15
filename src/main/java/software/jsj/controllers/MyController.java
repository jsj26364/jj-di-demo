package software.jsj.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello() {
		String greeting = "Hello!!!";
		System.out.println(greeting);
		
		return greeting;
	}

}
