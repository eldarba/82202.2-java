package a;

public class MyThread extends Thread {
	
	public MyThread() {
	}
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("=== I was interrupted: " + getName());
//				i = 0;
				break;
			}
		}
		System.out.println("thread ended: " + getName());
	}

}
