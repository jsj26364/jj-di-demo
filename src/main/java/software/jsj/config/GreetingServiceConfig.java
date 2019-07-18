package software.jsj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import software.jsj.services.GreetingRepository;
import software.jsj.services.GreetingService;
import software.jsj.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {
  
  @Bean
  GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
    return new GreetingServiceFactory(repository);
  }
  
  @Bean
  @Profile("en")
  @Primary
  GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("en");
  }
  
  @Bean
  @Profile("es")
  @Primary
  GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("es");
  }
  
  @Bean
  @Profile("de")
  @Primary
  GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("de");
  }

}
