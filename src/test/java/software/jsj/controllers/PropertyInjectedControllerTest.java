/**
 * 
 */
package software.jsj.controllers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import software.jsj.services.GreetingServiceImpl;

/**
 * @author jsanyang
 *
 */
public class PropertyInjectedControllerTest {

  private PropertyInjectedController propertyInjectedController;
  
  @Before
  public void setUp() throws Exception {
    this.propertyInjectedController = new PropertyInjectedController();
    this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
  }

  
  @Test
  public void testSayHello() {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
  }

}
