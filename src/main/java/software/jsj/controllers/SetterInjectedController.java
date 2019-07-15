/**
 * 
 */
package software.jsj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import software.jsj.services.GreetingService;
import software.jsj.services.GreetingServiceImpl;

/**
 * @author jsanyang
 *
 */
@Controller
public class SetterInjectedController {

  public GreetingService greetingService;
  
  @Autowired
  @Qualifier("setterGreetingService")
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }
  
  public String sayHello() {
    return greetingService.sayGreeting();
  }
  
}
