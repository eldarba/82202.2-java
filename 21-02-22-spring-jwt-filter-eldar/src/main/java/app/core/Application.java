package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import app.core.filters.MyFilter;
import app.core.jwt.util.JwtUtil;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	// register and map the filter in a filter container
	@Bean
	public FilterRegistrationBean<MyFilter> myFilter(JwtUtil jwtUtil){
		// container for registering filters
		FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		// register our filter - set the filter
		MyFilter myFilter = new MyFilter(jwtUtil);
		filterRegistrationBean.setFilter(myFilter);
		// map the filter to a url pattern
		filterRegistrationBean.addUrlPatterns("/api/*");
		// return the FilterRegistrationBean
		return filterRegistrationBean;
	}

}
