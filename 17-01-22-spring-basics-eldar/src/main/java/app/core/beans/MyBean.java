package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
	public int value;
	
	public MyBean() {
		System.out.println(">>> MyBean CTOR");
	}
	
	// actions to do after bean is constructed
	// a life cycle hook annotation - tells container to call this method after bean is fully constructed
	@PostConstruct
	public void doAfterConsrtuct() {
		System.out.println(">>>doAfterConsrtuct");
	}
	
	// actions to do before bean is destroyed
	// a life cycle hook annotation - tells container to call this method before bean is destroyed - container shut down 
	@PreDestroy
	public void doBeforeDestroy() {
		System.out.println(">>>doBeforeDestroy");
	}
	
	

}
