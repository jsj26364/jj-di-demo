/**
 * 
 */
package software.jsj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import software.jsj.services.GreetingService;

/**
 * @author jsanyang
 *
 */
@Controller
public class PropertyInjectedController {

  /*
   * Shortcut: instead of using "@Qualifier, change the property name
   *  to camelCase of the implementation class, e.g. greetingServiceImpl 
   */
  @Autowired
  //@Qualifier("greetingServiceImpl")
  public GreetingService greetingServiceImpl;
  
  public String sayHello() {
    return greetingServiceImpl.sayGreeting();
  }
  
}
