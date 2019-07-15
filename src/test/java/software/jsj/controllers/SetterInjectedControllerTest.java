package software.jsj.controllers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import software.jsj.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
  
  private SetterInjectedController setterInjectedController;
  
  @Before
  public void setUp() throws Exception {
    this.setterInjectedController = new SetterInjectedController();
    this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  public void testSayHello() {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
  }

}
