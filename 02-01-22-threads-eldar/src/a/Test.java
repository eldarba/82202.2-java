package a;

public class Test {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		System.out.println("=== is t1 alive? " + t1.isAlive());
		
		// print NEW state
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println("=== is t1 alive? " + t1.isAlive());
		System.out.println("=== is t1 interrupt? " + t1.isInterrupted());
		// print RUNNABLE state
		System.out.println(t1.getState());
		
		try {
			// main waits for t1 to be in sleep
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// print TIMED_WAITING state
		System.out.println(t1.getState());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
		
		
		// main waits for t1 to die
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// print TERMINATED state
		System.out.println(t1.getState());
		System.out.println("=== is t1 alive? " + t1.isAlive());

	}

}
