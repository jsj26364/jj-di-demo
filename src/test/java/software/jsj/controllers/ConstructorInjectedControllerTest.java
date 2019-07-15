package software.jsj.controllers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import software.jsj.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

  private ConstructorInjectedController constructorInjectedController;
  
  @Before
  public void setUp() throws Exception {
    this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  public void testSayHello() {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
  }

}
