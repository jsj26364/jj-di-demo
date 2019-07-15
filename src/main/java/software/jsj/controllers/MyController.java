package software.jsj.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import software.jsj.services.GreetingService;

@Controller
public class MyController {
	
  private GreetingService greetingService;
  
  /*public MyController(@Qualifier("primaryGreetingService")GreetingService greetingService) {
    this.greetingService = greetingService;
  }*/
  
  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String hello() {
		String greeting = "Hello!!!";
		System.out.println(greeting);
		
		return greetingService.sayGreeting();
	}

}
