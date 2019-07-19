package software.jsj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import software.jsj.examplebeans.FakeDataSource;

@Configuration@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
  
  @Autowired
  Environment env;
  
  @Value("${jsj.username}")
  String user;
  
  @Value("${jsj.password}")
  String password;
  
  @Value("${jsj.url}")
  String url;
  
  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    //fakeDataSource.setUser(user);
    //set this property either in Eclipse env variables, or OS env variables.
    fakeDataSource.setUser(env.getProperty("ENV_USERNAME"));  
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }
  
  //Get this bean onto the classpath so that Spring can wire everything up for us
  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    
    return propertySourcesPlaceholderConfigurer;
    
  }

}
