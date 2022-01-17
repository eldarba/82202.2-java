package app.core.beans;

import java.util.concurrent.TimeUnit;

//@Component
public class CounterThread extends Thread {
	
	private boolean on;
	
	@Override
	public void run() {
		int c = 1;
		while(on) {
			System.out.println(c++);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// @PostConstruct and @PreDestroy are not spring annotations. But can be used in Spring
	
//	@PostConstruct
	public void construct() {
		on = true;
		start();
	}
	
//	@PreDestroy
	public void destroy() {
		on = false;
	}

}
