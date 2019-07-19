package software.jsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import software.jsj.controllers.ConstructorInjectedController;
import software.jsj.controllers.MyController;
import software.jsj.controllers.PropertyInjectedController;
import software.jsj.controllers.SetterInjectedController;
import software.jsj.examplebeans.FakeDataSource;
import software.jsj.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class JsDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JsDiDemoApplication.class, args);
		
		MyController controller = (MyController)ctx.getBean("myController");
		
		/*System.out.println(controller.hello());
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());*/
		
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		
		System.out.println("User Name: " + fakeDataSource.getUser());
		System.out.println("Passsword: " + fakeDataSource.getPassword());
		System.out.println("Url: " + fakeDataSource.getUrl());
		
		System.out.println("\n");
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
        
        System.out.println("JMS User Name: " + fakeJmsBroker.getUserName());
        System.out.println("JMS Passsword: " + fakeJmsBroker.getPassword());
        System.out.println("JMS Url: " + fakeJmsBroker.getUrl());
        
        
	}

}
