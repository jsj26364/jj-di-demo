package software.jsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import software.jsj.controllers.ConstructorInjectedController;
import software.jsj.controllers.MyController;
import software.jsj.controllers.PropertyInjectedController;
import software.jsj.controllers.SetterInjectedController;

@SpringBootApplication
public class JsDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JsDiDemoApplication.class, args);
		
		MyController controller = (MyController)ctx.getBean("myController");
		controller.hello();
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
