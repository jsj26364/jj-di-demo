/**
 * 
 */
package software.jsj.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import software.jsj.services.GreetingService;

/**
 * @author jsanyang
 *
 */
@Controller
public class ConstructorInjectedController {

  public GreetingService greetingService;
  
  public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }


  public String sayHello() {
    return greetingService.sayGreeting();
  }
  
}
