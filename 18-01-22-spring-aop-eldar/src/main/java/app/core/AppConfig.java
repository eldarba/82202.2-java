package app.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy // without this annotation there is no proxy
@PropertySource("application.properties")
public class AppConfig {

}
