package a;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("=== I was interrupted");
				i = 0;
//				break;
			}
		}
		System.out.println("thread ended");
	}

}
