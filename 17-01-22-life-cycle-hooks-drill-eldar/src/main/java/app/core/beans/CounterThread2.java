package app.core.beans;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class CounterThread2 extends Thread implements InitializingBean, DisposableBean {
	
	private boolean on;
	
	@Override
	public void run() {
		int c = 1;
		while(on) {
			System.out.println(">>> " + c++);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// InitializingBean, DisposableBean are spring life cycle hook interfaces
	
	@Override
	public void afterPropertiesSet() throws Exception {
		on = true;
		start();
	}
	
	@Override
	public void destroy() {
		on = false;
	}


}
